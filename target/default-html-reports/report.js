$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginWithParameters.feature");
formatter.feature({
  "name": "login as different users",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login as a driver",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hw"
    },
    {
      "name": "#homework"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as \"xSALC_\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: -- expected:\u003c[Dashboard]\u003e but was:\u003c[Login]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat com.vytrack.step_definitions.LoginStepDefs.the_user_should_be_able_to_login(LoginStepDefs.java:36)\r\n\tat ✽.the user should be able to login(file:///C:/Users/Abdullah/IdeaProjects/EU7CucumberSelenium/src/test/resources/features/LoginWithParameters.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the title contains \"Dashboard\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_title_contains(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});