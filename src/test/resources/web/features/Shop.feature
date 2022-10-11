@Shop
Feature: As a potential client i need to shop in the website

  Background:
    Given The client is in Practice page
    And The client clicks on Shop Button

  @Smoke
    Scenario: The client uses Read More functionality
      When The client clicks on Read More
      Then The client sees Out of Stock message

  @Smoke
      Scenario: The client filter by Product Category
        When The client clicks on Product Category Android
        Then The client sees only Android products
