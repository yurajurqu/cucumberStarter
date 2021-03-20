Feature: Application Login

#Background:
#Given validate the browser
#When browser is triggerd
#Then check if the browser is started

@RegTest 
Scenario: Home Page default login
Given User is on landing page
When User login into application with username "omar" and password "123"
Then Home page is populated
And Cars displayed are "true"

@MobileTest
Scenario: Home Page default login
Given User is on landing page
When User login into application with username "alan" and password "456"
Then Home page is populated
And Cars displayed are "false"


Scenario: Home Page default login
Given User is on landing page
When User sign up with following details
| omar | pass123 | omar@gmail.com  | Peru | +5112345 |
Then Home page is populated
And Cars displayed are "false"

@MobilesTest
Scenario Outline: Home Page default login
Given User is on landing page
When User logins into application with username <Username> and password <password>
Then Home page is populated
And Cars displayed are "true"

Examples:
|Username|password|
|alan|alan123|
|bequito|bequito123|
|user3|pass3|
|user4|pass4|
