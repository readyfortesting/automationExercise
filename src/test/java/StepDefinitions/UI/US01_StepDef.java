package StepDefinitions.UI;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.UI.US01_Page;
import utilities.ConfigReader;
import utilities.Driver;
public class US01_StepDef {

    US01_Page us01=new US01_Page();
    Actions actions= new Actions(Driver.getDriver());


    @Given("A Navigate to url {string}")
    public void a_navigate_to_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Given("A Verify that home page is visible successfully")
    public void a_verify_that_home_page_is_visible_successfully() {
        String expectedAnasayfa="https://www.automationexercise.com/";
        String actualAnasayfa=Driver.getDriver().getCurrentUrl();
        // System.out.println("actualAnasayfa = " + actualAnasayfa);
        Assert.assertEquals(expectedAnasayfa,actualAnasayfa);
    }
    @Given("A Click on Signup Login button")
    public void a_click_on_signup_login_button() {
        us01.signupLogin.click();
    }
    @Given("A Verify New User Signup! is visible")
    public void a_verify_new_user_signup_is_visible() {
        Assert.assertTrue(us01.newUserSignupElement.isDisplayed());
    }
    @Given("A Enter name and email address")
    public void a_enter_name_and_email_address() {
        us01.nameTexBox.click();
        actions.sendKeys(Faker.instance().name().firstName(), Keys.TAB).sendKeys(Faker.instance().internet().emailAddress()).perform();
    }
    @Given("A Click Signup button")
    public void a_click_signup_button() {
        us01.signupButton.click();
    }
    @Given("A Verify that ENTER ACCOUNT INFORMATION is visible")
    public void a_verify_that_enter_account_information_is_visible() {
        Assert.assertTrue(us01.EnterAccountInformation.isDisplayed());
    }
    @Given("A Fill details: Title, Name, Email, Password, Date of birth")
    public void a_fill_details_title_name_email_password_date_of_birth() {
        us01.password.click();
        actions.sendKeys(Faker.instance().internet().password(),Keys.TAB).sendKeys("2",Keys.TAB).sendKeys("January",Keys.TAB).sendKeys("2021").perform();
    }
    @Given("A Select checkbox Sign up for our newsletter!")
    public void a_select_checkbox_sign_up_for_our_newsletter() {
        Driver.waitAndClick(us01.newsletter);
    }
    @Given("A Select checkbox Receive special offers from our partners!")
    public void a_select_checkbox_receive_special_offers_from_our_partners() {
        Driver.waitAndClick(us01.optin);
    }
    @Given("A Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void a_fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        us01.first_name.click();
        actions.sendKeys(Faker.instance().name().firstName(),Keys.TAB).sendKeys(Faker.instance().name().lastName(),Keys.TAB).
                sendKeys(Faker.instance().company().name(),Keys.TAB).sendKeys(Faker.instance().internet().emailAddress(),Keys.TAB,Keys.TAB)
                .sendKeys("Canada",Keys.TAB).sendKeys(Faker.instance().address().state(),Keys.TAB).sendKeys(Faker.instance().address().city(),Keys.TAB)
                .sendKeys(Faker.instance().address().zipCode(),Keys.TAB).sendKeys(Faker.instance().phoneNumber().phoneNumber()).perform();
    }
    @Given("A Click Create Account button")
    public void a_click_create_account_button() {
        Driver.waitAndClick(us01.createAccountButton);
    }
    @Given("A Verify that ACCOUNT CREATED! is visible")
    public void a_verify_that_account_created_is_visible() {
        Assert.assertTrue(us01.AccountCreated.isDisplayed());
    }
    @Given("A Click Continue button")
    public void a_click_continue_button() {
        Driver.waitAndClick(us01.continue1);
    }
    @Given("A Verify that Logged in as username is visible")
    public void a_verify_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(us01.loggedInAs.isDisplayed());
    }
    @Given("A Click Delete Account button")
    public void a_click_delete_account_button() {
        Driver.waitAndClick(us01.deleteAccountButton);
    }
    @Given("A Verify ACCOUNT DELETED! and click Continue button")
    public void a_verify_account_deleted_and_click_continue_button() {
        Assert.assertTrue(us01.deleteAccount.isDisplayed());
    }
}
