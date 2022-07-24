package pages.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class TC17 {
    public TC17() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//img[@alt='Website for automation practice'])[1]")
    public WebElement anasayfaLogo;

    @FindBy(xpath = "(//img[@alt='ecommerce website products'])[1]")
    public WebElement ilkUrun;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[1]")
    public WebElement sepeteEkleButonu;

    @FindBy(xpath = "(//a[@href='/view_cart'])[2]")
    public WebElement viewCartButon;

    @FindBy(xpath = "//li[@class='active']")
    public WebElement sepetSayfasi;

    @FindBy(xpath = "//i[@class='fa fa-times']")
    public WebElement Xbutton;

    @FindBy(xpath = "(//p[@class='text-center'])[3]")
    public WebElement sepetBosYazisi;
}
