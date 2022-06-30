Feature: Checkout

  @CheckOutSingle
  Scenario: Successfully Checkout Single Product
    Given User already login
    And User already add to cart selected product with name "Sauce Labs Fleece Jacket"
    And User already on cart page
    When User click checkout button
    Then The your information page appear
    When User input first name field
    And user input last name field
    And user input zip or postal code
    And user click continue button
    Then the Checkout information page appear

  @CheckoutWithoutInputInformation
  Scenario: Checkout Without Input Your Information
    Given User already login
    And User already add to cart selected product with name "Sauce Labs Fleece Jacket"
    And User already on cart page
    When User click checkout button
    Then The your information page appear
    When User not fill first name field
    And user not fill last name field
    And user not fill zip or postal code
    And user click continue button
    Then error massage appear on your information page