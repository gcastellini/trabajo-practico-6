@Login
Feature: As a potential client i need to log into the website

  Background:
    Given The client is in Practice page
    And The client clicks on My Account button

  @Smoke
  Scenario Outline: The client logs in with valid username and password
    When The client enters email <email> and password <password>
    Then The client is logged in successfully
    Examples:
      | email                           |  | password   |
      | giuliana_castellini@hotmail.com |  | Crowdar22! |

  @Smoke
  Scenario Outline: The client logs in incorrect username and password
    When The client enters email <email> and password <password>
    Then The client sees error message
    Examples:
      | email                     |  | password  |
      | gcastellini1994@gmail.com |  | Crowdar1! |
