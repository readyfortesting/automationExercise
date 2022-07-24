package StepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.UI.TC21;

import utilities.Driver;


public class US21_StepDef {
    TC21 tc21 = new TC21();
    Actions actions = new Actions(Driver.getDriver());

    @And("Urunler dugmesine tiklanir")
    public void urunlerDugmesineTiklanir() {
        tc21.urunlerButonu.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("Tum urunler sayfasina gidildigi dogrulanir")
    public void tumUrunlerSayfasinaGidildigiDogrulanir() {
        Assert.assertTrue(tc21.tumUrunlerYazisi.isDisplayed());
    }

    @And("Urunu goruntule dugmesine tiklanir")
    public void urunuGoruntuleDugmesineTiklayin() {
        tc21.urunuGoruntule.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("Yorumunuzu yazinin gorunur oldugu dogrulanir")
    public void yorumunuzuYazininGorununOldugunuDogrulayin() {
        Assert.assertTrue(tc21.yorumunuzuYazinYazisi.isDisplayed());
    }

    @And("Ad ve eposta adresi ve inceleme girilir")
    public void adVeEpostaAdresiVeIncelemeGirilir() {
        tc21.yourNameBox.click();
        actions.sendKeys(Faker.instance().name().name(),Keys.TAB)
                .sendKeys(Faker.instance().internet().emailAddress(),Keys.TAB)
                .sendKeys("Tesekkurler")
                .perform();

    }

    @And("Gonder dugmesi tiklanir")
    public void gonderDugmesiTiklanir() {
        tc21.submitButonu.click();

    }

    @And("Incelemeniz icin tesekkur ederiz mesaji dogrulanir")
    public void incelemenizIcinTesekkurEderizMesajiDogrulanir() {
        Assert.assertTrue(tc21.thankYouYazisi.isDisplayed());

    }
}
