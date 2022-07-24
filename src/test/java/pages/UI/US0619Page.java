package pages.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US0619Page {

    public US0619Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//a[@href='/login']")
    public WebElement SignupLoginButton;

    @FindBy(xpath = "//a[normalize-space()='Home']")
    public WebElement HomePageButton;

    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    public WebElement ContactUsButton;

    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    public WebElement getInTouchBaslikElementi;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement NameTextBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement EmailTextBox;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement SubjectTextBox;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement MessageTextBox;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement UploadFileButton;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement SubmitButton;

    @FindBy(xpath = "(//div[text()='Success! Your details have been submitted successfully.'])[1]")
    public WebElement BasariliMesajGonderildi;

    @FindBy(xpath = "//span[text()=' Home']")
    public  WebElement HomeButton;

















}
