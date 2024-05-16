package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageStepDef extends BaseStefDef {
  HomePage homePage;
  @Given("navigate to google home page")
  public void navigateToGoogleSearchPage() {
    homePage = new HomePage(driver);
    homePage.navigate();
  }

  @When("searched with term {string}")
  public void searchedWithTermHowToBuildAWall(String term) throws InterruptedException {
    homePage.searchedWith(term);
  }
}
