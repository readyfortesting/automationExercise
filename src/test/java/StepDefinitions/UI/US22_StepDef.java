package StepDefinitions.UI;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.UI.TC22_Page;
import utilities.Driver;
import utilities.JSUtils;

public class US22_StepDef {

    TC22_Page tc22_page=new TC22_Page();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();
    static String ilkUrun ;

    @Given("scroll to bottom of page")
    public void scroll_to_bottom_of_page() {
        JSUtils.scrollIntoVIewJS(tc22_page.mainpageRecomentedItemsYaziElementi);
    }
    @Given("Verify {string} are visible")
    public void verify_are_visible(String string) {
        Assert.assertTrue(tc22_page.mainpageRecomentedItemsYaziElementi.isDisplayed());
    }
    @Given("Click on {string} on Recommended product")
    public void click_on_on_recommended_product(String string) {
        ilkUrun=tc22_page.mainpageRecomentedItemsFisrtProductNameYazisi.getText();

        tc22_page.mainpageRecomentedItemsFirstProductElements.click();
    }
    @Given("Verify that product is displayed in cart page")
    public void verify_that_product_is_displayed_in_cart_page() {
        String expected=ilkUrun.toString();
        String actual=tc22_page.cardpageFirstUrunTitleYazisi.getText();
        System.out.println("Expect: "+expected + "\n actual: " + actual);
        Assert.assertTrue(actual.equals(expected));
    }


    @Then("kullanici ana sayfanın en alt kısmına RECOMMENDED ITEMS bolumune gider")
    public void kullaniciAnaSayfanınEnAltKısmınaRECOMMENDEDITEMSBolumuneGider() {
        JSUtils.scrollIntoVIewJS(tc22_page.mainpageRecomentedItemsYaziElementi);
    }

    @And("kullanici RECOMMENDED ITEMS gorunur oldugunu teyit eder")
    public void kullaniciRECOMMENDEDITEMSGorunurOldugunuTeyitEder() {
        Assert.assertTrue(tc22_page.mainpageRecomentedItemsYaziElementi.isDisplayed());
    }

    @When("kullanici RECOMMENDED ITEMS daki ilk urunu card a ekler")
    public void kullaniciRECOMMENDEDITEMSDakiIlkUrunuCardAEkler() {
        ilkUrun=tc22_page.mainpageRecomentedItemsFisrtProductNameYazisi.getText();

        tc22_page.mainpageRecomentedItemsFirstProductElements.click();
    }

    @Then("kullanici acilan pencereden view to card sekmesini tıklar")
    public void kullaniciAcilanPenceredenViewToCardSekmesiniTıklar() {
        tc22_page.mainpageRecomentedItemsPopupViewCardButonElement.click();
    }

    @And("kullanici secilen urunun card sayfasinda oldugunu gorur")
    public void kullaniciSecilenUrununCardSayfasindaOldugunuGorur() {
        String expected=ilkUrun.toString();
        String actual=tc22_page.cardpageFirstUrunTitleYazisi.getText();
        System.out.println("Expect: "+expected + "\n actual: " + actual);
        Assert.assertTrue(actual.equals(expected));
    }
}
