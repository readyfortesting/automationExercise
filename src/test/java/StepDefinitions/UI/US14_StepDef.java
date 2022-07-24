package StepDefinitions.UI;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.UI.TC14_Page;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;


public class US14_StepDef {


    TC14_Page tc14_page = new TC14_Page();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();


    @Given("Launch browser")
    public void launch_browser() {


    }


     @Given("Navigate to url {string}")

    public void navigate_to_url(String url) {
      //  Driver.getDriver().get(ConfigReader.getProperty("url"));
  Driver.getDriver().get(ConfigReader.getProperty("url"));

    }


    /* @Given("Verify that home page is visible successfully")
     public void verify_that_home_page_is_visible_successfully() {

         String expectedAnasayfa="https://www.automationexercise.com/";

         String actualAnasayfa=Driver.getDriver().getCurrentUrl();
         // System.out.println("actualAnasayfa = " + actualAnasayfa);

         Assert.assertEquals(expectedAnasayfa,actualAnasayfa);
     }

    }
    */

    /* @Given("Verify that home page is visible successfully")
     public void verify_that_home_page_is_visible_successfully() {
         String expectedAnasayfa="https://www.automationexercise.com/";
         String actualAnasayfa=Driver.getDriver().getCurrentUrl();
         // System.out.println("actualAnasayfa = " + actualAnasayfa);
         Assert.assertEquals(expectedAnasayfa,actualAnasayfa);
     }

     */
    @Given("Add products to cart")
    public void add_products_to_cart() {
        Driver.waitAndClick(tc14_page.addToCartButonu);
        tc14_page.continueShoppingButonu.click();

    }

    @Given("Click Cart button")
    public void click_cart_button() {
        ReusableMethods.waitFor(2);

        Driver.waitAndClick(tc14_page.cartButonu);

    }

    @Given("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {


        String expectedShoppinCart = "Shopping Cart";
        String actualShoppingCart = tc14_page.shoppingCartYaziElementi.getText();
        // System.out.println("actualShoppingCart = " + actualShoppingCart);
        Assert.assertEquals(expectedShoppinCart, actualShoppingCart);

    }
    {

        Driver.waitAndClick(tc14_page.proceedToCheckoutButton);

    }



    @Given("Click Register  Login button")
    public void click_register_login_button() {
        ReusableMethods.waitFor(1);
        Driver.waitAndClick(tc14_page.registerLoginButtonu);


    }
    @Given("Fill all details in Signup and create account")
    public void fill_all_details_in_signup_and_create_account() {

        Driver.waitAndClick(tc14_page.nameTexBox);
        actions.sendKeys(faker.name().name()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).perform();
        tc14_page.signupButton.click();

        Driver.waitAndClick(tc14_page.mrButton);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password(9,15,true,true,true))
                .sendKeys(Keys.TAB).sendKeys("2").sendKeys(Keys.TAB).sendKeys("april").sendKeys(Keys.TAB).sendKeys("2010").sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys(faker.company().name()).sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB)
                .sendKeys(faker.country().name()).sendKeys(Keys.TAB).sendKeys(faker.address().state()).sendKeys(Keys.TAB)
                .sendKeys(faker.address().city()).sendKeys(Keys.TAB).sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber()).sendKeys(Keys.TAB).perform();
        Driver.waitAndClick(tc14_page.createAccountButton);




    }
    @Given("Verify ACCOUNT CREATED! and click Continue button")
    public void verify_account_created_and_click_continue_button() {
        String expectedYaziElementi="ACCOUNT CREATED!";
        String actualYaziElementi=tc14_page.accountCreatedYaziElementi.getText();
        // System.out.println("actualYaziElementi = " + actualYaziElementi);

        Assert.assertEquals(expectedYaziElementi,actualYaziElementi);
        ReusableMethods.waitFor(2);
        Driver.waitAndClick(tc14_page.continueButton);

    }
    @Given("Verify Logged in as username at top")
    public void verify_logged_in_as_username_at_top() {

        ReusableMethods.waitFor(2);
        Assert.assertTrue(tc14_page.loggedinAsYaziElementi.isDisplayed());


    }
    @Given("Click Proceed To Checkout button")
    public void click_proceed_to_checkout_button() {

        Driver.waitAndClick(tc14_page.proceedToCheckoutButton);

    }
    @Given("Verify Address Details and Review Your Order")
    public void verify_address_details_and_review_your_order() throws IOException {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(tc14_page.yourDeliveryAddress.isDisplayed());
        Assert.assertTrue(tc14_page.yourBillingAddress.isDisplayed());
    }
    @Given("Enter description in comment text area and click Place Order")
    public void enter_description_in_comment_text_area_and_click_place_order() {
        Driver.waitAndClick(tc14_page.descriptionTextArea);
        actions.sendKeys("YENİ URUNLERİ BEGENMEDİM").perform();
        Driver.waitAndClick(tc14_page.placeOrderButton);

    }
    @Given("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enter_payment_details_name_on_card_card_number_cvc_expiration_date() {

        Driver.waitAndClick(tc14_page.nameOnCardTexBox);
        actions.sendKeys("HELLO CARD").sendKeys(Keys.TAB).sendKeys("984245455400126").sendKeys(Keys.TAB)
                .sendKeys("887").sendKeys(Keys.TAB).sendKeys("09").sendKeys(Keys.TAB)
                .sendKeys("2023").perform();


    }

    @Given("Click Pay and Confirm Order button")
    public void click_pay_and_confirm_order_button() throws IOException {

        ReusableMethods.waitFor(2);
        Driver.waitAndClick(tc14_page.payAndConfirmOrderButton);
        ReusableMethods.getScreenshot("Your order has been placed successfully! YAZİSİ");

    }

    @Given("Verify success message Your order has been placed successfully!")
    public void verify_success_message_your_order_has_been_placed_successfully() throws IOException {

        Assert.assertTrue(tc14_page.successMessageYazisi.isDisplayed());

    }

    @Given("Click  Delete Account button")
    public void click_delete_account_button() {

        Driver.waitAndClick(tc14_page.deleteAccountButton);

    }
    @Given("Verify ACCOUNT DELETED! and click Continue button")
    public void verify_account_deleted_and_click_continue_button() throws IOException {

        ReusableMethods.getScreenshot("Hesap Silinemiyor");

        Driver.closeDriver();

    }

}