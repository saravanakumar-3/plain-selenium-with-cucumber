package com.automation.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

import com.automation.pages.SearchResultsPage;
import io.cucumber.java.en.Then;
import java.util.List;

public class SearchResultsStepDef extends BaseStefDef {
  SearchResultsPage searchResultsPage;

  @Then("validate the search results page")
  public void validateTheSearchResultsPage() {
    searchResultsPage = new SearchResultsPage(driver);
    List<String> suggestionsList = searchResultsPage.getSuggestionsList();
    assertThat(suggestionsList, hasItem("Step by step"));
  }
}
