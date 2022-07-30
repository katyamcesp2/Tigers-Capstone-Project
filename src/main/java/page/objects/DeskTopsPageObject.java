package page.objects;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.Utils;

public class DeskTopsPageObject extends Base{
	
	public DeskTopsPageObject() {
	PageFactory.initElements(driver, this);
		
	}
   //Background 
	@FindBy (xpath= "//a[text()='Desktops']")
	private WebElement desktops;
	@FindBy(xpath= "//a[text() ='Show All Desktops']")
	private WebElement showAllDesktops;
	
	// Scenario#1 user verify all items are present in Desktops tab
	@FindBy(tagName="img")
	private List<WebElement> items;
	
	// Scenario#2 User add HP LP 3065 from Desktops tab to the cart
	@FindBy(xpath="//a[text()='HP LP3065']")
	private WebElement hplP3065;
	@FindBy(id="input-quantity")
	private WebElement quantityInput;
	@FindBy(id="button-cart")
	private WebElement addToCartButton;
	@FindBy(xpath="(//div//a[text()='HP LP3065'])[3]")
	private WebElement HPLPSucessMessage;
	
	// Scenario#3 User add Canon EOS 5D from Desktops tab to the cart
	@FindBy(xpath="(//span[text()='Add to Cart'])[2]")
	private WebElement addToCartCanon5DCamera;
	@FindBy(xpath="(//select[@id='input-option226'])[1]")
	private WebElement selectDropDown;
	@FindBy(id="input-quantity")
	private WebElement selectQuantity;
	@FindBy(id="button-cart")
	private WebElement addCartButton;
	@FindBy(xpath="(//div//a[text()='Canon EOS 5D Camera'])[3]")
	private WebElement canon5DCameraSucessMessage;
	
	// Scenario#4 User add a review to Canon EOS 5D item in Desktops tab
	@FindBy(xpath="//img[@title='Canon EOS 5D Camera']")
	private WebElement CanonEOS5DCamera;
	@FindBy(xpath="//a[text()='Write a review']")
	private WebElement writeReviewLink;
	@FindBy(id="input-name")
	private WebElement yourNameField;
	@FindBy(id="input-review")
	private WebElement yourReviewField;
	@FindBy(xpath="//input[@type='radio']")
	private List<WebElement> rateReview;
	@FindBy(id="button-review")
	private WebElement reviewContinueButton;
	@FindBy(xpath="(//div[@class='alert alert-success alert-dismissible'])[1]")
	private WebElement ReviewSubmissionMessage;
	
	
	
	// Background 
	public void clickOnDeskTopsTab() {
	Utils.hoveMouseOverElement(desktops);
	}
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	//Scenario#1 all items are present
	public List <WebElement> deskTopItems(){
		List<WebElement> itemsDesk= items;
				return itemsDesk;
	
}
	// Scenario#2 add HPLP305I from desktop
	public void clickOnHPLP3065Item() {
		hplP3065.click();	
	}
	public void selectQuantity(String quantityValue) {
		quantityInput.clear();
		quantityInput.sendKeys("1");
	}
	public void clickOnCartButton() {
		addToCartButton.click();
	}
	public String sucessMessage() {
		String actualResult="Success: You have added"+HPLPSucessMessage.getText()+"to your shopping cart!";
		return actualResult;
				
	}
	//Scenario#3 add Canon5D from desktop
	public void clickOnEOS5DCamera() {
		addToCartCanon5DCamera.click();
	}
	public void selectColorFromDropDownRed() {
		Select select = new Select(selectDropDown);
	
		select.selectByValue("15");
	}
	public void selectOnQuantity(String quantityValues) {
		selectQuantity.clear();
		selectQuantity.sendKeys("1");
		
	}
	public void clickCartButton() {
		addCartButton.click();
	}
	public String canonSucessMessage() {
		String actualResult="Success: You have added"+canon5DCameraSucessMessage.getText()+"to your shopping cart!";
		return actualResult;
	
}
	// Scenario#4 add review to Canon
	public void clickOnCanonEOSCamera() {
		CanonEOS5DCamera.click();
	}
	public void clickOnWriteReviewLink() {
	writeReviewLink.click();
		
	}
	public void enterYourName(String nameValue) {
		yourNameField.sendKeys(nameValue);
	}
	
	public void enterYourReview(String reviewValue ) {
		yourReviewField.sendKeys(reviewValue);
	}
	
	public void SelectRating(String ratingValue) {
		List<WebElement> ratingElements= rateReview;
		for (WebElement element:ratingElements) {
		if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
			element.click();
			break;
		}
		
		}
		
	}
	public void clickOnContinueButton() {
		reviewContinueButton.click();
	}
	public String reviewMessage() {
		String messageResult=ReviewSubmissionMessage.getText();
				return messageResult;
		
	}
}