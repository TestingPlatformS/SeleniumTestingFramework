package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverManagement.DriverManager;

public class HomePage {
// Object HomePage will be created from this class
//Main HomePage

	public HomePage() {
        // Accessing WebDriver from DriverManager.java
		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}
     //Finding the elements on the HomePage
	@FindBy(xpath = "//div[@class='dropdown dropdown-login dropdown-tab']/a")
	WebElement account;

	@FindBy(xpath = "//div/a[contains(text(),'Sign Up')]")
	WebElement signUp;
	
	@FindBy(xpath = "//div/a[contains(text(),'Login')]")
	WebElement logIn;

	// Methods used to call the elements on the HomePage
	public WebElement LogIn() {
		return logIn;
	}

	public WebElement Account() {
		return account;
	}

	public WebElement SignUp() {
		return signUp;
	}

	//SignUp on the HomePage
	public RegistrationPage SignUpProcess() {

		// Click on myAccount button
		account.click();
		// Click on Sign up button
		signUp.click();
		return new RegistrationPage();
	}

	
	/*Test 1 /Verify the title on the  next page is working when searching
	 * 
	 * Click on  Hotel then input  Destination choose dates for checkin and checkout and select 1 adult 
	 * then click search and verify title on the next page
	 * 
	 *********************************************
	 *
	 * Test 2 / Verify the text on the button on the next page
	 * 
	 * Click on Flights with round trip selected and choose your destination and class type  First with 1 adult 
	 *  then search and verify the text on the button for booking
	 * 
	 * ********************************************
	 * 
	 * Test 3 / Verify the text  on the next page 
	 * 
	 * Click on  Boats input  any destination and boat with 1 adult  then search and verify the text year for 
	 * that boat
	 * 
	 * *-*******************************************
	 * Test 4 / Navigate to the booking page 
	 * 
	 * 
	 * Click on  Visa select  any countries  and date then click on  submit and fill out the information
	 * then click booking
	 * 
	 * 
	 * Test 5 / Change language on the page 
	 * 
	 * Click on  Languages  and  select language and verify the language selected
	 * 
	 * *-*******************************************
	 * 
	 * 
	 * Test 6 / Change Currency for the page
	 * 
	 * Click on the  Currency and   select the currency then assert it
	 * 
	 * *-*******************************************
	 * Test 7 / Click on Company tab then Contact then navigate to Contact page then verify text
	 * 
	 * Hover on to "COMPANY", click on "Contact" and verify the text on top right "call now:+1-234-56789"
     * 
     * *-*******************************************
     * 
     * Test 8 / Click on to "COMPANY", click on "About Us" and go to the footer and click on "Our Partners" and verify the text
     * 
     *  Hover on to "COMPANY", click on "About Us" and go to the footer and click on "Our Partners" and verify the text "Here is a list of our partners. If you are interested in partnering with us, please email us thank you."
     *  *-******************************************
     *  
     * Test 9 / Scroll down to the page click on Powered PHP Travels then scroll down to Testimonials and verify name
     *  
     * Scroll down to the page and click on "PHP TRAVELS" icon and go to Testimonials section and verify the name "BookingJordan - Khalid Nawaflah"
     *  
     * *-*******************************************
	 * 
	 * Test 10 / Subscribe to the newsletter at the bottom of the bottom of the page
     *  
     * Scroll down to the page and click on "PHP TRAVELS" and subscribe to the newsletter with an email address and click subscribe"
     *  
     * *-*******************************************
	 * 
	 * */
}
