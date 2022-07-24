package StepDefinitions.UI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.UI.TC018Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US18_StepDef {

    TC018Page tc018Page =new TC018Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Verify that categories are visible on left side bar")
    public void verify_that_categories_are_visible_on_left_side_bar() {
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(tc018Page.categoryElementi.isDisplayed());
    }
    @Given("Click on Women category")
    public void click_on_women_category() {
        actions.click(tc018Page.womenElementi).perform();
    }
    @Then("Click on any category link under Women category, for example: Dress")
    public void click_on_any_category_link_under_women_category_for_example_dress() {
        actions.click(tc018Page.dressElementi).perform();

    }
    @Then("Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void verify_that_category_page_is_displayed_and_confirm_text_women_tops_products() {
        Assert.assertTrue(tc018Page.categoryElementi.isDisplayed());
        Assert.assertTrue(tc018Page.titleTextCenter.isDisplayed());
    }
    @Then("On left side bar click on any sub-category link of Men category")
    public void on_left_side_bar_click_on_any_sub_category_link_of_men_category() {
        actions.click(tc018Page.menElementi).perform();
        ReusableMethods.waitFor(2);
        actions.click(tc018Page.jeansElementi).perform();
    }
    @Then("Verify that user is navigated to that category page")
    public void verify_that_user_is_navigated_to_that_category_page() {
        Assert.assertTrue(tc018Page.categoryElementi.isDisplayed());
    }


}