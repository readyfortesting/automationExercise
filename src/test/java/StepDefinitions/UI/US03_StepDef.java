package StepDefinitions.UI;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.UI.TC03Page;
import utilities.Driver;
import utilities.Log;

public class US03_StepDef {
    TC03Page tc03Page =new TC03Page();
    Actions actions = new Actions(Driver.getDriver());


    @Then("Click on Signup  Login button")
    public void click_on_signup_login_button() {
        tc03Page.signupLogin.click();

        Log.startTestCase("US03-TC01-");
        Log.info("Kullanici SignUp-Login butonuna tiklar ");

    }
    @Then("Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password() {
        Driver.waitAndClick(tc03Page.emailElementi);
        actions.sendKeys("iyigunler@gmail.com").sendKeys(Keys.TAB)
                .sendKeys("ugur1968").perform();
        Log.info("Kullanici gecersiz email and password girer");
    }
    @Then("Verify error Your email or password is incorrect! is visibl")
    public void verify_error_your_email_or_password_is_incorrect_is_visibl() {
        Assert.assertTrue(tc03Page.emailPasswordIsIncorrectWebelementi.isDisplayed());

        Log.info("Kullanici gecersiz bilgilerle giriş yapılamadıgını dogrular");
        Log.endTestCase("US03-TC01-");
        Driver.closeDriver();
    }



}