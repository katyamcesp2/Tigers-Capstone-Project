package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDef extends Base {
	
	HomePageObject homePage = new HomePageObject();
	
	//Background
	@Given("User in on Retail website")
	public void user_in_on_retail_website() {
		String expectedText= "TEST ENVIRONMENT";
	    String actualText= homePage.userIsInRetailWebsite();
	    Assert.assertEquals(expectedText,actualText);
	    logger.info("User in on Retail page");	
	   
	}
	
	//Scenario#1 User verify currency values change
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.userClickOnCurrency();
		logger.info("User clicked on Currency");
		Utils.hardWait(1000);
	    
	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.chooseEuroFromDropDown();
		logger.info("User Chose Euro from dropdown");
	    Utils.hardWait(1000);
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homePage.currencyValueShouldChangedToEuro();
		logger.info("curency value changed to Euro");
	    Utils.hardWait(1000);
	}
	//Scenario#2 User empty shopping cart message displays
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePage.userClickOnShoppingCart();
		logger.info("User clicked on shopping cart");
	   
	}
	@Then("{string} message should display")
	public void message_should_display(String string) {
		String expectedMessage = ("Your shopping cart is empty!");
		String actualMessage = homePage.shoppingCartEmptyMessage();
		Assert.assertEquals(expectedMessage,actualMessage);
		logger.info("User should see a message display");
	   
	}

	

}
