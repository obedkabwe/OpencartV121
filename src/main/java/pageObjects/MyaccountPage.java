package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyaccountPage extends BasePage{

	public MyaccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//h2[text()='My Account']") 
	WebElement myAccount;	
	
	public Boolean isLoginSuccessful() {
		try {
			return myAccount.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
