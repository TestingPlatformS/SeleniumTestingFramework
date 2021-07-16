package DriverManagement;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	protected WebDriver driver;
	
   //Before each test always runs
	@BeforeMethod
	public void before() {
		//start the WebDriver before the method
		driver = DriverManager.getWebDriver();
		// Maximize the window
		driver.manage().window().maximize();
		// navigate to URL
		driver.get("https://www.phptravels.net/home");
		// delete cookies
		driver.manage().deleteAllCookies();
	}
	//After each test always runs
	@AfterMethod
	//Stop the WebDriver after the method
	public void after() {
		DriverManager.killDriver();

	}

}
