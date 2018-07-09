Feature: Cyclos profile_Personal

@tag1

Scenario: Successful Login

Given Cyclos Application

When Valid Credentials Entered
When Clicking on Change button
Then Submit button will be highlighted

When Clicking on submit button
Then Display Message

@tag2

Scenario: Cancellation

When Clicking on cancel button
Then Submit button disabled

@tag3

Scenario: Password

When Passing Valid Credentials
And Text message for password written
And Entering new credentials
Then Pop-Up shows credentials updated

