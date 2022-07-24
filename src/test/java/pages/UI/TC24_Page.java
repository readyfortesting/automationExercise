package pages.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class TC24_Page {

   public TC24_Page(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
   @FindBy(xpath = "//a[@href='/download_invoice/400']")
    public WebElement invoiceButton;

   @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement continueButton;
}
