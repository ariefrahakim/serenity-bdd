Feature: Login Orange HRM

  @SuccessLogin
  Scenario Outline: Success Login Orange HRM
    Given Go to the website login
    When user input valid username
    And user input valid password
    And user click login button
    Then user can landing on home page


