package pages.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US0405page {
    public US0405page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "(//i[@class='fa fa-list'])[1]")
    public WebElement TestCaseButon;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement SignupLoginButton;

    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement LogintoAccountElement;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//b[text()='Burak']")
    public WebElement LoginUserAs;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logOutButton;

    @FindBy(xpath = "(//a[@href='/'])[2]")
    public WebElement homePageButton;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement newUserSignupText;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement newUserSignUpNameBox;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement newUserSignUpEmailAdressBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement newUserSignupButton;

    @FindBy(xpath = "//p[text()='Email Address already exist!']")
    public WebElement emailAddressAlreadyExistText;





}
