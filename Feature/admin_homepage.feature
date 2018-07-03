
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
And click on submit button
And fill the new password and confirm new password fields
And click on back button

@tag4
Scenario: checking change group for member page 

Given Admin homepage
When i click on change group submit button
Then memeber page should display current group new group comments and history
And group combo box have certain values
And comment should accept only 0 to 40 characters
And verify back button


