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
  
  @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
  public void login(String user, String password) {
    //code to login using username and password
    System.out.println(String.format("user logins %s/%s successfully",user,password));
  }
  @Then("^Home page is populated$")
  public void home_page_is_populated()  {
      System.out.println("Validated homepage");
  }

 
  @And("^Cars displayed are \"([^\"]*)\"$")
  public void cars_displayed_are_something(String isDisplayed) throws Throwable {
      System.out.println(String.format("Cars displayed are %s", isDisplayed));
  }

}
