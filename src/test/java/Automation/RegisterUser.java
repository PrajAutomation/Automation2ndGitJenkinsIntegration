package Automation;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPageApp;
import pageObjects.UserSignUp_LoginUser;
import pageObjects.userAccountInformation;
import resources.baseInitializar;

public class RegisterUser extends baseInitializar{
	
	@BeforeTest
	public void InitializeBrowser() throws Exception {
		
		driver=initializeDriver();
		//driver.get("https://automationexercise.com/");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test(dataProvider="getData")
	public void validateUserRegistered(String name) throws Exception {
		LandingPageApp LPA = new LandingPageApp(driver);
		LPA.getsignInLogInLink().click();
		
		UserSignUp_LoginUser USL = new UserSignUp_LoginUser(driver);
		Assert.assertTrue(USL.getUserNameSignUpTxt().isDisplayed(), "User Sign Up page not loaded");
		USL.getUserNameSignUpTxt().sendKeys(name);
		USL.getUserEmailSignUpTxt().sendKeys("rameshpr123@gmail.com");
		USL.getSignUpButton().click();
		Thread.sleep(2000);
		String gender="Male";
		userAccountInformation UAI=new userAccountInformation(driver);
		if(gender.equals("Male")) {
			UAI.getTitle1RadioBtn().click();
		}else {
			UAI.getTitle2RadioBtn().click();
		}
		
		UAI.getPasswordTxt().sendKeys("1234");
		
		Select daySelect =new Select(UAI.getDateDays());
		daySelect.selectByValue("26");
		
		Select monthSelect =new Select(UAI.getDateMonths());
		monthSelect.selectByVisibleText("April");
		
		Select yearSelect=new Select(UAI.getDateYears());
		yearSelect.selectByVisibleText("2018");
		
		String wantOffer="yes";
		String newsLetter="yes";
		
		if(wantOffer.equals("yes")) {
			UAI.getCheckBoxOffer().click();
		}
		
		if(newsLetter.equals("yes")) {
			UAI.getCheckBoxNewsletter().click();
		}
		
		UAI.getFirstName().sendKeys("Ramesh");
		UAI.getLastName().sendKeys("Raj");
		
		UAI.getCompanyTxt().sendKeys("TCS");
		
		UAI.getAddress1Txt().sendKeys("Kankarbagh");
		UAI.getAddress2Txt().sendKeys("Patna");
		
		Select dropdownCountry =new Select(UAI.getCountryDropDown());
		dropdownCountry.selectByValue("India");
		
		UAI.getStateTxt().sendKeys("Bihar");
		UAI.getCityTxt().sendKeys("Patna");
		
		UAI.getZipCodeTxt().sendKeys("800027");
		UAI.getMobileNoTxt().sendKeys("9999999999");
		
		UAI.getCreateAccountBtn().click();
		
		//Thread.sleep(5000);
		WebDriverWait wait =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(UAI.getAcntCreatedTxt()));
		String ActualMsg =UAI.getAcntCreatedTxt().getText();
		Assert.assertEquals(ActualMsg, "ACCOUNT CREATED!");
		
	}
	
	@AfterTest
	public void TearDown() {
		driver.close();
	}

	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[1][1];
		data[0][0]="Ramesh";
		return data;
		
	}

}
