$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/sample.feature");
formatter.feature({
  "name": "valiadte the datepicker functionality of GlobalSQA",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate the login functionality of valid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@surya"
    }
  ]
});
formatter.step({
  "name": "user should launch the chrome and load thr url and maximize the windows",
  "keyword": "Given "
});
formatter.match({
  "location": "Step2.user_should_launch_the_chrome_and_load_thr_url_and_maximize_the_windows()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "Step2.user_should_enter_the_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should navigate to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step2.user_should_navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
});