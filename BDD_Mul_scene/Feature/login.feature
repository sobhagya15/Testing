Feature: Cyclos Login Test
@tag1
Scenario: Successful Login
Given Cyclos Application
When Valid credentials are Entered
Then Homepage is displayed
@tag2
Scenario: Turning on CapsLock
Given Cyclos Application again
When values are entered
And capslock is turned on
Then capital letters should be displayed
@tag3
Scenario: Clear password
Given Cyclos Application again
When  password is entered and clear is clicked
Then password field is cleared
@tag4
Scenario: Not Accepting special characters
Given Cyclos Application again
When Special characters are entered in username field
Then Invalid login page should be displayed
@tag5
Scenario: not accepting special characters in username field
Given Cyclos Application again
When Invalid range of characters are entered in username field
Then Invalid login page is displayed  for irc
@tag6
Scenario: only numeric values test in username field
Given Cyclos Application again
When Only numeric characters are entered in un field
Then Invalid login page is displyed for onc
@tag7
Scenario: Checking for valid password format and range
Given Cyclos Application again
Then password should be in valid format
@tag8
Scenario: validating pwd from virtual and physical keyboard
Given Cyclos Application again
When Password is enterd from vkeyboard or pKeyBoard
Then Password should be accepted