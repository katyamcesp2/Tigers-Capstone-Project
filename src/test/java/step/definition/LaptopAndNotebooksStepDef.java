package step.definition;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopAndNotebooksPageObject;
import utilities.Utils;

import org.junit.Assert;

public class LaptopAndNotebooksStepDef extends Base {
	LaptopAndNotebooksPageObject laptopAndNotebooksPage = new LaptopAndNotebooksPageObject();

// Background
	@Given("User is on Retail page")
	public void user_is_on_retail_page() {
		String expectedText= "TEST ENVIRONMENT";
	    String actualText= laptopAndNotebooksPage.userIsOnRetailPage();
	    Assert.assertEquals(expectedText,actualText);
	    logger.info("User in on Retail page");
	}
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopAndNotebooksPage.clickOnLaptopAndNoteBookTab();
		logger.info("User clicked on Laptop and NoteBook tab");
	    
	}
	@When("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopAndNotebooksPage.clickOnShowAllLapTopAndNoteBookOption();
		logger.info("User clicked on Show all Laptop and NoteBook option");
		
		
// Scenario Add and Remove a Mac book from Cart	   
	}
	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopAndNotebooksPage.clickOnMacBookItem();
		logger.info("User clicked on MacBook item");
	}
	@Then("User should see {int} item\\(s){double} showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
		laptopAndNotebooksPage.userShouldSeeOneItemOnCart();
		logger.info("User should see 1 item showed to the cart");
		
	   
	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopAndNotebooksPage.clickOnCartOption();
		logger.info("User clicked on cart option");
	    
	}
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopAndNotebooksPage.clickOnRemoveButton();
		logger.info("User clicked on red x button to remove the item from cart");
	   
	}
	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		laptopAndNotebooksPage.itemShouldBeRemoved();
		logger.info("item was removed and cart should show 0 items");
	  
		
	Utils.hardWait(3000);	
	}
	//Scenario#2 Product Comparison
	
	@Given("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String string) {
		laptopAndNotebooksPage.clickOnProductComparisonIconMacbook();
		logger.info("User clicked on product comparison icon ");
		Utils.hardWait(1000);
	    
	}
	@Given("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopAndNotebooksPage.clickOnProductComparisonIconMacbookAir();
		logger.info("User clicked on product comparison icon");
		Utils.hardWait(1000);
	}
	
	
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopAndNotebooksPage.userClickOnProductComparisonLink();
		logger.info("User clicked on Product comparison Link");
	    Utils.hardWait(1000);
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {	
	 laptopAndNotebooksPage.userShouldSeeProductComparisonChart();
		logger.info("User should see Product Comparison Chart");
	   Utils.hardWait(1000); 
	}
	
	//Scenario#3  Adding an item to Wish list
	
	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		laptopAndNotebooksPage.clickOnHeartIconToAddSonyValoLaptop();
		logger.info("User clicked on heart icon to add Sony ValO laptop to wish list");
	    
	}
	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
		String expectedmessage=("You must login or create an account to save Sony VAIO to your wish list");
		String actualMessage=laptopAndNotebooksPage.youMustLoginOrCreateAccountMessage();
		Assert.assertEquals(expectedmessage,actualMessage);
		logger.info("You must login or create an account to save Sony VAIO to your wish list");
	   	
	    
	}
	//Scenario#4 Validate the price of MacBook Pro is 2000
	@When("User click on {string} item")
	public void user_click_on_item(String string) {
		laptopAndNotebooksPage.clickOnMacbookProItem();
		logger.info("User clicked on macBook Pro item");
	    
	}
	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String expectedPrice) {
	 Assert.assertEquals(expectedPrice,laptopAndNotebooksPage.userShouldSeePriceTag());
	 logger.info("User should see $2000.00 price tag is present on UI.");
	   Utils.hardWait(1000);
	}
}
