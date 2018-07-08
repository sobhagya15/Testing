Feature: Cyclos Message Feature
@tag1
Scenario: Selecting inbox from dropdown list
Given Cyclos message page
When I click on message and select inbox
Then Display inbox messages in the search box
@tag2
Scenario: Selecting sent items from dropdown list
Given
When I click on sent items from dropdown
Then Display sent items messages in the search box
@tag3
Scenario: Selecting trash from the dropdown list
Given
When I click on trash from the dropdown
Then Display trash messages in the search box
@tag4
Scenario: Select all the messages
Given
When I click on select button
Then All messages should be selected
@tag4
Scenario: De-select all the message
Given
When I click on select none button 
Then None of the messages should be selected
@tag5
Scenario: Send message to a member
Given
When I choose member and send keys to other feilds
Then On clicking submit message should be sent
@tag6
Scenario: Send message to a group
Given
When I choose group and send keys to rest 
Then On clicking submitmessage should be sent
@tag7
Scenario: Checking the default category
Given
When I check the default values
Then assertion should be done to verify
@tag8
Scenario: Adding a new category
Given
When I add a new category and submit
Then new category should be added
@tag9
Scenario: Deleting a category
Given
When I click on delete button
Then Delete the selected category
@tag10
Scenario: Editing existing category
Given
When I click on edit button
Then I should be able to edit the category