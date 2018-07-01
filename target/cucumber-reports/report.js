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
      "name": "@tag"
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
  "duration": 8970719976,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.navigate_to_Settings_and_click_On_Local_Settings()"
});
formatter.result({
  "duration": 158651722,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.local_Settings_Open()"
});
formatter.result({
  "duration": 894047750,
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
  "duration": 230569520,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.is_Editalble()"
});
formatter.result({
  "duration": 227390102,
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
  "name": "Submit the hanges",
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
  "duration": 100477495,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.submit_the_hanges()"
});
formatter.result({
  "duration": 794310174,
  "status": "passed"
});
formatter.match({
  "location": "LocalSetingsStep.check_for_Changes()"
});
formatter.result({
  "duration": 10201169130,
  "status": "passed"
});
});