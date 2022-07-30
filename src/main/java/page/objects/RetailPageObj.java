package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class RetailPageObj extends Base{
	
	public RetailPageObj() {
	
	PageFactory.initElements(driver,this);
	
	}
	//Background
	@FindBy(xpath="//a[text()='TEST ENVIRONMENT']")
	private WebElement retailPageTest;
	
	@FindBy(xpath= "//span[text()='My Account']")
	private WebElement myAccountButton;
	
	 @FindBy(xpath="(//ul//a[text()='Login'])[1]")
	 private WebElement loginLink;
	 
	 @FindBy(id= "input-email")
	 private WebElement emailAddressField;
	 
	 @FindBy(id="input-password")
	 private WebElement passwordField;
	 
	 @FindBy(xpath="//input[@value= 'Login']")
	 private WebElement loginButton;
	 
	 @FindBy(xpath="//h2[text()= 'My Account']")
	 private WebElement validateMyAccount;
	 
	 //Scenario#1 Register Affiliate user with cheque payment method
	
	    @FindBy(xpath = "//li//a[text()='Register for an affiliate account']")
	    private WebElement regForAffiliateAccount;
	    @FindBy(xpath = "//input[@id='input-company']")
	    private WebElement companyField;
	    @FindBy(xpath = "//input[@id='input-website']")
	    private WebElement websiteField;
	    @FindBy(xpath = "//input[@id='input-tax']")
	    private WebElement taxIdField;
	    @FindBy(xpath = "//input[@value = 'cheque']")
	    private WebElement chequeRadioButton;
	    @FindBy(xpath = "//input[@id= 'input-cheque']")
	    private WebElement chequePayeeName;
	    @FindBy(xpath = "//input[@type='checkbox']")
	    private WebElement aboutUsCheckBox;
	    @FindBy(xpath = "//input[@class='btn btn-primary']")
	    private WebElement continueButton;
	    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	    private WebElement successMessage;
	    
	    // Scenario#2 Edit your affiliate account information
	    @FindBy(xpath="(//li//a[text()='Edit your affiliate information'])[1]")
	    private WebElement editAffiliateAccount;
	    @FindBy(xpath="//input[@value='bank']")
	    private WebElement bankTransferRadioButton;
	    @FindBy(xpath="//input[@id='input-bank-name']")
	    private WebElement enterBankName;
	    @FindBy(xpath="//input[@id='input-bank-branch-number']")
	    private WebElement enterAbaNumber;
	    @FindBy(xpath="//input[@id='input-bank-swift-code']")
	    private WebElement enterSwiftCode;
	    @FindBy(xpath="//input[@id='input-bank-account-name']")
	    private WebElement enterBankAccountName;
	    @FindBy(xpath="//input[@id='input-bank-account-number']")
	    private WebElement enterBankAccountNumber;
	    @FindBy(xpath="//input[@value='Continue']")
	    private WebElement clickOnContinueButton;
	    @FindBy(xpath="(//div[@class='alert alert-success alert-dismissible'])[1]")
	    private WebElement successMessageOnEditAccount;
	    
	    //Scenario#3 edit your account information
	    @FindBy(xpath="//a[text()='Edit your account information']")
	    private WebElement editYourAcctInfo;
	    @FindBy(xpath="//input[@id='input-firstname']")
	    private WebElement enterFirstName;
	    @FindBy(xpath="//input[@id='input-lastname']")
	    private WebElement enterLastName;
	    @FindBy(xpath="//input[@id='input-email']")
	    private WebElement enterEmail;
	    @FindBy(xpath="//input[@id='input-telephone']")
	    private WebElement enterTelephoneNumber;
	    @FindBy(xpath="//input[@value='Continue']")
	    private WebElement ContinueButton;
	    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	    private WebElement successMessageOnEditInfo;
	    
	 
	 




 public String homePage() {
	String environmentText =retailPageTest.getText();
	return environmentText;
	
 }
 // Background
 public void clickOnMyAccount() {
	 myAccountButton.click();
 }
 public void clickOnLoginLink() {
	 loginLink.click();
 }
 public void enterEmailAddress(String email) {
	 emailAddressField.sendKeys(email);
 }
 public void enterPassword(String password) {
	 passwordField.sendKeys(password);
 }
	 
 public void clickOnLoginButton() {
	 loginButton.click();
		
	}
 public String validateMyAccountMessage() {
	 String myAccountText = validateMyAccount.getText();
	 return myAccountText;
 }
 
 //Scenario #1
 public void clickOnRegisterAffiliateAccountText() {
	 regForAffiliateAccount.click();
 }
 public void enterCompanyName(String company) {
	 companyField.sendKeys(company);
	 
 }
 public void enterWebsiteName(String website) {
	 websiteField.sendKeys(website);
 }
 public void enterTaxId(String taxId) {
	 taxIdField.sendKeys(taxId);
 }
 public void enterChequeRadioButton() {
	 chequeRadioButton.click();
 }
 public void enterChequePayeeNameField(String payeeName) {
	 chequePayeeName.sendKeys(payeeName);
 }
 public void clickOnAboutUsCheckBox() {
	 aboutUsCheckBox.click();
 }
 public void clickOnContinueButton() {
	 continueButton.click();
 }
 public String successMessageOnAffiliateAccount() {
	 Utils.highlightelementBackground(successMessage);
	 String successMessageOnAffiliateAccount= successMessage.getText();
	 return successMessageOnAffiliateAccount;
	 
	 
 }
 // Scenario#2 Edit affiliate account
 public void clickOnEditAffiliateInfoLink() {
	 editAffiliateAccount.click();
 }
 public void clickOnBankTransferRadioButton() {
	 bankTransferRadioButton.click();
 }
 public void enterBankNameField(String BankName) {
	 enterBankName.sendKeys(BankName);
 }
 public void enterAbaNumberField(String abaNumber) {
	 enterAbaNumber.sendKeys(abaNumber);
 }
 public void enterSwiftCodeField(String swiftCode) {
	 enterSwiftCode.sendKeys(swiftCode);
 }
 public void enterBankAccountNameField(String accountName) {
	 enterBankAccountName.sendKeys(accountName);
 }
 public void enterBankAccountNumberField(String accountNumber) {
	 enterBankAccountNumber.sendKeys(accountNumber);
 }
 public void userClickOnContinueButton() {
	 clickOnContinueButton.click();
	 
 }
 public String editAffiliateSuccessMessage() {
	 Utils.highlightelementBackground(successMessageOnEditAccount);
	 String successMessageOnEditAffiliateInfo=successMessageOnEditAccount.getText();
	 return successMessageOnEditAffiliateInfo;
 }
 //Scenario#3 edit your account information
 public void clickOnEditYourAccountInfo() {
	 editYourAcctInfo.click();
 }
 public void clearEditFirstName() {
	 enterFirstName.clear();
 }
 public void editFirstName(String firstName) {
	 enterFirstName.sendKeys(firstName);
 }
 public void clearEditLastName() {
	 enterLastName.clear();
 }
 public void editLastName(String lastName) {
	 enterLastName.sendKeys(lastName);
 }
 public void clearEmail() {
	 enterEmail.clear();
 }
 public void EditEmail(String email) {
	 enterEmail.sendKeys(email);
 }
 public void clearTelephoneNumber() {
	 enterTelephoneNumber.clear();
 }
 public void editTelephoneNumber(String phoneNumber) {
	 enterTelephoneNumber.sendKeys(phoneNumber);
 }
 public void clickOnContinueButtonEditAcctInfo() {
	 continueButton.click();
	 
	 
 }
 public String editYourAcctInfoSucessMessage() {
	 Utils.highlightelementBackground(successMessageOnEditInfo);
	 String successMessageOnEditYourAcctInfo=successMessageOnEditInfo.getText();
	 return successMessageOnEditYourAcctInfo;
 }
}
