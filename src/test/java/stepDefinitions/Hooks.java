package stepDefinitions;

import Cucumber.Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{

  @Before("@MobileTest")
  public void beforeValidation() {
    System.out.println("Running before mobiletest");
  }
  @After("@MobileTest")
  public void afterValidation() {
    System.out.println("Running after mobiletest");
  }
  @After("@SeleniumTest")
  public void afterSelenium() {
    driver.close();
  }
}
