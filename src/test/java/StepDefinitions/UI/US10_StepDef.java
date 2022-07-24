package StepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.UI.US10_11_20Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;

import utilities.ReusableMethods;

import java.io.IOException;

public class US10_StepDef {

    US10_11_20Page us10_11_20Page=new US10_11_20Page();
    Faker faker=new Faker();




    @Given("Launch browser and Navigate to url {string}")
    public void launch_browser_and_navigate_to_url(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        Log.startTestCase("US10-TC01-");
        Log.info("Kullanici URl ye gider");
        Log.error("Kullanıcı URL ye gıdemedı");
        Log.debug("Debug log");
        Log.fatal("fatal log");


    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        ReusableMethods.waitFor(3);

        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Automation Exercise";

        Assert.assertTrue(actualTitle.equals(expectedTitle));

        Log.info("Kulanici Anasayfaya gider");
        Log.warn("Kullanici Anasayfaya gidemedi");



    }

    @Given("Scroll down to footer")
    public void scroll_down_to_footer() {
        ReusableMethods.waitFor(3);

        ReusableMethods.hooverByJS(us10_11_20Page.subscriptionText);
        Log.info("Kullanici sayfanin en altina gıder");
    }


    @Given("Verify text {string}")
    public void verify_text(String string) {
        ReusableMethods.waitFor(3);
        String actualSubscriptionText=us10_11_20Page.subscriptionText.getText();
        String expectedSubscriptionText="SUBSCRIPTION";
       System.out.println("expectedSubscriptionText = " + expectedSubscriptionText);
       System.out.println("actualSubscriptionText = " + actualSubscriptionText);

        Assert.assertTrue(actualSubscriptionText.equals(expectedSubscriptionText));
        Log.info("Kullanıcı cıkan yazıyı dogrular");

    }

    @Given("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() throws IOException {
        ReusableMethods.waitFor(2);
        us10_11_20Page.emailTextBox.click();
        us10_11_20Page.emailTextBox.sendKeys(faker.internet().emailAddress());

        ReusableMethods.waitFor(1);
        us10_11_20Page.emailButton.click();
        ReusableMethods.getScreenshot("Success Message Text");

        Log.info("Kullanıcı email adresini girer ve click yapar");



    }

    @Given("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {

        Assert.assertTrue(us10_11_20Page.successMessageText.isDisplayed());
        System.out.println("success message Text = " +us10_11_20Page.successMessageText.getText());

        Log.info("Kullanıcı basarılı mesaj yazısı alır");
        Log.endTestCase("US-TC01");
        Log.info("gıthub denemesı maraba canlar");
    }


}