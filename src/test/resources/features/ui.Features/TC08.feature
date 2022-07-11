@regression
Feature: US08
  Scenario:
    * Launch browser
    * Navigate to url 'http://automationexercise.com'
    * Verify that home page is visible successfully
    * Click on 'Products' button
    * Verify user is navigated to ALL PRODUCTS page successfully
    * The products list is visible
    * Click on View Product of first product
    * User is landed to product detail page
    * Verify that detail detail is visible: product name, category, price, availability, condition, brand