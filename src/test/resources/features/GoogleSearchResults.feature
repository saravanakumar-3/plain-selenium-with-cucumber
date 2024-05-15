Feature: Google search results

  @123
  Scenario: Validate the google search results
    Given navigate to google home page
    When searched with term 'how to build a wall'
    Then validate the search results page