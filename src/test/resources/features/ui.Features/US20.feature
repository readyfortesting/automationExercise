
@regression
    Feature: US20

      Scenario: Search Products and Verify Cart After Login

          * Launch browser and Navigate to url 'http://automationexercise.com'
          * Click on 'Products' button
          * Verify user is navigated to ALL PRODUCTS page successfully
          * Enter product name in search input and click search button
          * Verify 'SEARCHED PRODUCTS' is visible
          * Verify all the products related to search are visible
          * Add those products to cart
          * Click 'Cart' button and verify that products are visible in cart
          * Click 'Signup / Login' button and submit login details
          * Again, go to Cart page
          * Verify that those products are visible in cart after login as well