package pages.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC22_Page {
    public TC22_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//font[contains(text(),'önerilen öğeler')]")
    public WebElement önerilenögelerYaziElementi;
    @FindBy(xpath = "((//*[@class=\"item active\"])[2]//p)[1]" )
    public WebElement mainpageRecomentedItemsFisrtProductNameYazisi;
    @FindBy(xpath = "((//*[@class=\"item active\"])[2]//a)[1]")
    public WebElement mainpageRecomentedItemsFirstProductElements;
    @FindBy(xpath = "//tbody//tr[1]//td[2]//h4")
    public WebElement cardpageFirstUrunTitleYazisi;
    @FindBy(xpath = "//h2[.='recommended items']")
    public WebElement mainpageRecomentedItemsYaziElementi;
    @FindBy(xpath = "//a[.='View Cart']")
    public WebElement mainpageRecomentedItemsPopupViewCardButonElement;
}
