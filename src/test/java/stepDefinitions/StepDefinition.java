package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
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
  
  @When("^User sign up with following details$")
  public void user_sign_up_with_following_details(DataTable data) throws Throwable {
      List<List<String>> obj = data.asLists();
      System.out.println(obj.get(0).get(0));
      System.out.println(obj.get(0).get(1));
      System.out.println(obj.get(0).get(2));
      System.out.println(obj.get(0).get(3));
      System.out.println(obj.get(0).get(4));
  }
  
  @When("^User logins into application with username (.+) and password (.+)$")
  public void user_login_into_application_with_username_and_password(String username, String password) throws Throwable {
      System.out.println(String.format("Logging in user %s with pass %s", username, password));
  }
  
  @Given("^validate the browser$")
  public void validate_the_browser() throws Throwable {
      System.out.println("validate browser");
  }

  @When("^browser is triggerd$")
  public void browser_is_triggerd() throws Throwable {
      System.out.println("trigger browser open");
  }

  @Then("^check if the browser is started$")
  public void check_if_the_browser_is_started() throws Throwable {
      System.out.println("browser is started");
  }
}
