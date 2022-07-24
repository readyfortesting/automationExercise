
@smoke  @regression   @paralel

Feature: US03 Automation Exercise

 @smoke
 Scenario: US03 Login User with incorrect email and password

 Given Navigate to url 'http://automationexercise.com'
 And Verify that home page is visible successfully
Then Click on Signup Login button
And  Verify Login to your account is visible
And Enter incorrect email address and password
Then Click login button
 Then Verify error Your email or password is incorrect! is visibl