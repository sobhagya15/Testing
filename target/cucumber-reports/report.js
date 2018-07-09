$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("localSettings.feature");
formatter.feature({
  "line": 2,
  "name": "Local Settings Test",
  "description": "",
  "id": "local-settings-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Check for Local Settings",
  "description": "",
  "id": "local-settings-test;check-for-local-settings",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag0"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Fire Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to Settings and click On Local Settings",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Local Settings Open",
  "keyword": "Then "
});
formatter.match({
  "location": "LocalSetingsStep.fire_Home_Page()"
});
formatter.result({
  "duration": 13186039958,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.navigate_to_Settings_and_click_On_Local_Settings()"
});
formatter.result({
  "duration": 274711858,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.local_Settings_Open()"
});
formatter.result({
  "duration": 1150751000,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Internaliztion Object Elements",
  "description": "",
  "id": "local-settings-test;internaliztion-object-elements",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "click on Change button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "is Editalble",
  "keyword": "Then "
});
formatter.match({
  "location": "LocalSetingsStep.click_on_Change_button()"
});
formatter.result({
  "duration": 376163473,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.is_Editalble()"
});
formatter.result({
  "duration": 300528814,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "to Make Changes on Inernalizaion Section",
  "description": "",
  "id": "local-settings-test;to-make-changes-on-inernalizaion-section",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Select  values of my Interest",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Submit the Changes",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Check for Changes",
  "keyword": "Then "
});
formatter.match({
  "location": "LocalSetingsStep.select_values_of_my_Interest()"
});
formatter.result({
  "duration": 119628640,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.submit_the_Changes()"
});
formatter.result({
  "duration": 963505989,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.check_for_Changes()"
});
formatter.result({
  "duration": 194585894,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "to Check whether all Alert Fields are Editable",
  "description": "",
  "id": "local-settings-test;to-check-whether-all-alert-fields-are-editable",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "Navigate to Alert Settings",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "click on Change button inside the Alert Settings",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Whether are Editable",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Submit the Changes",
  "keyword": "Then "
});
formatter.match({
  "location": "LocalSetingsStep.navigate_to_Alert_Settings()"
});
formatter.result({
  "duration": 868098765,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.click_on_Change_button_inside_the_Alert_Settings()"
});
formatter.result({
  "duration": 264646893,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.whether_are_Editable()"
});
formatter.result({
  "duration": 2378840901,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.submit_the_Changes()"
});
formatter.result({
  "duration": 287639930,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Check Incorrect Login field Text",
  "description": "",
  "id": "local-settings-test;check-incorrect-login-field-text",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@tag4"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "Navigate to Incorrect Login Text field",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Pass values and check",
  "keyword": "Then "
});
formatter.match({
  "location": "LocalSetingsStep.navigate_to_Incorrect_Login_Text_field()"
});
formatter.result({
  "duration": 322983473,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.pass_values_and_check()"
});
formatter.result({
  "duration": 296116353,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Incorrect Login Attempts",
  "description": "",
  "id": "local-settings-test;incorrect-login-attempts",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@tag5"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "Extract from Incorrect Attemps field",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "Try to Login With Invalid Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "Check Whether Account Blocked",
  "keyword": "Then "
});
formatter.match({
  "location": "LocalSetingsStep.extract_from_Incorrect_Attemps_field()"
});
formatter.result({
  "duration": 3260062283,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.try_to_Login_With_Invalid_Credentials()"
});
formatter.result({
  "duration": 10430439823,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.check_Whether_Account_Blocked()"
});
formatter.result({
  "duration": 4008519811,
  "status": "passed"
});
});