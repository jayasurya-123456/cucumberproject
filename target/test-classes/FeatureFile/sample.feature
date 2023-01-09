Feature: valiadte the datepicker functionality of GlobalSQA
@jai
Scenario: validate the datepicker functionality in futuredate
Given user should launch the chrome and load thr url and maximize the window
When user should click the the datepicker functionality
Then user should select the date in the datepicker page
@surya
Scenario: validate the login functionality of valid username and password
Given user should launch the chrome and load thr url and maximize the windows
When user should enter the valid username and password
Then user should navigate to home page
@legal
Scenario: GTM Legal Stage
Given     User have to select process as GTM
When      User have to enter workitem no and navigate to Legal stage
And       User have to enter mandatory fields
Then      User have to save and click ok
