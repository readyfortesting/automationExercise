Feature: US01
  @hello
  Scenario: Launch browser
    * A Navigate to url 'http://automationexercise.com'
    * A Verify that home page is visible successfully
    * A Click on Signup Login button
    * A Verify New User Signup! is visible
    * A Enter name and email address
    * A Click Signup button
    * A Verify that ENTER ACCOUNT INFORMATION is visible
    * A Fill details: Title, Name, Email, Password, Date of birth
    * A Select checkbox Sign up for our newsletter!
    * A Select checkbox Receive special offers from our partners!
    * A Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    * A Click Create Account button
    * A Verify that ACCOUNT CREATED! is visible
    * A Click Continue button
    * A Verify that Logged in as username is visible
    * A Click Delete Account button
    * A Verify ACCOUNT DELETED! and click Continue button