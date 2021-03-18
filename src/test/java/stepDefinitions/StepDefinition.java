package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class StepDefinition {
  
  @Given("^User is on landing page$")
  public void user_is_on_netbanking_landing() {
    // code to navigate to landing page
    System.out.println("Navigate to login url");
  }
  
  @When("^User login into application with username and password$")
  public void login() {
    //code to login using username and password
    System.out.println("user logins successfully");
  }
  @Then("^Home page is populated$")
  public void home_page_is_populated()  {
      System.out.println("Validated homepage");
  }

  @And("^Cars are displayed$")
  public void cars_are_displayed()  {
    System.out.println("Validated cards");
  }

}
