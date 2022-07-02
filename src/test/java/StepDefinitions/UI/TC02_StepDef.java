package StepDefinitions.UI;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.UI.TC02_Page;
import utilities.Driver;
import utilities.Log;
import utilities.ReusableMethods;

public class TC02_StepDef {
    static String email;
    static String password;

    TC02_Page tc02Page =new TC02_Page();
    Actions actions = new Actions(Driver.getDriver());

/*    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Log.startTestCase("US02-TC01");
        Log.info("Kullanici URL e gider");
        Log.startTestCase("start yazısı cıkarıyor");
        Log.info("info log");
        Log.warn("Warn log");
        Log.debug("Debug log");
        Log.error("Error log");
        Log.fatal("fatal log");
        Log.info("ınfo log");



    }
<<<<<<< HEAD:src/test/java/StepDefinitions/US02_TC01.java
    */
/*
    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(tc02Page.homePage.isDisplayed());

    }
    */


    /*@Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(tc02Page.homePage.isDisplayed());
    }*/

    @Then("Click on Signup Login button")
    public void click_on_signup_login_button() {
        ReusableMethods.waitFor(2);
       Driver.waitAndClick(tc02Page.signupLogin);

       Log.info("Kullanici SignUp-Login butonuna tiklar ");


    }

    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {

        ReusableMethods.waitFor(2);

        Assert.assertTrue(tc02Page.loginToYourAccount.isDisplayed());

        Log.info("Kullanici sayfaya gidildigini dogrular");

    }
    @Then("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        Driver.waitAndClick(tc02Page.emailElementi);

        actions.sendKeys("iyigunlerugur@gmail.com").sendKeys(Keys.TAB)
                .sendKeys("ugur1969").perform();


    }

    @Then("Click login button")
    public void click_login_button() {
        ReusableMethods.waitFor(2);
     //  tc02Page.loginElementi.click();

        // actions.click(tc02Page.loginElementi);
        Driver.waitAndClick(tc02Page.loginElementi);


    }
    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(tc02Page.loggedInAsUsernameWebelementi.isDisplayed());

    }
    @Then("Click Delete Account button")
    public void click_delete_account_button() {
Driver.waitAndClick(tc02Page.delete_AccountWebelementi);

        Log.info("Kullanici Delete butonuna tiklar");

    }

    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
     Assert.assertTrue(tc02Page.deleteAccountWebelementi.isDisplayed());
        Driver.closeDriver();
        Log.info("Kullanici Delete butonunun göründügünü dogrular.");
        Log.endTestCase("US02-TC01-");

    }



}