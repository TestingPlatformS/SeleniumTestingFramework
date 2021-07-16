package PageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DataDriven.DataDriven;
import DriverManagement.DriverManager;

public class RegistrationPage {

	public static String em;
	public static String s;

	public RegistrationPage() {
		// Accessing WebDriver from DriverManager.java
		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}
    ////Finding the elements on the RegistrationPage
	@FindBy(name = "firstname")
	WebElement first;

	@FindBy(name = "lastname")
	WebElement last;

	@FindBy(name = "phone")
	WebElement phone;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(name = "confirmpassword")
	WebElement confirm;

	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	WebElement button;

	public static String getEmail() {
		return em;
	}
	public static String getPassword() {
		return s;
	}
	
	// Methods used to call the elements on the RegistrationPage
	public WebElement firstName() {
		return first;
	}

	public WebElement lastName() {
		return last;
	}

	public WebElement contact() {
		return phone;
	}

	public WebElement emailId() {
		return email;
	}

	public WebElement password() {
		return pass;
	}

	public WebElement confirmPassword() {
		return confirm;
	}

	public WebElement signUpButton() {
		return button;
	}

	public AfterLoginPage LoginProcess() throws IOException {
		// Create a object for dataDriver class
		DataDriven a = new DataDriven();
		ArrayList<String> data = a.getDataa("Registration");
		// Enter first name
		first.sendKeys(data.get(1));
		// Enter last name
		last.sendKeys(data.get(2));
		// Enter contact
		phone.sendKeys(data.get(3));
		// Enter email
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		em = "username" + randomInt + "@gmail.com";
		email.sendKeys(em);
		// email.sendKeys("tz2@gmail.com");
		// Enter password
		s = RandomStringUtils.randomAlphanumeric(8);
		pass.sendKeys(s);
		// Confirm password
		confirm.sendKeys(s);
		// Click on signUp button
		((JavascriptExecutor) DriverManager.getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", button);
		button.click();

		//Go to AfterLoginPage.java
		return new AfterLoginPage();
	}
       //Methods used to input data into each field on RegistrationPage
	public void enterName(String name) {
		first.sendKeys(name);
	}

	public void enterLast(String Last) {
		last.sendKeys(Last);
	}

	public void enterContactNumber(String _phone) {
		phone.sendKeys(_phone);
	}

	public void enterEmail(String _email) {
		email.sendKeys(_email);
	}

	public void enterPassword(String _pass) {
		pass.sendKeys(_pass);
	}

	public void enterConfirmPassword(String _cpass) {
		confirm.sendKeys(_cpass);
	}

	public void ClickSignUp() {
		button.click();
	}

}
