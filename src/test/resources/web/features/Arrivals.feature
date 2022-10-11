@Arrivals
Feature: As a potential client i need to search the website and check Arrivals

  Background:
    Given The client is in Practice page
    And The client clicks on Shop Button

  @Smoke
  Scenario: The client sees only three Arrivals in the Home Page
    When  The client clicks on Home menu button
    Then The client verify that results are shown properly

  @Smoke
  Scenario: The client navigates images in Arrivals
    When  The client clicks on Home menu button
    And The client checks that results are shown properly
    And The client clicks on Arrival Image
    Then The client is in Product page

    @Smoke
  Scenario: The client navigates sees Arrivals description
    When  The client clicks on Home menu button
    And The client checks that results are shown properly
    And The client clicks on Arrival Image
    And The client is in Product page
    And The client clicks on Description tab
    Then The client sees a description

