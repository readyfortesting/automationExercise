package pages.UI;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC23_Page {
    public TC23_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href=\"/login\"]")
    public WebElement headerSignUpbutonElement;
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement newUsersigupYaziElement;
    @FindBy(css= "[name=\"name\"]")
    public WebElement nameInputBox;

    @FindBy(css = "[data-qa=\"signup-email\"]")
    public WebElement newUserEmailInputBox;

    @FindBy(css = "[name=\"title\"]")
    public WebElement titleWebElemet;

    @FindBy(xpath = "//button[@data-qa=\"create-account\"]")
    public WebElement newUseSignInButtonElement;
    @FindBy(css = "[data-qa=\"signup-button\"]")
    public WebElement sigInButonElement;
    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement accountInformationYaziElement;


    @FindBy(css = "[id=\"name\"]")
    public WebElement createAccountNameInput;
    @FindBy(css = "[data-qa=\"address\"]")
    public WebElement createAccountAdressInput;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreatedYaziWebElemet;
    @FindBy(css = "[data-qa=\"continue-button\"]")
    public WebElement sigupContinueButon;
    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement logInAsWebElement;
    @FindBy(xpath = "((//div[@class=\"productinfo text-center\"])//p)[1]")
    public WebElement productpageIlkUrunTitle;
    @FindBy(xpath = "(//a[@class=\"btn btn-default add-to-cart\"])[1]")
    public WebElement productPageilkUrunElement;
    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueButon;
    @FindBy(xpath = "//a[text()=' Cart']")
    public WebElement headerCartButonu;
    @FindBy(xpath = "//li[.='Shopping Cart']")
    public WebElement carpPageShoppingCardYazisi;
    @FindBy(css = "[class=\"btn btn-default check_out\"]")
    public WebElement cardpageProceedCheckOutButonu;
    @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[4]")
    public WebElement cardpageAdressYaziElemet;
    @FindBy(xpath = "//a[.='Blue Top']")
    public WebElement cardpageIlkUrunTitle;
    @FindBy(xpath = "(//li[@class=\"address_address1 address_address2\"])[5]")
    public WebElement billpageAdressTitle;
    @FindBy(xpath = "//a[text()=' Delete Account']")
    public WebElement deleteButtonWebElement;
    @FindBy(css = "[data-target=\"#deleteModal\"]")
    public WebElement deletepageDeleteAccountButon;
    @FindBy(xpath = "//h1[text()='Delete Account']")
    public WebElement deleteAccountyaziElement;




}
