package StepDefinitions.UI;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.UI.TC25_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US25_StepDef {

    TC25_Page tc25_page=new TC25_Page();
    Actions actions=new Actions(Driver.getDriver());

 //  @Given("Scroll down page to bottom")
 //  public void scroll_down_page_to_bottom() {

 //      JSUtils.scrollDownByJS();

 //  }

    @Given("MS Verify SUBSCRIPTION is visible")
    public void ms_verify_subscription_is_visible() {

        Assert.assertTrue(tc25_page.subscriptionYaziElementi.isDisplayed());

    }

    @Given("Click on arrow at bottom right side to move upward")
    public void click_on_arrow_at_bottom_right_side_to_move_upward() {

        Driver.waitAndClick(tc25_page.yukariCikmaButtonu);

    }
    @Given("Verify that page is scrolled up and {string} text is visible on screen")
    public void verify_that_page_is_scrolled_up_and_text_is_visible_on_screen(String string) {

       ReusableMethods.waitFor(1);

       String expectedYaziElementi=tc25_page.automationYazisiElementi.getText();
        System.out.println("expectedYaziElementi = " + expectedYaziElementi);

        Assert.assertEquals(tc25_page.automationYazisiElementi.getText(),expectedYaziElementi);


    }

}
