package StepDefinitions.UI;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.UI.TC19_Page;
import utilities.Driver;

public class US19_StepDef {

      TC19_Page tc19_page=new TC19_Page();
      Actions actions=new Actions(Driver.getDriver());

    @Given("Verify that Brands are visible on left side bar")
    public void verify_that_brands_are_visible_on_left_side_bar() {

        Assert.assertTrue(tc19_page.brandsProducts.isDisplayed());
    }
    @Given("Click on any brand name")
    public void click_on_any_brand_name() {
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Driver.waitAndClick(tc19_page.mastHarbour);

    }
    @Given("Verify that user is navigated to brand page and brand products are displayed")
    public void verify_that_user_is_navigated_to_brand_page_and_brand_products_are_displayed() {

        Assert.assertTrue(tc19_page.mastHarbourSayfasi.isDisplayed());

    }
    @Given("On left side bar, click on any other brand link")
    public void on_left_side_bar_click_on_any_other_brand_link() {

        Driver.waitAndClick(tc19_page.poloButton);

    }
    @Given("Verify that user is navigated to that brand page and can see products")
    public void verify_that_user_is_navigated_to_that_brand_page_and_can_see_products() {

      Assert.assertTrue(tc19_page.poloSayfasi.isDisplayed());

    }
}
