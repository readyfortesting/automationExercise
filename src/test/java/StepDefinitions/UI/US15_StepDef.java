package StepDefinitions.UI;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import pages.UI.TC15_Page;
import utilities.Driver;

public class US15_StepDef {

    TC15_Page tc15_page=new TC15_Page();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();
}
