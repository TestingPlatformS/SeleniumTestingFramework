package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverManagement.DriverManager;

public class LoginPage {
	
	public LoginPage() {
		// Accessing WebDriver from DriverManager.java
		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}
	//Finding the elements on the LoginPage
	@FindBy(xpath = "//input[@type='email']")
	WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	
	@FindBy(xpath = "//div[@class='col-md-8']")
	WebElement verify;
	
	// Methods used to call the elements on the LoginPage
	public WebElement Email() {
		return email;
	}

	public WebElement Password() {
		return password;
	}
	
	public WebElement Login() {
		return login;
	}
	
	public WebElement Verify()
	{
		return verify;
	}
	// fill in the email and password to Login In
	public void fillDetails(String Email,String ppass)
	{
		email.sendKeys(Email);
		password.sendKeys(ppass);
	}
	
	public void enterEmail(String Email)
	{
		email.sendKeys(Email);
	}
	
	public void enterPassword(String ppass)
	{
		password.sendKeys(ppass);
	}
	public void fillDetails()
	{// fill in the email and password to Login In
		RegistrationPage rp = new RegistrationPage();
		email.sendKeys(rp.em);
		password.sendKeys(rp.s);
		login.click();
	}
}
