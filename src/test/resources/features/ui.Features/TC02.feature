@smoke  @regression    @paralel

Feature: US02 Automation Exercise 02
@tag   @smoke
  Scenario: US02 Login User with correct email and password

     Given Navigate to url 'http://automationexercise.com'
     And Verify that home page is visible successfully
     Then Click on Signup Login button
     And Verify Login to your account is visible
     And Enter correct email address and password
     Then Click login button
     And Verify that Logged in as username is visible
     And Click Delete Account button
     And Verify that ACCOUNT DELETED! is visible