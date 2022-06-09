package Automation;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPageApp;
import pageObjects.UserSignUp_LoginUser;
import resources.baseInitializar;

public class LoginCorrectUserValidate extends baseInitializar{

	@BeforeTest
	public void InitializeBrowser() throws Exception {
		
		driver=initializeDriver();
		//driver.get("https://automationexercise.com/");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void ValidateLoginCorrectUser() {
		LandingPageApp LPA = new LandingPageApp(driver);
		LPA.getsignInLogInLink().click();
		
		UserSignUp_LoginUser USL = new UserSignUp_LoginUser(driver);
		USL.getUserLoginEmailTxt().sendKeys("amit123@xyz.com");
		USL.getUserLoginPassTxt().sendKeys("1234");
		
		USL.getUserLoginBtn().click();
		
		//Assert.assertEquals(actual, expected);
		
	}
}
