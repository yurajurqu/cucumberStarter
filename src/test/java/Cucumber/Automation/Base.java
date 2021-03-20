package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

  public static WebDriver driver;
  public static Properties prop;

  public static WebDriver getDriver() throws IOException {
    System.setProperty("webdriver.chrome.driver", "C:\\apps\\chromedriver.exe");
    driver = new ChromeDriver();
    FileInputStream fis = new FileInputStream("C:\\wsnuevoclaro2\\Automation\\src\\test\\java\\Cucumber\\Automation\\global.properties");
    prop = new Properties();
    prop.load(fis);
    driver.get(prop.getProperty("url"));
    return driver;
  }
}
