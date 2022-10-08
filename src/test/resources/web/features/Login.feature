@Login
Feature: As a potential client i need to log into the website

  Background:
    Given The client is in Practice page
    When The client clicks on My Account button

    Scenario Outline: The client logs in with valid username and password
      And The client enters email <email> and password <password>
      Then The client is logged in successfully
      Examples:
        |email||password|
        |giuliana_castellini@hotmail.com||Crowdar22!|

      @prueba2
  Scenario Outline: The client logs in incorrect username and password
    And The client enters email <email> and password <password>
    Then The client sees error message
    Examples:
      |email||password|
      |gcastellini1994@gmail.com||Crowdar1!|
