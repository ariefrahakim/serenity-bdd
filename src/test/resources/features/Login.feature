Feature: Login to Saucedemo.com

  @SuccessLogin
  Scenario: Successfully logged in
    Given user already on login page
    When user input valid username
    And user input valid password
    And user click login button
    Then the system show products pages

  @FailedLogin1
  Scenario: Failed Login With invalid password
    Given user already on login page
    When user input valid username
    And user input invalid password
    And user click login button
    Then error massage appear
#
  @FailedLogin2
  Scenario: Failed Login With invalid username
    Given user already on login page
    When user input invalid username
    And user input valid password
    And user click login button
    Then error massage appear

  @FailedLogin3
  Scenario: Failed login with invalid Username and invalid Password
    Given user already on login page
    When user input invalid username
    And user input invalid password
    And user click login button
    Then error massage appear

  @LoginWithLockedAccount
  Scenario: Login with locked account
    Given user already on login page
    When user input valid another username
    And user input valid password
    And user click login button
    Then error massage appear





