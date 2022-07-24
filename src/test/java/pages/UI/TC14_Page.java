package pages.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC14_Page {

    public TC14_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[3]")
    public WebElement addToCartButonu;

    @FindBy(xpath = "//u[text()='View Cart']")
    public WebElement viewCartButonu;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueShoppingButonu;


    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    public WebElement cartButonu;

    @FindBy(xpath = "//li[@class='active']")
    public WebElement shoppingCartYaziElementi;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath = "(//p[@class='text-center'])[2]")
    public WebElement registerLoginButtonu;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement nameTexBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signupButton;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement mrButton;

    @FindBy(xpath = "//button[text()='Create Account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreatedYaziElementi;

    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement loggedinAsYaziElementi;

    @FindBy(xpath = "(//li[@class='address_title'])[1]")
    public WebElement yourDeliveryAddress;

    @FindBy(xpath = "//h3[text()='Your billing address']")
    public WebElement yourBillingAddress;

    @FindBy(xpath = "//textarea[@class='form-control']")
    public WebElement descriptionTextArea;

    @FindBy(xpath = "//a[text()='Place Order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement nameOnCardTexBox;

    @FindBy(xpath = "//button[text()='Pay and Confirm Order']")
    public WebElement  payAndConfirmOrderButton;

    @FindBy(xpath = "//b[text()='Order Placed!']")
    public WebElement successMessageYazisi;

    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccountButton;




}
