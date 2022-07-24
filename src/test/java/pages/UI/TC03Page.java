package pages.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC03Page {
    public TC03Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupLogin;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement emailElementi;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement passwordElementi;


      @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    public WebElement emailPasswordIsIncorrectWebelementi;

}
