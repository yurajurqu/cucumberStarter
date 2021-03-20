package stepDefinitions;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefinitions {

  public WebDriver driver;
  
  @Given("^User is on GreenKart Landing page$")
  public void user_is_on_greenkart_landing_page() throws Throwable {
      System.setProperty("webdriver.chrome.driver", "C:\\apps\\chromedriver.exe");
      driver = Base.getDriver();
  }

  @When("^User searched for \"([^\"]*)\" Vegetable$")
  public void user_searched_for_something_vegetable(String searchString) throws Throwable {
      driver.findElement(By.xpath("//input[@type='search']")).sendKeys(searchString);
      Thread.sleep(3000);
  }

  @Then("^\"([^\"]*)\" results are displayed$")
  public void something_results_are_displayed(String searchString) throws Throwable {
      assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(searchString));
  }
  
  @Then("^verify selected \"([^\"]*)\" items are displayed in the checkout page$")
  public void verify_selected_something_items_are_displayed_in_the_checkout_page(String search) throws Throwable {
    
    assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(search));
  }

  @And("^Added items to cart$")
  public void added_items_to_cart() throws Throwable {
    driver.findElement(By.cssSelector("a.increment")).click();
    driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
  }

  @And("^User proceeded to checkout page$")
  public void user_proceeded_to_checkout_page() throws Throwable {
    driver.findElement(By.cssSelector("a.cart-icon")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
  }
}
