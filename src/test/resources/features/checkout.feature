Feature: Checkout

  @CheckOutSingle
  Scenario Outline: User successfully Checkout Single Product
    Given User already login
    And User already add to cart selected product with name "<product>"
    And User already on cart page
    When User click checkout button
    Then The your information page appear
    When User input first name field with "<first name>"
    And user input last name field with "<last name>"
    And user input zip or postal code with <postal code>
    And user click continue button
    Then the Checkout information page appear
    Examples:
      | product                  | first name | last name | postal code |
      | Sauce Labs Fleece Jacket | Olive      | Jhonsen   | 443228      |
      | Sauce Labs Bike Light    | Alexander  | Nico      | 11515       |

  @CheckoutMultiple
  Scenario Outline: User successfully Checkout Multiple Product
    Given User already login
    And User already add to cart selected product with name "<product1>"
    And User already add to cart selected different product with name "<product2>"
    And User already add to cart selected different product with name "<product3>"
    And User already on cart page
    When User click checkout button
    Then The your information page appear
    When User input first name field with "<first name>"
    And user input last name field with "<last name>"
    And user input zip or postal code with <postal code>
    And user click continue button
    Then the Checkout information page appear
    Examples:
      | product1                 | product2                | product3                 | first name | last name | postal code |
      | Sauce Labs Fleece Jacket | Sauce Labs Onesie       | Sauce Labs Bolt T-Shirt  | Olive      | Jhonsen   | 443228      |
      | Sauce Labs Onesie        | Sauce Labs Bolt T-Shirt | Sauce Labs Fleece Jacket | Alexander  | Nico      | 11515       |

  @CheckoutWithoutInputInformation
  Scenario: User Checkout Without Input Your Information
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