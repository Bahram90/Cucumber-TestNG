
Feature: Reset functionality on login page of Application

@test
  Scenario Outline: Verification of Reset button

    Given launch the application
    When As a user I want to search phone <phoneModel>
    Then Reset the credential

    Examples:
    |phoneModel|
    |Iphone   |