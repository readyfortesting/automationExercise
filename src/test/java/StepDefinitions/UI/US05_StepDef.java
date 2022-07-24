package StepDefinitions.UI;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.UI.US0405page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US05_StepDef {
    US0405page usFourFive=new US0405page();

    @Given("user ba Navigate to url")
    public void user_ba_navigate_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Given("user ba Verify that home page is visible successfully")
    public void user_ba_verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(usFourFive.homePageButton.isDisplayed());

    }
    @Given("user ba Click on Signup Login button")
    public void user_ba_click_on_signup_login_button() {
        ReusableMethods.waitFor(1);
        usFourFive.SignupLoginButton.click();

    }
    @Given("user ba Verify New User Signup is visible")
    public void user_ba_verify_new_user_signup_is_visible() {
        ReusableMethods.waitFor(1);
        usFourFive.newUserSignupText.isDisplayed();

    }

    @Given("user ba Enter name and already registered email address")
    public void user_ba_enter_name_and_already_registered_email_address() {
        ReusableMethods.waitFor(1);
        usFourFive.newUserSignUpNameBox.sendKeys(ConfigReader.getProperty("name"));
        usFourFive.newUserSignUpEmailAdressBox.sendKeys(ConfigReader.getProperty("emailaddress"));


    }


    @Given("user ba Click Signup button")
        public void user_ba_click_signup_button() {
        ReusableMethods.waitFor(1);
        usFourFive.newUserSignupButton.click();

        }



    @Given("user ba Verify error Email Address already exist is visible")
    public void user_ba_verify_error_email_address_already_exist_is_visible() {
        ReusableMethods.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)");
        ReusableMethods.waitFor(1);
        usFourFive.emailAddressAlreadyExistText.isDisplayed();

    }

}
