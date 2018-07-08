
@tag
Feature: Testing the admin homepage

@tag1
Scenario: Login in the application
Given I want to test the cyclos application
When i provide the credentials
	And click on submit button
	
Then I will move to admin homepage

@tag2
Scenario: checking the application status
When admin page is displayed
Then check application uptime displays in days and hour format
And display number of unread messages
And display number of connected admin
And display number of connected members
And display number of system alerts
And display number of temporarily blocked users
And check the refresh button

@tag3
Scenario: Checking login password of customer page in access module

Given Admin homepage
When I enter member username
Then i will move to change login password details can modify the member details

@tag4
Scenario: checking change group for member page 

Given back button and move to admin home page
When i click on change group submit button
Then Checking the change group functionality

@tag5
Scenario: Checking the advertisement module

Given moving to advertisement module
When I click on manage advertisement's submit button
Then check advertisement module

@tag6

Scenario: Checking account information module

Given I on advertisement page now i have click on home
When I enter the credentials
Then check the account inforamntion module

@tag7

Scenario: Checking member info module
Given back button from account info module and move to admin homepage
When I click payment system to member
Then check payment 

@tag8
Scenario: Checking the loan module
Given I am on member profile page
When  i click on grant loan sublit button
Then confirm loan
