package pages.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC19_Page {

    public TC19_Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//div[@class='brands_products']")
    public WebElement brandsProducts;

    @FindBy(xpath = "//a[@href='/brand_products/Mast & Harbour']")
    public WebElement mastHarbour;

    @FindBy(xpath = "//h2[text()='Brand - Mast & Harbour Products']")
    public WebElement mastHarbourSayfasi;

    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    public WebElement poloButton;

    @FindBy(xpath = "//h2[text()='Brand - Polo Products']")
    public WebElement poloSayfasi;

}
