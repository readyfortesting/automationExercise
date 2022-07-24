@regression
    Feature: US10
      @log
      Scenario: Verify Subscription in home page
         * Launch browser and Navigate to url 'http://automationexercise.com'
         * Verify that home page is visible successfully
         * Scroll down to footer
         * Verify text 'SUBSCRIPTION'
         * Enter email address in input and click arrow button
         * Verify success message 'You have been successfully subscribed!' is visible