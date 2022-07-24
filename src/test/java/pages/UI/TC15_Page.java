package pages.UI;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC15_Page {
    public TC15_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
