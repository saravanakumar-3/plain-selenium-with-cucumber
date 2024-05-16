package com.automation.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseStefDef {
  protected static WebDriver driver;

  public static void initDriver() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }
}
