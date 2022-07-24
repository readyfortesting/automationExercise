
@regression
Feature: US14

    @hello1
    Scenario: TC14  Place Order: Register while Checkout

        * Launch browser
        * Navigate to url 'http://automationexercise.com'
        * Verify that home page is visible successfully
        * Add products to cart
        * Click Cart button
        * Verify that cart page is displayed
        * Click Proceed To Checkout
        * Click Register  Login button
        * Fill all details in Signup and create account
        * Verify ACCOUNT CREATED! and click Continue button
        * Verify Logged in as username at top
        * Click Cart button
        * Click Proceed To Checkout button
        * Verify Address Details and Review Your Order
        * Enter description in comment text area and click Place Order
        * Enter payment details: Name on Card, Card Number, CVC, Expiration date
        * Click Pay and Confirm Order button
        * Verify success message Your order has been placed successfully!
        * Click  Delete Account button
        * Verify ACCOUNT DELETED! and click Continue button


