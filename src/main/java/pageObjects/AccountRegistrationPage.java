package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	//WebDriver driver;

	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//input[@id='input-firstname']") 
	WebElement firstName;
	
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastName;
	
	@FindBy(xpath="(//input[@id='input-email'])[1]") 
	WebElement eMail;
	
	@FindBy(xpath="//input[@id='input-telephone']") 
	WebElement telephone;
	
	@FindBy(xpath="//input[@id='input-password']") 
	WebElement password;
	
	@FindBy(xpath="//input[@id='input-confirm']") 
	WebElement confirm;
	
	@FindBy(xpath="//input[@name='agree']") 
	WebElement agreePolicy;
	
	
	@FindBy(xpath="//input[@value='Continue']") 
	WebElement btn;
	
	
	@FindBy(xpath="//h1[normalize-space()='Your account has been created!']") 
	WebElement msgConfirmation;
	
	//Action
	
	public void setName(String name) {
		firstName.sendKeys(name);
		
	}
	
	public void setLastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	
	public void setEmail(String email) {
		eMail.sendKeys(email);
	}
	
	public void setPhone(String phone) {
		telephone.sendKeys(phone);
	}
	
	public void setPswd(String pswd) {
		password.sendKeys(pswd);
	}
	
	public void setpassword(String password) {
		confirm.sendKeys(password);
	}
	
	public void setAgreeTerm() {
		agreePolicy.click();
	}
	
	
	public void submitButton() {
		btn.click();
	}
	
	public String getregisterMessage() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
		
	}
		
	
	
	

	
}