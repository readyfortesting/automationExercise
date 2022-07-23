package StepDefinitions.UI;

import io.cucumber.java.en.Given;
import pages.UI.US10_11_20Page;
import utilities.ReusableMethods;

public class Us11_StepDef {


    US10_11_20Page us10_11_20Page=new US10_11_20Page();



    @Given("Click {string} button")
    public void click_button(String string) {
        ReusableMethods.waitFor(2);
        us10_11_20Page.cartButton.click();

    }

}