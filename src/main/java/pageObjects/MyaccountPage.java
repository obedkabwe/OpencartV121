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
	WebElement msgHeading;	
	
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") 
	WebElement lnkLogout;
	
	
	
	
	 public boolean isMyAccountPageExists()   // MyAccount Page heading display status
		{
			try {
				return (msgHeading.isDisplayed());
			} catch (Exception e) {
				return (false);
			}
		}

		public void clickLogout() {
			lnkLogout.click();

		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
