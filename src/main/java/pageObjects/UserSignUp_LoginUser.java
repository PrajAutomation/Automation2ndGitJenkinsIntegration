package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSignUp_LoginUser{
	
	WebDriver driver;
	public UserSignUp_LoginUser(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@data-qa='signup-name']" )
	WebElement userNameSignUpTxt;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement userEmailSignUpTxt;
	
	@FindBy(xpath="//button[@data-qa='signup-button']")
	WebElement userSignUpButton;
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement userLoginEmailTxt;
	
	@FindBy(xpath="//input[@data-qa='login-password']")
	WebElement userLoginPassTxt;
	
	@FindBy(xpath="//input[@data-qa='login-button']")
	WebElement userLoginBtn;
	
	public WebElement getUserLoginBtn() {
		return userLoginBtn;
	}
	public WebElement getUserLoginPassTxt() {
		return userLoginPassTxt;
	}
	
	public WebElement getUserLoginEmailTxt() {
		return userLoginEmailTxt;
	}

	public WebElement getUserNameSignUpTxt()
	   {
		   return userNameSignUpTxt;
	   }
	
	public WebElement getUserEmailSignUpTxt()
	{
		return userEmailSignUpTxt;
	}
	
	public WebElement getSignUpButton() {
		return userSignUpButton;
	}
}
