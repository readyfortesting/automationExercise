package pages.UI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class US01_Page {
    public US01_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupLogin;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement nameTexBox;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signupButton;
    @FindBy(xpath="//h2[text()='New User Signup!']")
    public WebElement newUserSignupElement;
    @FindBy(xpath="//b[text()='Enter Account Information']")
    public WebElement EnterAccountInformation;
    @FindBy(xpath="//input[@type='password']")
    public WebElement password;
    @FindBy(xpath="//input[@name='newsletter']")
    public WebElement newsletter;
    @FindBy(xpath="//input[@name='optin']")
    public WebElement optin;
    @FindBy(xpath="//label[@for='first_name']")
    public WebElement first_name;
    @FindBy(xpath = "//button[text()='Create Account']")
    public WebElement createAccountButton;
    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement AccountCreated;
    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement continue1;
    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement loggedInAs;
    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    public WebElement deleteAccountButton;
    @FindBy(xpath = "//h1[text()='Delete Account']")
    public WebElement deleteAccount;
}
