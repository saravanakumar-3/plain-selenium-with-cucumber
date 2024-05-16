package com.automation.pages;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {
  @FindBy(xpath = "//*[@role='list']//a/div/span")
  List<WebElement> suggestions;

  public SearchResultsPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  public List<String> getSuggestionsList() {
    return suggestions.stream().map(WebElement::getText).collect(Collectors.toList());
  }
}
