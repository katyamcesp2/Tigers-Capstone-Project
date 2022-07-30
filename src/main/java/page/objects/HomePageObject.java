package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.Utils;

public class HomePageObject extends Base {
public HomePageObject() {
PageFactory.initElements(driver,this );


}
// Background
@FindBy(xpath="//a[text()='TEST ENVIRONMENT']")
private WebElement homePage;

//Scenario#1 User verify currency values change

@FindBy(xpath="//span[text()='Currency']")
private WebElement currency;
@FindBy(xpath="(//li//button[@class='currency-select btn btn-link btn-block'])[1]")
private WebElement euroCurrency;
@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']")
private WebElement currencyValue;

//Scenario#2 User empty shopping cart message displays

@FindBy(xpath="//span[text()='Shopping Cart']")
private WebElement shoppingCart;
@FindBy(xpath="(//div//p[text()='Your shopping cart is empty!'])[2]")
private WebElement shoppingCartIsEmpty;


//Scenario#1 User verify currency values change

public String userIsInRetailWebsite() {
	String homeWebside = homePage.getText();
	return homeWebside;
	
}
public void userClickOnCurrency() {
	currency.click();
}
public void chooseEuroFromDropDown() {
	euroCurrency.click();
}
public boolean currencyValueShouldChangedToEuro() {
	Utils.highlightelementBackground(currencyValue);
	if(currencyValue.isDisplayed()) {
		  return true;
	}else {
		return false;
	}
	
}
//Scenario#2 User empty shopping cart message displays


public void userClickOnShoppingCart() {
	shoppingCart.click();
}
public String shoppingCartEmptyMessage() {
	String messageResult= shoppingCartIsEmpty.getText();
	return messageResult;
}

}
