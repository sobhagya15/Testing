
Feature: Local Settings Test

@tag0
Scenario: Check for Local Settings
Given Fire Home Page 
When Navigate to Settings and click On Local Settings
And Check Whether Local Setting page is Open

@tag1
Scenario: Internaliztion Object Elements
When click on Change button
Then  is Editalble

@tag2
Scenario: to Make Changes to Internalizaion Section
When Select  values of my Interest
And Submit the Changes
Then Check for Changes

@tag3
Scenario:to Check whether all Alert Fields are Editable
Given Navigate to Alert Settings
When click on Change button inside the Alert Settings
Then Whether Text Fields are Editable

@tag4
Scenario: Check For Incorrect Login field Text
Given Navigate to Incorrect Login Text field
When  Give value to Invalid Login Attempts out of Range
And Check for Modifications in Invalid Login Attmeps value
Then check  the value of Invalid Login Attempts

@tag5
Scenario: Check Whether Changes made to this Alert Fileds are Saved After Submitting
Given Give Some value to Alert Settings Filed
Then check Whether Alert Settings Fields are Modified

@tag6
Scenario: Incorrect Login Attempts
Given Extract Login Attempts value from Incorrect Attempts field
When Try to Login With Invalid Credentials 
Then Check Whether Account Blocked

#Admin/Agent Access module functional Requirements
@tag7
Scenario: Check Whether fields are Editable in Admin/Agent Acess Module
Given Navigate to Agent Access 
Then Click on the Change Button
And Check whehter all Fields are Editable

#Check Whether changes made to Acess Settings Fields are saved
@tag8
Scenario: Admin. Session Automatic Logout
Given Click on the Change Button on Acess Settings Page
Then Make Some  changes  to Fields 
And Check Whether the changes are Submitted with no Error

#Automitacally Logout of Admin Account, if Account is Idle for Particular Amount of time
Given Nagive to Acess Settings
Then Extract the Admin. Session Logout Value
And Check Whether the Admin. Session Logout Automatically