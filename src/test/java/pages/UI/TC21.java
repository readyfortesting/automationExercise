package pages.UI;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class TC21 {
    public TC21() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement urunlerButonu;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement tumUrunlerYazisi;

    @FindBy(xpath = "//a[@href='/product_details/2']")
    public WebElement urunuGoruntule;

    @FindBy(xpath = "//a[text()='Write Your Review']")
    public WebElement yorumunuzuYazinYazisi;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement yourNameBox;

    @FindBy(id = "button-review")
    public WebElement submitButonu;

    @FindBy(xpath = "//span[text()='Thank you for your review.']")
    public WebElement thankYouYazisi;

}
