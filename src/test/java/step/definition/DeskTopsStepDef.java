package step.definition;


//import static org.junit.Assert.assertTrue;

import java.util.List;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
//import io.cucumber.core.logging.Logger;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;
import page.objects.DeskTopsPageObject;
import utilities.Utils;

public class DeskTopsStepDef extends Base{
	
	DeskTopsPageObject deskTopPage = new DeskTopsPageObject();
	
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		deskTopPage.clickOnDeskTopsTab();
		logger.info("user clicked on Desktops tab");	
	    
	}
	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		deskTopPage.clickOnShowAllDesktops();
		 logger.info("user clicked on show all desktops");
	}
	
	
	
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		
		List <WebElement> deskTopsElements= deskTopPage.deskTopItems();
		
		for(WebElement element:deskTopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title")+ " is present");	
			
		}
		
		
		Utils.hardWait(2000);

	   
	}

	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		deskTopPage.clickOnHPLP3065Item();
		logger.info("user clicked Add to Cart Option");
	   
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		deskTopPage.selectQuantity(string);
		logger.info("user selected quantity"+ string);
	    
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		deskTopPage.clickOnCartButton();
		logger.info("user clicked to cart button");
	    
	}

	//@Then("User should see a message {string}")
	//public void user_should_see_a_message(String expectedSuccessMessage) {
	//	Assert.assertEquals(deskTopPage.sucessMessage(),expectedSuccessMessage);
	//	logger.info(expectedSuccessMessage + "equals to"+ deskTopPage.sucessMessage());
	//	Utils.takeScreenshotForStep();
	//	Utils.hardWait(3000);
		
		
		
		
	   
	

	@When("User click ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
		deskTopPage.clickOnEOS5DCamera();
		logger.info("user clicked ADD TO CART option on Canon EOS Camera");
	    
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
	deskTopPage.selectColorFromDropDownRed();
		logger.info("user selected color from dropdown");
		
	    
	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		deskTopPage.clickOnEOS5DCamera();
		logger.info("user clicked on Canon EOS 5D item");
	    
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		deskTopPage.clickOnWriteReviewLink();
		logger.info("user clicked on write review link");
		
	    
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	List<Map<String,String>> reviewInfo= dataTable.asMaps(String.class,String.class);
	deskTopPage.enterYourName(reviewInfo.get(0).get("yourname"));
	deskTopPage.enterYourReview(reviewInfo.get(0).get("yourReview"));
	deskTopPage.SelectRating(reviewInfo.get(0).get("Rating"));
	logger.info("user filled the review information with below information");
	   
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		deskTopPage.clickOnContinueButton();
		logger.info("user clicked on Continue Button");
		
	    
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		String expectedmessage=("Thank you for your review. It has been submitted to the webmaster for approval.");
		String actualMessage=deskTopPage.reviewMessage();
		Assert.assertEquals(expectedmessage,actualMessage);
		logger.info("User see a message:Thank you for your review. It has been submitted to the webmaster for approval.");
	   
	}
}


	
	

	
