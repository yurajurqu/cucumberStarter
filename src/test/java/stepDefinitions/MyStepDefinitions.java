package stepDefinitions;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefinitions {

  WebDriver driver;
  @Given("^User is on GreenKart Landing page$")
  public void user_is_on_greenkart_landing_page() throws Throwable {
      System.setProperty("webdriver.chrome.driver", "C:\\apps\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
  }

  @When("^User searched for \"([^\"]*)\" Vegetable$")
  public void user_searched_for_something_vegetable(String searchString) throws Throwable {
      driver.findElement(By.xpath("//input[@type='search']")).sendKeys(searchString);
      Thread.sleep(3000);
  }

  @Then("^\"([^\"]*)\" results are displayed$")
  public void something_results_are_displayed(String searchString) throws Throwable {
      assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(searchString));
      driver.close();
  }
}
