Feature: Search and place order for vegetables

  @SeleniumTest
  Scenario: Search for items and validate results
    Given User is on GreenKart Landing page
    When User searched for "Cucumber" Vegetable
    Then "Cucumber" results are displayed

  @SeleniumTest
  Scenario Outline: Search for items and then move to checkout page
    Given User is on GreenKart Landing page
    When User did search for <search> Vegetable
    And Added items to cart
    And User proceeded to checkout page
    Then verify that selected <search> items are displayed in the checkout page

    Examples:
    |search|
    |Brinjal|
    |Cucumber|
    