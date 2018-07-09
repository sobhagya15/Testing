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
  "name": "Navigate to Settings",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click On Local Settings",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Local Settings Open",
  "keyword": "Then "
});
formatter.match({
  "location": "LocalSetingsStep.fire_Home_Page()"
});
formatter.result({
  "duration": 12650516101,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LocalSetingsStep.local_Settings_Open()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 12,
  "name": "Internaliztion Object Elements",
  "description": "",
  "id": "local-settings-test;internaliztion-object-elements",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "click on Change button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "is Editalble",
  "keyword": "Then "
});
formatter.match({
  "location": "LocalSetingsStep.click_on_Change_button()"
});
formatter.result({
  "duration": 87393135,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"id\",\"selector\":\"modifyButton\"}\nCommand duration or timeout: 78 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:37:03\u0027\nSystem info: host: \u0027IBM-Testing22\u0027, ip: \u0027169.254.192.194\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d44.0, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 7cc315d0-ee5d-4ad8-b2cb-51fd6c7d66a6\n*** Element info: {Using\u003did, value\u003dmodifyButton}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat step_definition.LocalSetingsStep.click_on_Change_button(LocalSetingsStep.java:57)\r\n\tat ✽.When click on Change button(localSettings.feature:13)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"id\",\"selector\":\"modifyButton\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:37:03\u0027\nSystem info: host: \u0027IBM-Testing22\u0027, ip: \u0027169.254.192.194\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10779)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12666)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12608)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LocalSetingsStep.is_Editalble()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 17,
  "name": "to Make Changes on Inernalizaion Section",
  "description": "",
  "id": "local-settings-test;to-make-changes-on-inernalizaion-section",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Select  values of my Interest",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Submit the Changes",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Check for Changes",
  "keyword": "Then "
});
formatter.match({
  "location": "LocalSetingsStep.select_values_of_my_Interest()"
});
formatter.result({
  "duration": 54946291,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[@id\u003d\u0027tdContents\u0027]/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[3]/td[2]/select\"}\nCommand duration or timeout: 54 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:37:03\u0027\nSystem info: host: \u0027IBM-Testing22\u0027, ip: \u0027169.254.192.194\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d44.0, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 7cc315d0-ee5d-4ad8-b2cb-51fd6c7d66a6\n*** Element info: {Using\u003dxpath, value\u003d.//*[@id\u003d\u0027tdContents\u0027]/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[3]/td[2]/select}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat step_definition.LocalSetingsStep.select_values_of_my_Interest(LocalSetingsStep.java:86)\r\n\tat ✽.When Select  values of my Interest(localSettings.feature:18)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[@id\u003d\u0027tdContents\u0027]/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[3]/td[2]/select\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:37:03\u0027\nSystem info: host: \u0027IBM-Testing22\u0027, ip: \u0027169.254.192.194\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10779)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12666)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12608)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LocalSetingsStep.submit_the_Changes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LocalSetingsStep.check_for_Changes()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 23,
  "name": "to Check whether all Alert Fields are Editable",
  "description": "",
  "id": "local-settings-test;to-check-whether-all-alert-fields-are-editable",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Navigate to Alert Settings",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "click on Change button inside the Alert Settings",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Whether are Editable",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Submit the Changes",
  "keyword": "Then "
});
formatter.match({
  "location": "LocalSetingsStep.navigate_to_Alert_Settings()"
});
formatter.result({
  "duration": 65104562,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: Element is not currently visible and so may not be interacted with\nCommand duration or timeout: 26 milliseconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:37:03\u0027\nSystem info: host: \u0027IBM-Testing22\u0027, ip: \u0027169.254.192.194\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d44.0, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 7cc315d0-ee5d-4ad8-b2cb-51fd6c7d66a6\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\r\n\tat step_definition.LocalSetingsStep.navigate_to_Alert_Settings(LocalSetingsStep.java:109)\r\n\tat ✽.Given Navigate to Alert Settings(localSettings.feature:24)\r\nCaused by: org.openqa.selenium.ElementNotVisibleException: Element is not currently visible and so may not be interacted with\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:37:03\u0027\nSystem info: host: \u0027IBM-Testing22\u0027, ip: \u0027169.254.192.194\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.fxdriver.preconditions.visible(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:10092)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.checkPreconditions_(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12644)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12666)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12608)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LocalSetingsStep.click_on_Change_button_inside_the_Alert_Settings()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LocalSetingsStep.whether_are_Editable()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LocalSetingsStep.submit_the_Changes()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 30,
  "name": "Check Incorrect Login field Text",
  "description": "",
  "id": "local-settings-test;check-incorrect-login-field-text",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@tag4"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "Navigate to Incorrect Login Text field",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "Pass values and check",
  "keyword": "Then "
});
formatter.match({
  "location": "LocalSetingsStep.navigate_to_Incorrect_Login_Text_field()"
});
formatter.result({
  "duration": 31699926,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"id\",\"selector\":\"modifyButton\"}\nCommand duration or timeout: 31 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:37:03\u0027\nSystem info: host: \u0027IBM-Testing22\u0027, ip: \u0027169.254.192.194\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d44.0, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 7cc315d0-ee5d-4ad8-b2cb-51fd6c7d66a6\n*** Element info: {Using\u003did, value\u003dmodifyButton}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat step_definition.LocalSetingsStep.navigate_to_Incorrect_Login_Text_field(LocalSetingsStep.java:146)\r\n\tat ✽.Given Navigate to Incorrect Login Text field(localSettings.feature:31)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"id\",\"selector\":\"modifyButton\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:37:03\u0027\nSystem info: host: \u0027IBM-Testing22\u0027, ip: \u0027169.254.192.194\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10779)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12666)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12608)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LocalSetingsStep.pass_values_and_check()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 35,
  "name": "Incorrect Login Attempts",
  "description": "",
  "id": "local-settings-test;incorrect-login-attempts",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@tag5"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "Extract from Incorrect Attemps field",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "Try to Login With Invalid Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "Check Whether Account Blocked",
  "keyword": "Then "
});
formatter.match({
  "location": "LocalSetingsStep.extract_from_Incorrect_Attemps_field()"
});
formatter.result({
  "duration": 44814145,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"name\",\"selector\":\"setting(amountIncorrectLogin)\"}\nCommand duration or timeout: 44 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:37:03\u0027\nSystem info: host: \u0027IBM-Testing22\u0027, ip: \u0027169.254.192.194\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d44.0, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 7cc315d0-ee5d-4ad8-b2cb-51fd6c7d66a6\n*** Element info: {Using\u003dname, value\u003dsetting(amountIncorrectLogin)}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:461)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat step_definition.LocalSetingsStep.extract_from_Incorrect_Attemps_field(LocalSetingsStep.java:166)\r\n\tat ✽.Given Extract from Incorrect Attemps field(localSettings.feature:36)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"name\",\"selector\":\"setting(amountIncorrectLogin)\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:37:03\u0027\nSystem info: host: \u0027IBM-Testing22\u0027, ip: \u0027169.254.192.194\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10779)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12666)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///C:/Users/IBM/AppData/Local/Temp/anonymous8061249197123449607webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12608)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LocalSetingsStep.try_to_Login_With_Invalid_Credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LocalSetingsStep.check_Whether_Account_Blocked()"
});
formatter.result({
  "status": "skipped"
});
});