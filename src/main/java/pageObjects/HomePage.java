package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	//constructor
		
		

	
	
	
	@FindBy(xpath="//span[normalize-space()='My Account']") 
	 WebElement myAccount;
	@FindBy(xpath="//a[normalize-space()='Register']") 
	WebElement lnkregister;
	
	//@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Register']")

	
	public void clickMyAccount() {
		
		myAccount.click();
		
	}
	
	
	public void clickRegister() {
		lnkregister.click();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
