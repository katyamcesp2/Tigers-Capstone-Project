package step.definition;


import java.util.List;


import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import page.objects.DeskTopsPageObject;
import page.objects.RetailPageObj;
import utilities.Utils;

public class RetailPageStepDef  extends Base{
	
	RetailPageObj retailPageObject = new RetailPageObj();
	
	@Given("User is on Retail website")
    public void user_is_on_retail_website() {
		String expectedText="TEST ENVIRONMENT";
		String actualText= retailPageObject.homePage();
		Assert.assertEquals(expectedText,actualText);
		logger.info("User is on Retail Page");
		
    }
    @And("User click on My Account")
    public void user_click_on_my_account() {
    	retailPageObject.clickOnMyAccount();
    	logger.info("User clicked on My Account");
    	Utils.hardWait(1000);
    }
    @When("User click on Login")
    public void user_click_on_login() {
    	retailPageObject.clickOnLoginLink();
    	logger.info("User clicked on Login");
    }
    @And("User enter username {string} and password {string}")
    public void user_enter_username_and_password(String email, String password) {
    	retailPageObject.enterEmailAddress("kmcesp22@gmail.com");
    	retailPageObject.enterPassword("tekschool3");
    	logger.info("User entered username and password");
    }
    @And("User click on Login button")
    public void user_click_on_login_button() {
    	retailPageObject.clickOnLoginButton();
    	logger.info("User clicked on Login button");
    }
    @Then("User should be logged in to My Account dashboard")
    public void user_should_be_logged_in_to_my_account_dashboard() {
    	String expectedText="My Account";
    	String actualText= retailPageObject.validateMyAccountMessage();
    	Assert.assertEquals(expectedText,actualText);
    	logger.info("User landed on the My Account dashboard");
		
	}
    //Scenario#1
     //Register an Affiliate user with Cheque Payment Method

    @When("User click on Register for an Affiliate Account link")
    public void User_click_on_Register_for_an_Affiliate_Account_link() {
        retailPageObject.clickOnRegisterAffiliateAccountText();
        logger.info("User clicked on Register for an Affiliate Account Link");
    }
    @And("User fill affiliate form with below information")
    public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        retailPageObject.enterCompanyName(data.get(0).get("company"));
        retailPageObject.enterWebsiteName(data.get(0).get("website"));
        retailPageObject.enterTaxId(data.get(0).get("taxID"));
        retailPageObject.enterChequeRadioButton();
        retailPageObject.enterChequePayeeNameField(data.get(0).get("chequepayeename"));
        logger.info("User filled affiliated account form successfully");
    }
    @And("User check on About us check box")
    public void user_check_on_about_us_check_box() {
        retailPageObject.clickOnAboutUsCheckBox();
        logger.info("User checked the About Us successfully");
    }
    @And("User click on Continue button")
    public void user_click_on_continue_button() {
        retailPageObject.clickOnContinueButton();
        logger.info("User clicked on the continue button succcessfully");
    }
    @Then("User should see a success message")
    public void user_should_see_a_success_message() {
        String expectedMessage = "Success: Your account has been successfully updated.";
        String actualMessage = retailPageObject.successMessageOnAffiliateAccount();
        Assert.assertEquals(expectedMessage, actualMessage);
        logger.info("User see a success message successfully");
        
    }
    //Scenario#2 Edit your affiliate information
    @When("User click on Edit your affiliate information link")
    public void user_click_on_edit_your_affiliate_information_link() {
    	retailPageObject.clickOnEditAffiliateInfoLink();
    	logger.info("User clicked on Edit your affiliate information link");
        
    }
    @When("User click on Bank Transfer radio button")
    public void user_click_on_bank_transfer_radio_button() {
       retailPageObject.clickOnBankTransferRadioButton();
       logger.info("User clicked on Bank Transfer radio button");
       
    }
    @When("user fill bank information with below information")
    public void user_fill_bank_information_with_below_information(DataTable dataTable) {
    	List<Map<String,String>> info= dataTable.asMaps(String.class,String.class);
    	retailPageObject.enterBankNameField(info.get(0).get("bankName"));
    	retailPageObject.enterAbaNumberField(info.get(0).get("abaNumber"));
    	retailPageObject.enterSwiftCodeField(info.get(0).get("swiftCode"));
    	retailPageObject.enterBankAccountNameField(info.get(0).get("accountName"));
    	retailPageObject.enterBankAccountNumberField(info.get(0).get("accountNumber"));
    	logger.info("User filled bank information with below information");
    	
    	
        
    }
    // Scenario#3 edit your account information
    
    @When("User click on Edit your account information link")
    public void user_click_on_edit_your_account_information_link() {
    	retailPageObject.clickOnEditYourAccountInfo();
    	logger.info("User clicked on Edit your account information link");
        
    }
    @When("User modify below information")
    public void user_modify_below_information(DataTable dataTable) {
    	retailPageObject.clearEditFirstName();
    	retailPageObject.clearEditLastName();
    	retailPageObject.clearEmail();
    	retailPageObject.clearTelephoneNumber();
    	
    	List<Map<String,String>>editInfo= dataTable.asMaps(String.class,String.class);
    	retailPageObject.editFirstName(editInfo.get(0).get("firstname"));
    	retailPageObject.editLastName(editInfo.get(0).get("lastName"));
    	retailPageObject.EditEmail(editInfo.get(0).get("email"));
    	retailPageObject.editTelephoneNumber(editInfo.get(0).get("telephone"));
    	logger.info("User modified below information");
       
    }
    @When("User click on continue button")
    public void userClickOnContinueButton() {
    retailPageObject.clickOnContinueButtonEditAcctInfo();
    logger.info("User clicked on continue button");
    
      
    }
    @Then("User should see a message {string}")
    public void user_should_see_a_message(String string) {
        String expectedMessage = "Success: Your account has been successfully updated."; 
        String actualMessage = retailPageObject.editYourAcctInfoSucessMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
        logger.info("User see a message: Success: Your account has been successfully updated.");
       
}
}	
	
	
