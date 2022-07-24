package StepDefinitions.UI;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.UI.US10_11_20Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US20_StepDef {

    US10_11_20Page us10_11_20Page=new US10_11_20Page();


    @Given("Click on {string} button")
    public void click_on_button(String string) {
        ReusableMethods.waitFor(2);
        us10_11_20Page.productsButton.click();

    }
    @Given("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        ReusableMethods.waitFor(2);
        ReusableMethods.hooverByJS(us10_11_20Page.allProductsText);
        String actualAllProductsText=us10_11_20Page.allProductsText.getText();
        String expectedAllProductsText="ALL PRODUCTS";

        System.out.println("expectedAllProductsText = " + expectedAllProductsText);
        System.out.println("actualAllProductsText = " + actualAllProductsText);

        ReusableMethods.waitFor(1);
        Assert.assertTrue(actualAllProductsText.equals(expectedAllProductsText));
    }

    @Given("Enter product name in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button() {
        ReusableMethods.waitFor(2);
        us10_11_20Page.searchTextBox.clear();
        us10_11_20Page.searchTextBox.click();

        us10_11_20Page.searchTextBox.sendKeys(ConfigReader.getProperty("searchWord"));
        us10_11_20Page.searchButton.click();

    }

    @Given("Verify {string} is visible")
    public void verify_is_visible(String string) {

        String actualSearchedProTExt=us10_11_20Page.searchedProductsText.getText();
        String expectedSearchedProText="SEARCHED PRODUCTS";
        System.out.println("expectedSearchedProText = " + expectedSearchedProText);
        System.out.println("actualSearchedProTExt = " + actualSearchedProTExt);

        Assert.assertEquals(expectedSearchedProText,actualSearchedProTExt);

    }



    @Given("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() {
        Assert.assertTrue(us10_11_20Page.searcWord.isDisplayed());

        ReusableMethods.waitFor(2);
        System.out.println("us10_11_20Page = " + us10_11_20Page.searcWord.getText());

        Assert.assertEquals(ConfigReader.getProperty("searchWord"),us10_11_20Page.searcWord.getText());


    }


    @Given("Add those products to cart")
    public void add_those_products_to_cart() {

        us10_11_20Page.addToCartButton.click();

    }


    @Given("Click {string} button and verify that products are visible in cart")
    public void click_button_and_verify_that_products_are_visible_in_cart(String string) {
        us10_11_20Page.viewCardtButton.click();
        ReusableMethods.waitFor(2);

        Assert.assertTrue(us10_11_20Page.cartList.isDisplayed());
        System.out.println("us10_11_20Page.cartList.GetTExt = " + us10_11_20Page.cartList.getText());

        Assert.assertEquals(ConfigReader.getProperty("searchWord"),us10_11_20Page.cartList.getText());

    }



    @Given("Click {string} button and submit login details")
    public void click_button_and_submit_login_details(String string) {
        us10_11_20Page.singUp_LoginButton.click();

        ReusableMethods.waitFor(1);
        us10_11_20Page.loginEmailTextBox.sendKeys(ConfigReader.getProperty("email"));

        ReusableMethods.waitFor(1);
        us10_11_20Page.loginPasswordTextBox.sendKeys(ConfigReader.getProperty("password"));

        ReusableMethods.waitFor(1);
        us10_11_20Page.loginButton.click();
    }


    @Given("Again, go to Cart page")
    public void again_go_to_cart_page() {
        ReusableMethods.waitFor(1);
        us10_11_20Page.cartButton.click();

    }

    @Given("Verify that those products are visible in cart after login as well")
    public void verify_that_those_products_are_visible_in_cart_after_login_as_well() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us10_11_20Page.cartList.isDisplayed());
        System.out.println("us10_11_20Page.cartList.GetTExt = " + us10_11_20Page.cartList.getText());

        Assert.assertEquals(ConfigReader.getProperty("searchWord"),us10_11_20Page.cartList.getText());

        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }


}