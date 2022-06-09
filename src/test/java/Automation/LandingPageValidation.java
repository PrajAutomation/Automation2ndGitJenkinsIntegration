package Automation;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPageApp;
import resources.baseInitializar;

public class LandingPageValidation extends baseInitializar{
	
	public WebDriver driver;
	
	
	@BeforeTest
	public void InitializeBrowser() throws Exception {
		
		driver=initializeDriver();
		//driver.get("https://automationexercise.com/");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void validateLandingPage() {
		LandingPageApp LPA = new LandingPageApp(driver);
		boolean flag =LPA.gethomeLink().isDisplayed();
		Assert.assertTrue(flag, "Landing Page not available");
	}
	
	@AfterTest
	public void TearDown() {
		
		driver.close();
	}

}
