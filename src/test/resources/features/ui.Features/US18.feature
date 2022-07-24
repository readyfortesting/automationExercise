@regression
Feature: US018 Automation Exercise
@h
  Scenario: US018 View Category Products

 Given Navigate to url 'http://automationexercise.com'
  And Verify that categories are visible on left side bar
  And Click on Women category
  Then Click on any category link under Women category, for example: Dress
  And Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
 And On left side bar click on any sub-category link of Men category
 And Verify that user is navigated to that category page