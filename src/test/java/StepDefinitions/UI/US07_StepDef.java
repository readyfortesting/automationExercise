package StepDefinitions.UI;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.UI.US07Page;

public class US07_StepDef {

    US07Page us07Page = new US07Page();

    @And("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        us07Page.testCaseButonu.click();
    }

    @And("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assert.assertTrue(us07Page.testCaseSayfaBasligi.isDisplayed());
    }
}
