Feature: User search on bing engine

  @automation @web @bing
  Scenario: Simple Bing Search AWS phrase
    Given user is on the bing page
    When the search phrase "AWS" is entered
    Then results for "AWS" are shown

  @automation @web @bing
  Scenario: Simple Bing Search Terraform phrase
    Given user is on the bing page
    When the search phrase "Terraform" is entered
    Then results for "Terraform" are shown
