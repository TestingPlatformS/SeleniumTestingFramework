package PhpTravelsTest;

import java.io.IOException;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import DriverManagement.DriverManager;
import DriverManagement.TestBase;
import PageObjects.RegistrationPage;

import PageObjects.AfterLoginPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
 

public class RegistrationTest extends TestBase {

	@Test//(enabled=false)
	public void DataDrivenRegistrationTest() throws InterruptedException, IOException {
		//Expected result
		String expected = "Hi, Tensa Zangetsu";

		HomePage hp = new HomePage( );
		RegistrationPage rp= hp.SignUpProcess();
		AfterLoginPage alp = rp.LoginProcess();
		//alp.VerifyProcess();
		//Actual result
		Thread.sleep(2000);
		String actual = alp.Verify().getText();
		//Assertion text
		Assert.assertEquals(actual, expected);


	}
		 



	// The same test with manually passing values

	@Test
	public void ManualPassingValuesRegistrationTest() throws InterruptedException, IOException {
		// you are creating object of the first homepage
		HomePage hp = new HomePage();
		// Click on Account button
		hp.Account().click();
		// Click on sign up button
		hp.SignUp().click();
		// redirected to sec Reg Page and that is why you are creating object of that
		// page
		RegistrationPage reg = new RegistrationPage();
		// Enter first name
		reg.enterName("Santhosh");
		// Enter last name
		reg.enterLast("Gabriellito");
		// Enter contact
		reg.enterContactNumber("999667");
		// Enter email
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		String ema = "username" + randomInt + "@gmail.com";
		reg.enterEmail(ema);
		// Enter password
		String ps = RandomStringUtils.randomAlphanumeric(8);
		reg.enterPassword(ps);
		// Confirm Password
		reg.enterConfirmPassword(ps);
		// Click Sign up button
		((JavascriptExecutor) DriverManager.getWebDriver()).executeScript("arguments[0].scrollIntoView(true);",
				reg.signUpButton());
		reg.signUpButton().click();
		// customer get navigated to account page - new object needs to be created
		AfterLoginPage alp = new AfterLoginPage();
		Thread.sleep(2000);
		// Expected message
		String expected = "Hi, Santhosh Gabriellito";
		// Actual message
		String actual = alp.Verify().getText();
		// Compare the values using assertion
		Assert.assertEquals(actual, expected);
		// Click on current user
		alp.CurrentUser().click();
		// Click on logout
		alp.Logout().click();
		
	}

	
	/*Test 3 
	 * 
	 * Create Test for invalid email on registration page -> verify that correct error message occurs on the top of the page
	 * 
	 * 
	 *********************************************
	 * Test 4
	 * 
	 * Create Test for blank email on registration page -> verify that correct error message occurs on the top of the page
	 * 
	 * ******************************************************************
	 * 
	 * Test 5
	 * 
	 * Create Test for password doesnt match  confirmation password on registration page -> verify that correct error message occurs on the top of the page
	 * 
	 * *-**************************************************
	 * Test 6
	 * 
	 * Create Test for less than 6 character password on registration page -> verify that correct error message occurs on the top of the page
	 * 
	 * 
	 * 
	 * 
	 * */
}
