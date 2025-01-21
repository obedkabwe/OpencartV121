package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	@FindBy(xpath="//input[@id='input-email']") 
	WebElement eMailAddress;
	
	
	@FindBy(xpath="//input[@id='input-password']") 
	WebElement passcode;
	

	@FindBy(xpath="//input[@value='Login']") 
	WebElement logbuttpn;
	
	
	public void setenterEmail(String email) {
		eMailAddress.sendKeys(email);
	}
	
	
	public void setPasscod(String cod) {
		passcode.sendKeys(cod);
	}
	
	
	
	public void LoginButton() {
		logbuttpn.click();
	}
	
	
	
	
}
