package com.automation.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
  @FindBy(name = "q")
  private WebElement searchBox;

  @FindBy(xpath = "//textarea[@name='q']//following::input[@value='Google Search'][2]")
  private WebElement searchBtn;

  public HomePage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  public void navigate() {
    driver.get("https://www.google.com/");
  }

  public void searchWith(String term) throws InterruptedException {
    searchBox.sendKeys(term);
    Thread.sleep(500);
    Actions actions = new Actions(driver);
    actions.sendKeys(Keys.ESCAPE).build().perform();
  }

  public void searchedWith(String term) throws InterruptedException {
    searchWith(term);
    searchBtn.click();
  }
}
