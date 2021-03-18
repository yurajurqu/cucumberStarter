Feature: Application Login



Scenario: Home Page default login
Given User is on landing page
When User login into application with username "omar" and password "123"
Then Home page is populated
And Cars are displayed

Scenario: Home Page default login
Given User is on landing page
When User login into application with username "alan" and password "456"
Then Home page is populated
And Cars are not displayed