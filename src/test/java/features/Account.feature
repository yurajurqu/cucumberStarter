Feature: Application Login


@SmokeTest
Scenario: Home Page default login
Given User is on landing page
When User login into application with username "omar" and password "123"
Then Home page is populated
And Cars displayed are "true"


