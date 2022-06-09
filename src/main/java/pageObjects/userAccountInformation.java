package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userAccountInformation {

	WebDriver driver;
	public userAccountInformation(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//div[@class='shop-menu pull-right']/ul/li[4]/a" )
	WebElement SignInLogInLink;
	
	@FindBy(id="id_gender1")
	WebElement title1RadioBtn;
	
	@FindBy(id="id_gender2")
	WebElement title2RadioBtn;
	
	@FindBy(xpath="//input[@data-qa='password']")
	WebElement passwordTxt;
	
	@FindBy(id="days")
	WebElement dateDay;
	
	@FindBy(id="months")
	WebElement dateMonth;
	
	@FindBy(id="years")
	WebElement dateYear;
	
	@FindBy(id="newsletter")
	WebElement checkBoxNewsletter;
	
	@FindBy(id="optin")
	WebElement checkBoxOffer;
	
	@FindBy(id="first_name")
	WebElement firstNameTxt;
	
	@FindBy(id="last_name")
	WebElement lastNameTxt;
	
	@FindBy(id="company")
	WebElement companyTxt;
	
	@FindBy(id="address1")
	WebElement address1Txt;
	
	@FindBy(id="address2")
	WebElement address2Txt;
	
	@FindBy(id="country")
	WebElement countryDropDown;
	
	@FindBy(id="state")
	WebElement stateTxt;
	
	@FindBy(id="city")
	WebElement cityTxt;
	
	@FindBy(id="zipcode")
	WebElement zipcodeTxt;
	
	@FindBy(id="mobile_number")
	WebElement mobile_numberTxt;
	
	@FindBy(xpath="//button[@data-qa='create-account']")
	WebElement createAccountBtn;
	
	@FindBy(xpath="//h2[@data-qa='account-created']/b")
	WebElement acntCreatedTxt;
	
	public WebElement getAcntCreatedTxt() {
		return acntCreatedTxt;
	}
	
	public WebElement getCreateAccountBtn() {
		return createAccountBtn;
	}
	
	public WebElement getMobileNoTxt() {
		return mobile_numberTxt;
	}
	
	public WebElement getZipCodeTxt() {
		return zipcodeTxt;
	}
	
	public WebElement getCityTxt() {
		return cityTxt;
	}
	
	public WebElement getStateTxt() {
		return stateTxt;
	}
	
	public WebElement getCountryDropDown() {
		return countryDropDown;
	}
	
	public WebElement getPasswordTxt() {
		return passwordTxt;
	}
	
	public WebElement getCompanyTxt() {
		return companyTxt;
	}
	
	public WebElement getAddress1Txt() {
		return address1Txt;
	}
	
	public WebElement getAddress2Txt() {
		return address2Txt;
	}
	
	public WebElement getFirstName() {
		return firstNameTxt;
	}
	
	public WebElement getLastName() {
		return lastNameTxt;
	}
	
	public WebElement getCheckBoxOffer() {
		return checkBoxOffer;
	}
	
	public WebElement getCheckBoxNewsletter() {
		return checkBoxNewsletter;
	}
	public WebElement getDateDays() {
		return dateDay;
	}
	
	public WebElement getDateMonths() {
		return dateMonth;
	}
	
	public WebElement getDateYears() {
		return dateYear;
	}
	
	public WebElement getSignInLogInLink() {
		   return SignInLogInLink;
	   }
	
	public WebElement getTitle1RadioBtn() {
		return title1RadioBtn;
	}
	
	public WebElement getTitle2RadioBtn() {
		return title2RadioBtn;
	}
}
