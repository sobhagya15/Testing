Feature: Open Source on-line banking software

@tag1
Scenario: to check page displays all the server events with the date of events generated 
Given online banking app
When  we click on system alert
Then page displays all the server events with the date of events generated 

@tag2
Scenario: to Remove the selected events when clicking on the remove button.

When click on remove button
Then selected element removed*/
@tag3
Scenario: to check all blocked members are displayed

When click on member alerts 
Then displays all the temporarily blocked members


@tag4
Scenario: to check all events are selected

When click on select all
Then all events are selected

@tag5
 Scenario: to check all events are deselected

When click on select none
Then all events are deselected
@tag6
Scenario: Selected Member event is deleted from the alerts page when pressing Remove selected button 

When click on remove
Then selected  event is deleted
@tag7
Scenario:  Members profile page opens when clicking on the member name 

When click on some member
Then member profile page opens
@tag8
Scenario: combox should display values as “System”, “Member”

When click on type icon
Then  shows list values as System and member
@tag9
Scenario: should accept only nos from field

When  providing numeric and other inputs
Then  numeric it accepts and other inout it doesn't
@tag10
Scenario: should accept only nos in tofield

When  providing numeric and other input
Then  numeric it accepts and other inpout it doesn't
@tag10
Scenario: from date and to date field accept input from keyboard.

When providing date to from and todate field from keyboard 
Then the input should be displayed in the  text field

@tag11
Scenario: displays all system alerts

When on clicking submit 
Then all system alerts are displayed

@tag12
Scenario: displays all member alerts

When on clicking submit button
Then all member alerts are displayed