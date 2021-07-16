package PhpTravelsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import DriverManagement.TestBase;
import PageObjects.HomePage;
import PageObjects.LoginPage;

public class LoginTest extends TestBase
{
	//In case of running this code you are required to create an account on PHPTRAVELS
@Test
	public void SuccessfulLogin() throws InterruptedException
	{
	// Create a new object of Login scenario
			HomePage hp = new HomePage();
					 
			// Click on Account
			hp.Account().click();
			// Click on login
			hp.LogIn().click();
			// Create a object of login page
			LoginPage lp = new LoginPage();
			// Enter email
			lp.enterEmail("test@test1.com");
			// Enter password
			lp.enterPassword("test123");
			// Click on Login
			lp.Login().click();
			// Sleep for 2 seconds
			Thread.sleep(2000);
			// Expected string
			String Loginexpected = "Hi, test test";
			// Actual string
			String Loginactual = lp.Verify().getText();
			// Comparing expected and actual values using assertion
			Assert.assertEquals(Loginactual, Loginexpected);

}

/*
 * /*Test 3 
	 * 
	 * Create Test for invalid email on login page -> verify that correct error message occurs on the top of the page
	 * 
	 * 
	 *********************************************
	 * Test 4
	 * 
	 * Create Test for blank email on login page -> verify that correct error message occurs on the top of the page
	 * 
	 * ******************************************************************
	 * 
	 * Test 5
	 * 
	 * Create Test for invalid password on login page -> verify that correct error message occurs on the top of the page
	 * 
	 * *-**************************************************
	 * Test 6
	 * 
	 * Create a test to validate that once Forger Password button gets clicked customer can see pop-up Forget Password 
	 * 
	 * ************************************************
	 * Test 7
	 * 
	 * Create a test to validate that once Sign Up button gets clicked customer is moved to SignUp page 
	 * 
	 * Test 8
	 * 
	 * Create a test to validate that once Remember Me button is clicked during positive test -> Customer can see the same credentaials during sec attempt
	 * 
	 * 
	 * */
 

}
