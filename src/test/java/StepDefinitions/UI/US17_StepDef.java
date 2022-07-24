package StepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.UI.TC17;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class US17_StepDef {
    TC17 tc17 = new TC17();

    @Then("{string} sayfasina gidilir")
    public void sayfasina_gidilir(String url){
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @And("Ana sayfanin basariyla gorunur oldugu dogrulanir")
    public void anaSayfaninBasariylaGorunurOlduguDogrulanir() {
      Assert.assertTrue(tc17.anasayfaLogo.isDisplayed());
    }

    @And("Sepete urun eklenir")
    public void sepeteUrunEklenir() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);
        tc17.sepeteEkleButonu.click();
        ReusableMethods.waitFor(5);
        tc17.viewCartButon.click();

    }

    @And("Sepet sayfasinin goruntulendigi dogrulanir")
    public void sepetSayfasininGoruntulendigiDogrulanir() {
        Assert.assertTrue(tc17.sepetSayfasi.isDisplayed());
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("X butonu tiklanir")
    public void xButonuTiklanir() {
        ReusableMethods.waitFor(5);
        tc17.Xbutton.click();

    }

    @And("Urunun sepetten kaldirildigini dogrular")
    public void urununSepettenKaldirildiginiDogrular() {
        ReusableMethods.waitFor(5);
        Assert.assertTrue(tc17.sepetBosYazisi.isDisplayed());
    }

    @And("Sayfa Kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }



}

