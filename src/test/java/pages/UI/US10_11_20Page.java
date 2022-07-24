package pages.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US10_11_20Page {
    public US10_11_20Page(){
         PageFactory.initElements(Driver.getDriver(),this);
    }

        @FindBy (xpath = "//h2[text()='Subscription']")
        public WebElement subscriptionText;

        @FindBy (xpath = "//input[@id='susbscribe_email']")
        public WebElement emailTextBox;

        @FindBy (xpath = "//button[@id='subscribe']")
        public WebElement emailButton;

        @FindBy (xpath = "//div[text()='You have been successfully subscribed!']")
        public WebElement successMessageText;

        @FindBy (xpath = "(//a[@href='/view_cart'])[1]")
        public WebElement cartButton;

        @FindBy (xpath = "//a[@href='/products']")
        public WebElement productsButton;

        @FindBy (xpath = "//h2[text()='All Products']")
        public WebElement allProductsText;

        @FindBy (xpath = "//input[@id='search_product']")
        public WebElement searchTextBox;

        @FindBy (xpath = "//button[@id='submit_search']")
        public WebElement searchButton;

        @FindBy (xpath = "//h2[text()='Searched Products']")
        public WebElement searchedProductsText;

        @FindBy (xpath = "//p[text()='Sleeveless Unicorn Print Fit & Flare Net Dress - Multi']")
        public WebElement searcWord;

        @FindBy (xpath = "//a[@data-product-id='23']")
        public WebElement addToCartButton;

        @FindBy (xpath = "//u[text()='View Cart']")
        public WebElement viewCardtButton;

        @FindBy (xpath = "//a[text()='Sleeveless Unicorn Print Fit & Flare Net Dress - Multi']")
        public WebElement cartList;

       @FindBy (xpath = "//a[text()=' Signup / Login']")
       public WebElement singUp_LoginButton;

       @FindBy (xpath = "(//input[@type='email'])[1]")
       public WebElement loginEmailTextBox;

       @FindBy (xpath = "(//input[@type='password'])[1]")
       public WebElement loginPasswordTextBox;

       @FindBy (xpath = "(//button[@type='submit'])[1]")
       public WebElement loginButton;









}
