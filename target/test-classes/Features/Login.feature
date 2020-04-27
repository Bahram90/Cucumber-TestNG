Feature: Reset functionality on login page of Application

  @test
  Scenario Outline: Verification of Reset button

    Given launch the application
    When As a user I want to search phone <phoneModel> and methodName <methodName>
    Then Reset the credential

    Examples:
      | phoneModel | methodName |
      | guru99     | searchItem |