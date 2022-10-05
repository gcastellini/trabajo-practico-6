Feature: As a potential client i need to search the website and check Arrivals

  Background:
    Given The client is in Practice page

  @Smoke
  Scenario: The client sees only three arrivals
    When The client clicks on Shop Button
    And  The client clicks on Home menu button
    Then The client verify that results are shown properly

  @Smoke
  Scenario: The client navigates images in arrivals
    When The client clicks on Shop Button
    And  The client clicks on Home menu button
    Then The client verify that results are shown properly
    When The client clicks on Arrival Image
    Then The client is in Product page

  Scenario: The client navigates images in arrivals
    When The client clicks on Shop Button
    And  The client clicks on Home menu button
    Then The client verify that results are shown properly
    When The client clicks on Arrival Image
    Then The client is in Product page
    And The client clicks on Description tab
    Then The client sees a description

