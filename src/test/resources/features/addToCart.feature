#Feature: Add to Cart
#
#  @SingleProduct
#  Scenario Outline: User Add to Cart on Detail Product
#    Given User already login
#    When User click Product with name "<products>"
#    Then Detail product appear
#    When User click add to cart button
#    Then Cart button changed to remove button
#    When User click cart page
#    Then selected product appear on cart page
#    Examples:
#      | products              |
#      | Sauce Labs Bike Light |
#      | Sauce Labs Backpack   |
#      | Sauce Labs Onesie     |
#
#  @SingleProduct
#  Scenario Outline: User add to Cart on Product Page
#    Given User already login
#    When User click add to cart button to selected product with name "<products>"
#    Then Cart button changed to remove button
#    When User click cart page
#    Then selected product appear on cart page
#    Examples:
#      | products              |
#      | Sauce Labs Bike Light |
#      | Sauce Labs Backpack   |
#      | Sauce Labs Onesie     |
#
#  @MultipleProduct
#  Scenario Outline: User Add to Cart Multiple Product on Detail Product
#    Given User already login
#    When User click Product with name "<product1>"
#    Then Detail product appear
#    When User click add to cart button
#    Then Cart button changed to remove button
#    When User back to product page
#    And User click different product with name "<product2>"
#    Then Detail different product appear
#    When User click add to cart button different product
#    Then Cart button different product changed to remove button
#    When User back to product page
#    And User click different product with name "<product3>"
#    Then Detail different product appear
#    When User click add to cart button different product
#    Then Cart button different product changed to remove button
#    When User click cart page
#    Then selected product appear on cart page
#    Examples:
#      | product1                | product2                 | product3                          |
#      | Sauce Labs Bike Light   | Sauce Labs Backpack      | Sauce Labs Onesie                 |
#      | Sauce Labs Bolt T-Shirt | Sauce Labs Fleece Jacket | Test.allTheThings() T-Shirt (Red) |
#
#  @MultipleProducts
#  Scenario Outline: User add to Cart on Product Page
#    Given User already login
#    When User click add to cart button to selected product with name "<product1>"
#    Then Cart button changed to remove button
#    When User click add to cart button to different selected product with name "<product2>"
#    Then Cart button different product changed to remove button
#    When User click add to cart button to different selected product with name "<product3>"
#    Then Cart button different product changed to remove button
#    When User click cart page
#    Then selected product appear on cart page
#    Examples:
#      | product1                | product2                 | product3                          |
#      | Sauce Labs Bike Light   | Sauce Labs Backpack      | Sauce Labs Onesie                 |
#      | Sauce Labs Bolt T-Shirt | Sauce Labs Fleece Jacket | Test.allTheThings() T-Shirt (Red) |