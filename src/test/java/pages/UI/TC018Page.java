package pages.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC018Page {

    public TC018Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
      @FindBy(xpath = "//h2[text()='Category']")
         public WebElement categoryElementi;
//a[@data-toggle='collapse']
         @FindBy(xpath = "//a[@href='#Women']")
    public WebElement womenElementi;

    @FindBy(xpath="//a[@href='/category_products/1']")
    public WebElement dressElementi;

    @FindBy(xpath ="//h2[@class='title text-center']")
    public WebElement titleTextCenter;

    @FindBy(xpath ="//a[@href='#Men']")
    public WebElement menElementi;


    //a[text()='Jeans ']
   @FindBy(xpath ="//a[text()='Jeans ']")
    public WebElement jeansElementi;
    //@FindBy(xpath = "//a[@href='/category_products/6']")
   // public WebElement getJeansElementi;
}
