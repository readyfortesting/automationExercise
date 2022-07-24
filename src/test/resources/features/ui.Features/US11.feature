
@regression
  Feature: US11

      Scenario: Verify Subscription in Cart page
        * Launch browser and Navigate to url 'http://automationexercise.com'
        * Verify that home page is visible successfully
        * Click 'Cart' button
        * Scroll down to footer
        * Verify text 'SUBSCRIPTION'
        * Enter email address in input and click arrow button
        * Verify success message 'You have been successfully subscribed!' is visible