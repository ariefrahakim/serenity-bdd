Feature: Payment Feature

  Scenario: User Checkout Payment Successfully
    Given User already login
    And User already add to cart selected product with name "Sauce Labs Backpack"
    And User already add to cart selected different product with name "Sauce Labs Bike Light"
    And User already on cart page
    And User already click checkout button
    And User already on checkout page
    When User input first name field with "Joko"
    And user input last name field with "Sand"
    And user input zip or postal code with 12345
    And user click continue button
    Then the Checkout information page appear
    When User click finish button
#    Then Checkout Complete Page appear