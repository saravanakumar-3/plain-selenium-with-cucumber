package com.automation.steps;

import com.automation.utils.PropertiesUtil;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseStefDef {
  protected static Properties properties = PropertiesUtil.getProperties();
  protected static WebDriver driver;

  public static void initDriver() {
    String browserName = properties.get("browser.name").toString();
    switch (browserName) {
      case "chrome":
        driver = new ChromeDriver();
        break;
      case "firefox":
        driver = new FirefoxDriver();
    }
    driver.manage().window().maximize();
  }
}
