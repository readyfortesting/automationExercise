package pages.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC02_Page {

    public TC02_Page(){
    PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//img[@ src='/static/images/home/logo.png']")
    public WebElement homePage;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupLogin;

    @FindBy(xpath ="//h2[text()='Login to your account']")
    public WebElement loginToYourAccount;

@FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement emailElementi;

@FindBy(xpath = "//input[@type='email']")
    public WebElement passwordElementi;

//@FindBy(xpath = "//button[type='submit']")
 //   public WebElement loginElementi;

@FindBy(xpath="//button[text()='Login']")
public WebElement loginElementi;

@FindBy(xpath="//b[text()='ugur']")
    public WebElement loggedInAsUsernameWebelementi;

//a[@style='color:brown;']
@FindBy(xpath ="//a[@href='/delete_account']")
    public WebElement delete_AccountWebelementi;

@FindBy(xpath="//h1[text()='Delete Account']")
    public WebElement deleteAccountWebelementi;
}
