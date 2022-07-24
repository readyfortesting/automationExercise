package StepDefinitions.UI;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.UI.US0405page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US04_StepDef {

  US0405page usFourFive=new US0405page();

    @Given("user BA  Navigate to url")
    public void user_ba_navigate_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }
    @Given("user BA Verify that home page is visible successfully")
    public void user_ba_verify_that_home_page_is_visible_successfully() {
        ReusableMethods.waitFor(3);

        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Automation Exercise";

        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }
    @Given("user BA Click on Signup Login button")
    public void user_ba_click_on_signup_login_button() {
        ReusableMethods.waitFor(1);
        usFourFive.SignupLoginButton.click();

    }
    @Given("user BA Verify Login to your account is visible")
    public void user_ba_verify_login_to_your_account_is_visible() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(usFourFive.LogintoAccountElement.isDisplayed());

    }
    @Given("user BA Enter correct email address and password")
    public void user_ba_enter_correct_email_address_and_password() {
        ReusableMethods.waitFor(1);
        usFourFive.emailBox.sendKeys(ConfigReader.getProperty("emailaddress"));
        usFourFive.passwordBox.sendKeys(ConfigReader.getProperty("autoexercisepassword"));

    }
    @Given("user BA Click login button")
    public void user_ba_click_login_button() {
        ReusableMethods.waitFor(1);
       usFourFive.loginButton.click();
    }
    @Given("user BA Verify that Logged in as username is visible")
    public void user_ba_verify_that_logged_in_as_username_is_visible() {

        Assert.assertTrue(usFourFive.LoginUserAs.isDisplayed());


    }
    @Given("user BA Click Logout button")
    public void user_ba_click_logout_button() {
        usFourFive.logOutButton.click();

    }
    @Given("user BA Verify that user is navigated to login page")
    public void user_ba_verify_that_user_is_navigated_to_login_page() {
        Assert.assertTrue(usFourFive.homePageButton.isDisplayed());


    }


}


