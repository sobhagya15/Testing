
Feature: Local Settings Test

@tag
Scenario: Check for Local Settings
Given Fire Home Page 
When Navigate to Settings and click On Local Settings
Then  Local Settings Open

@tag1
Scenario: Internaliztion Object Elements
When click on Change button
Then  is Editalble

@tag2
Scenario: to Make Changes on Inernalizaion Section
When Select  values of my Interest
Then Submit the hanges
Then Check for Changes