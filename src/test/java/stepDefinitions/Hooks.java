package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

  @Before("@MobileTest")
  public void beforeValidation() {
    System.out.println("Running before mobiletest");
  }
  @After("@MobileTest")
  public void afterValidation() {
    System.out.println("Running after mobiletest");
  }
}
