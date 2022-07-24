package StepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.UI.TC14_Page;
import pages.UI.US08_26Page;
import utilities.Driver;

public class US26StepDef {
    US08_26Page us08_26Page = new US08_26Page();
    TC14_Page tc14_page = new TC14_Page();
    Actions actions= new Actions(Driver.getDriver());
    Faker faker = new Faker();


  // @Given("Scroll down page to bottom")
  // public void scroll_down_page_to_bottom() {
  //     JSUtils.scrollDownByJS();

  // }


    @Given("Scroll up page to top")
    public void scroll_up_page_to_top() {
        Driver.waitAndClick(us08_26Page.scrollup);
    }


  /*  @Given("Verify that page is scrolled up and {string} text is visible on screen")
    public void verify_that_page_is_scrolled_up_and_text_is_visible_on_screen(String string) {
>>>>>>> 9f5e8f8d80e75832d432be375baec5cc73ec6d47

  //  @Given("Verify that page is scrolled up and {string} text is visible on screen")
  //  public void verify_that_page_is_scrolled_up_and_text_is_visible_on_screen(String string) {
//
  //      Assert.assertTrue(us08_26Page.automationYazisiElementi.isDisplayed());
  //  }


   */

    @Given("Verify SUBSCRIPTION is visible")
    public void verify_subscription_is_visible() {
        Assert.assertTrue(us08_26Page.subscriptionYaziElementi.isDisplayed());

    }

}
