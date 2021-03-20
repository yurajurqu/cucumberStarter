package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

  WebDriver driver;
  
  public HomePage(WebDriver driver) {
    this.driver = driver;
  }
  By search=   By.xpath("//input[@type='search']");
  
  public WebElement getSearch() {
    return this.driver.findElement(search);
  }
  
}
