package StepDefinitions.UI;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.UI.TC07_Page;

public class TC07_StepDef {

    TC07_Page TC07Page = new TC07_Page();

    @And("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        TC07Page.testCaseButonu.click();
    }

    @And("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assert.assertTrue(TC07Page.testCaseSayfaBasligi.isDisplayed());
    }
}
