Feature: Login to Saucedemo.com

  Scenario: Successfully logged in
    Given I already on login page
    When I input my username
    And I input my password
    And I click login button
    Then the system show products pages

    Scenario: Successfully add to cart
      Given I already on login page
#      When I click add to cart
#      And I click icon shopping cart
#      Then your cart page appear
#      And I click remove button
#      Then product should be to delete
#      And I click continue shopping button
      Then the system show products pages


