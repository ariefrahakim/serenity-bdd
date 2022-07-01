Feature: Remove Product on Cart

  Scenario: Remove single product from cart Page
    Given User already login
    When User click Product with name "Sauce Labs Backpack"
    Then Detail product appear
    When User click add to cart button
    Then Cart button changed to remove button
    When User click cart page
    Then selected product appear on cart page
    When User remove product from the cart page
    Then Product removed from cart page
    And Add to cart button product with name "Sauce Labs Backpack" appear

  Scenario: Remove multiple product from cart page
    Given User already login
    When User click add to cart button to selected product with name "Sauce Labs Backpack"
    Then Cart button changed to remove button
    When User click add to cart button to different selected product with name "Sauce Labs Bike Light"
    Then Cart button different product changed to remove button
    When User click cart page
    Then selected product appear on cart page
    When User remove product from the cart page
    Then Product removed from cart page
    And Add to cart button product with name "Sauce Labs Backpack" appear
    And Add to cart button product with name "Sauce Labs Bike Light" appear

  Scenario: Remove selected product
    Given User already login
    When User click add to cart button to selected product with name "Sauce Labs Backpack"
    Then Cart button changed to remove button
    When User click add to cart button to different selected product with name "Sauce Labs Bike Light"
    Then Cart button different product changed to remove button
    When User click cart page
    Then selected product appear on cart page
    When User remove product with name "Sauce Labs Bike Light" from the cart page
    Then Selected product removed from cart page
    And Add to cart button product with name "Sauce Labs Bike Light" appear