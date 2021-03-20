Feature: Search and place order for vegetables

@SeleniumTest
Scenario: Search for items and validate results
Given User is on GreenKart Landing page
When User searched for "Cucumber" Vegetable
Then "Cucumber" results are displayed