package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import DriverManagement.DriverManager;

public class AfterLoginPage {

	public AfterLoginPage() {
		// Accessing WebDriver from DriverManager.java
		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}
    //Elements for the page after The Login form on the PHPTRAVELS
	@FindBy(xpath = "(//div/h3)[1]")
	WebElement verify;
	
	@FindBy(xpath = "(//a[@id='dropdownCurrency'])[2]")
	WebElement user;
	
	@FindBy(xpath = "//div/a[contains(text(),'Logout')]")
	WebElement logout;

	//Method to call the elements on this page
	public WebElement Verify() {
		return verify;
	}
	
	public WebElement CurrentUser() {
		return user;
	}
	
	public WebElement Logout() {
		return logout;
	}
	

	

}
