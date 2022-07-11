package StepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.UI.TC14_Page;
import pages.UI.TC08_26_Page;
import pages.UI.TC10_11_20_Page;
import utilities.Driver;

public class TC08_StepDef {

      TC08_26_Page TC08_26Page = new TC08_26_Page();
      TC10_11_20_Page TC10_11_20Page = new TC10_11_20_Page();
      TC14_Page tc14_page = new TC14_Page();
      Actions actions = new Actions(Driver.getDriver());
      Faker faker = new Faker();

    @Given("The products list is visible")
    public void the_products_list_is_visible() {
       Driver.waitAndClick(TC10_11_20Page.productsButton);


    }
    @Given("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
        Driver.waitAndClick(TC08_26Page.viewProduct);

    }
    @Given("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        Assert.assertTrue(TC08_26Page.productinformation.isDisplayed());
    }
    @Given("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        Assert.assertTrue(TC08_26Page.productinformation.isDisplayed());
    }





}
