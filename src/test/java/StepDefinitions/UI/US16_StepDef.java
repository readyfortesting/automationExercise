package StepDefinitions.UI;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.UI.TC02Page;
import utilities.Driver;
public class US16_StepDef {
    TC02Page tc02Page=new TC02Page();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Fill email, password and click Login button")
    public void fill_email_password_and_click_login_button() {
        tc02Page.emailElementi.click();
        actions.sendKeys("akmanto3510@gmail.com").sendKeys(Keys.TAB).sendKeys("Selam3510-").perform();
        Driver.waitAndClick(tc02Page.loginElementi);
    }
}
