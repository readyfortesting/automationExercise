package pages.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC25_Page {

     public TC25_Page(){
          PageFactory.initElements(Driver.getDriver(),this);
     }

     @FindBy(xpath = "//a[@id='scrollUp']")
     public WebElement yukariCikmaButtonu;

     @FindBy(xpath = "(//h2[text()='Full-Fledged practice website for Automation Engineers'])[1]")
     public WebElement automationYazisiElementi;

     @FindBy(xpath = "//h2[text()='Subscription']")
     public WebElement subscriptionYaziElementi;
}
