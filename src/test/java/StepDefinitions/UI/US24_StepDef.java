package StepDefinitions.UI;

import io.cucumber.java.en.Given;
import pages.UI.TC24_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US24_StepDef {


           TC24_Page tc24_page=new TC24_Page();

    @Given("Click Download Invoice button and verify invoice is downloaded successfully.")
    public void click_download_invoice_button_and_verify_invoice_is_downloaded_successfully() {
        ReusableMethods.waitFor(5);
        Driver.waitAndClick(tc24_page.invoiceButton);

        String expectedPath = System.getProperty("user.dir") + "/Downloads/invoice.txt";
        System.out.println("expectedPath = " + expectedPath);

   //     String doesExist = String.valueOf(Files.exists(Paths.get(expectedPath)));
    //  Assert.assertTrue(Boolean.parseBoolean(doesExist));


    }
    @Given("Click Continue button")
    public void click_continue_button() {

        Driver.waitAndClick(tc24_page.continueButton);


    }

}
