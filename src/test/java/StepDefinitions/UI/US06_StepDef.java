package StepDefinitions.UI;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.UI.US0619Page;
import utilities.Driver;
import utilities.ReusableMethods;



public class US06_StepDef {

    US0619Page us0619Page=new US0619Page();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Click on Contact Us button")
    public void click_on_contact_us_button() {
        us0619Page.ContactUsButton.click();
    }

    @Given("Verify GET iN TOUCH is visible")

    public void verify_get_in_touch_is_visible() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(us0619Page.getInTouchBaslikElementi.isDisplayed());
    }

    @Given("Enter name email subject and message")
    public void enter_name_email_subject_and_message() {
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        us0619Page.NameTextBox.click();
        actions.sendKeys("htc1").sendKeys(Keys.TAB).sendKeys("htc1@gmail.com").sendKeys(Keys.TAB).sendKeys("abc1")
                .sendKeys(Keys.TAB).sendKeys("qwert1").perform();
    }

    @Given("Upload file")
    public void upload_file() {
        Assert.assertTrue(us0619Page.UploadFileButton.isEnabled());
    }

    @Given("Click Submit button")
    public void click_submit_button() {
        us0619Page.SubmitButton.click();

    }

    @Given("Click OK button")
    public void click_ok_button(){
       // Driver.getDriver().manage().window().getSize(new Dimension(400,500));
        ReusableMethods.waitFor(3);
      //  ReusableMethods.getScreenshot("Tamam butonuna basilmasina ragmen gerekli yazi çikmiyor");

        Driver.getDriver().switchTo().alert().accept();


    }
    @Given("Verify success message Success Your details have been submitted successfully is visible")
    public void verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
        Assert.assertTrue(us0619Page.BasariliMesajGonderildi.isDisplayed());


    }

    @Given("Click Home button and verify that landed to home page successfully")
    public void click_home_button_and_verify_that_landed_to_home_page_successfully() {
        us0619Page.HomeButton.click();

    }






















}
