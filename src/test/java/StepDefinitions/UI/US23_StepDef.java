package StepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.UI.TC23_Page;
import utilities.Driver;

public class US23_StepDef {
    TC23_Page tc23_page = new TC23_Page();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    static String adress;
    static String name;
    static String ilkUrun ;


    @Given("kullanici tarayiciyi baslatir")
    public void kullaniciTarayiciyiBaslatir() {
        Driver.getDriver();
    }

    @Then("adresin dogru adres oldugunu teyit eder")
    public void adresinDogruAdresOldugunuTeyitEder() {
        String expectedData="Automation Exercise";
        String actualData= Driver.getDriver().getTitle();
        Assert.assertTrue(expectedData.equals(actualData));
    }

    @And("kullanici signin butonuna tiklar")
    public void kullaniciSigninButonunaTiklar() {
        tc23_page.headerSignUpbutonElement.click();
    }

    @Then("kullanici New User Signup yazisinin gorunur oldugunu teyit eder")
    public void kullaniciNewUserSignupYazisininGorunurOldugunuTeyitEder() {
        Assert.assertTrue(tc23_page.newUsersigupYaziElement.isDisplayed());
    }

    @And("kullanici new user signup yazisi altindaki kutulara name ve email bilgilerini gire")
    public void kullaniciNewUserSignupYazisiAltindakiKutularaNameVeEmailBilgileriniGire() {
        tc23_page.nameInputBox.sendKeys(Faker.instance().name().fullName());
        tc23_page.newUserEmailInputBox.sendKeys(Faker.instance().internet().emailAddress());
    }

    @Then("kullanici signup butonunu tiklar")
    public void kullaniciSignupButonunuTiklar() {
        tc23_page.sigInButonElement.click();
    }

    @And("kullanici ENTER ACCOUNT INFORMATION yazisinin gorundugunu teyit eder")
    public void kullaniciENTERACCOUNTINFORMATIONYazisininGorundugunuTeyitEder() {
        String expectedData = "ENTER ACCOUNT INFORMATION";
        String actualData =tc23_page.accountInformationYaziElement.getText();
        Assert.assertTrue(actualData.equals(expectedData));

    }

    @When("kullanici kayit gormunda istenilen alanlari doldurur")
    public void kullaniciKayitGormundaIstenilenAlanlariDoldurur() {
        Actions actions = new Actions(Driver.getDriver());
        adress = Faker.instance().address().fullAddress();
        actions.click(tc23_page.titleWebElemet).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().internet().password()).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().name().firstName()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().name().lastName()).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(adress).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().address().state()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().address().city()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().address().zipCode()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().phoneNumber().cellPhone()).perform();

        name = tc23_page.createAccountNameInput.getAttribute("value");
        adress = tc23_page.createAccountAdressInput.getAttribute("value");

    }

    @Then("kullanici creat account butonuna basar")
    public void kullaniciCreatAccountButonunaBasar() {
        tc23_page.newUseSignInButtonElement.click();
    }

    @And("kullanici ACCOUNT CREATED! yazisinin gorundugunu teyit eder")
    public void kullaniciACCOUNTCREATEDYazisininGorundugunuTeyitEder() {

        Assert.assertTrue(tc23_page.accountCreatedYaziWebElemet.isDisplayed());

    }


    @When("kullanici kayit olusturdukdan sonra sayfadaki continue butonuna tiklar")
    public void kullaniciKayitOlusturdukdanSonraSayfadakiContinueButonunaTiklar() {
        tc23_page.sigupContinueButon.click();
    }

    @Then("kullanici logged in as username yazisinin gorundugunu teyit eder")
    public void kullaniciLoggedInAsUsernameYazisininGorundugunuTeyitEder() {
        Assert.assertTrue(tc23_page.logInAsWebElement.isDisplayed());
    }

    @When("kullanici ilk urunu card a ekler")
    public void kullaniciIlkUrunuCardAEkler() {
        ilkUrun=tc23_page.productpageIlkUrunTitle.getText();
        tc23_page.productPageilkUrunElement.click();

    }

    @And("kullanici continue butonunu tıklar")
    public void kullaniciContinueButonunuTıklar() {
        tc23_page.continueButon.click();
    }

    @Then("kullanici header daki cart butonunu tiklar")
    public void kullaniciHeaderDakiCartButonunuTiklar() {
        tc23_page.headerCartButonu.click();
    }

    @And("kullanici card sayfasinda oldugunu teyit eder")
    public void kullaniciCardSayfasindaOldugunuTeyitEder() {
        Assert.assertTrue(tc23_page.carpPageShoppingCardYazisi.isDisplayed());
    }

    @When("kulanici proceed to checout butonuna tiklar")
    public void kulaniciProceedToChecoutButonunaTiklar() {
        tc23_page.cardpageProceedCheckOutButonu.click();
    }

    @Then("isim adres ve siparis bilgilerini dogru oldugunu teyit edin")
    public void isimAdresVeSiparisBilgileriniDogruOldugunuTeyitEdin() {
        String expectedData=adress;
        String actualData=tc23_page.cardpageAdressYaziElemet.getText();
        System.out.println(expectedData + "\n" + actualData);

        String expectedTitle=ilkUrun;
        String actualTitle=tc23_page.cardpageIlkUrunTitle.getText();

        System.out.println(expectedTitle + "\n" + actualTitle);
        Assert.assertTrue(expectedData.equals(actualData));
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }

    @When("fatura adresinin kayit sirasinda verilen adresle aynı oldugunu teyit eder")
    public void faturaAdresininKayitSirasindaVerilenAdresleAynıOldugunuTeyitEder() {
        String expect=adress;
        String actual=tc23_page.billpageAdressTitle.getText();
        System.out.println(expect+"\n"+actual);
        Assert.assertTrue(actual.equals(expect));
    }

    @And("kullanici delete account butonuna basar")
    public void kullaniciDeleteAccountButonunaBasar() {
        tc23_page.deleteButtonWebElement.click();
        tc23_page.deletepageDeleteAccountButon.click();
    }

    @When("kullanici delete account yazisinin gorundugunu teyit eder")
    public void kullaniciDeleteAccountYazisininGorundugunuTeyitEder() {
        Assert.assertTrue(tc23_page.deleteAccountyaziElement.isDisplayed());
    }



}