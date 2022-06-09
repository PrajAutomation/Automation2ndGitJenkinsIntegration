package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageApp {

	WebDriver driver;
	public LandingPageApp(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//div[@class='shop-menu pull-right']/ul/li[1]/a" )
	WebElement homeLink;
	
	@FindBy(xpath ="//div[@class='shop-menu pull-right']/ul/li[4]/a" )
	WebElement SignInLogInLink;
	
	public WebElement getsignInLogInLink()
	   {
		   return SignInLogInLink;
	   }
	public WebElement gethomeLink()
	   {
		   return homeLink;
	   }
}
