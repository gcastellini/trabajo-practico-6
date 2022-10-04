Feature: As a potential client i need to search the website and check Arrivals

  @Smoke
  Scenario: The client clicks on Arrival
    Given The client is in Practice page
    When The client clicks on Shop Button
    And  The client clicks on Home menu button
    Then The client verify that results are shown properly

