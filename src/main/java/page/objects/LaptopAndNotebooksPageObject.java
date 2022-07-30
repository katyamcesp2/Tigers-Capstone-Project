package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class LaptopAndNotebooksPageObject extends Base {
	
	public LaptopAndNotebooksPageObject(){
		PageFactory.initElements(driver, this);
	}
	//Background
	@FindBy(xpath= "//a[text()='TEST ENVIRONMENT']")
	private WebElement retailPage;
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	private WebElement lapTopAndNoteBookTab;
	@FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
	private WebElement lapTopAndNoteBookOption;
	
	//Scenario#1 Add and Remove a Mac book from Cart
	@FindBy(xpath="(//a//img[@class='img-responsive'])[3]")
	private WebElement macbookItem;
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement addToCartButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement addToCartSuccessMessage;
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement itemAddedToCart;
	@FindBy(xpath="//span[text()='Shopping Cart']")
	private WebElement cartOption;
	@FindBy(xpath="//button[@class='btn btn-danger']")
	private WebElement removeItemFromCart;
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement itemRemovedFromCart;
	
	//Scenario#2 Product Comparison
	@FindBy(xpath="(//i[@class='fa fa-exchange'])[2]")
	private WebElement macBookcompareProduct;
	@FindBy(xpath="(//i[@class='fa fa-exchange'])[3]")
	private WebElement macBookAirCompareProduct;
	@FindBy(xpath="//a[text()='product comparison']")
	private WebElement productComparisonLink;
	@FindBy(xpath="//table[@class='table table-bordered']")
	private WebElement comparisonChart;
	
	//Scenario#3  Adding an item to Wish list
	@FindBy(xpath="(//i[@class='fa fa-heart'])[6]")
	private WebElement heartIcon;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement mustLoginMessage;
	
	//Scenario#4 Validate the price of MacBook Pro is 2000
	@FindBy(xpath="(//img[@class='img-responsive'])[5]")
	private WebElement macBookProItem;
	@FindBy(xpath="//h2[text()='$2,000.00']")
	private WebElement validatePrice;
	
	


// Background
public String userIsOnRetailPage() {
	String testEnvironment= retailPage.getText();
	return testEnvironment;
	
}
public void clickOnLaptopAndNoteBookTab() {
	lapTopAndNoteBookTab.click();
}
public void clickOnShowAllLapTopAndNoteBookOption() {
	lapTopAndNoteBookOption.click();
}
// Scenario#1 Add and Remove a Mac book from Cart
public void clickOnMacBookItem() {
	macbookItem.click();	
}
public void clickOnAddToCartButton() {
	addToCartButton.click();
}
public String userShouldSeeSuccessMessage() {
	Utils.highlightelementBackground(addToCartSuccessMessage);
	String cartSuccessMessage=addToCartSuccessMessage.getText();
	return cartSuccessMessage;
	
}
public boolean userShouldSeeOneItemOnCart() {
	if(itemAddedToCart.isDisplayed()) {
		return true;
	}else {
		return false;
	}
			
}
public void clickOnCartOption() {
	cartOption.click();
}
public void clickOnRemoveButton() {
	removeItemFromCart.click();
}
public boolean itemShouldBeRemoved() {
if(itemRemovedFromCart.isDisplayed()) {
	return true;
}else {
	return false;
}
}
//Scenario#2 Product Comparison

public void clickOnProductComparisonIconMacbook() {
	macBookcompareProduct.click();
}

public void clickOnProductComparisonIconMacbookAir() {
	macBookAirCompareProduct.click();
}

public void userClickOnProductComparisonLink() {
	productComparisonLink.click();
}
public boolean  userShouldSeeProductComparisonChart() {
	Utils.highlightelementBackground(comparisonChart);
	if( comparisonChart.isDisplayed()) {
          return true;
   }else{
	return false;
}
}
//Scenario#3  Adding an item to Wish list

public void clickOnHeartIconToAddSonyValoLaptop() {
	heartIcon.click();
}
public String youMustLoginOrCreateAccountMessage() {
	Utils.highlightelementBackground(mustLoginMessage);
	String loginMessage= mustLoginMessage.getText();
	return loginMessage;
}

//Scenario#4 Validate the price of MacBook Pro is 2000

public void  clickOnMacbookProItem() {
	macBookProItem.click();
	
}
public String userShouldSeePriceTag() {
	Utils.highlightelementBackground(validatePrice);
	String actualPrice = validatePrice.getText();
	return actualPrice;
	
}

}
