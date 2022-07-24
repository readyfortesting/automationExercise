package pages.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US08_26Page {

    public US08_26Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement viewProduct;

    @FindBy(xpath = "//div[@class='product-information']")
    public WebElement productinformation;

    @FindBy(xpath = "//a[@id='scrollUp']")
    public WebElement scrollup;

    @FindBy(xpath = "(//h2[text()='Full-Fledged practice website for Automation Engineers'])[1]")
    public WebElement automationYazisiElementi;

    @FindBy(xpath = "//h2[text()='Subscription']")
    public WebElement subscriptionYaziElementi;




}
