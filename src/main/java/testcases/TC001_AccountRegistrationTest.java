package testcases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{

	HomePage homePage;
	AccountRegistrationPage rg;
	

	
	
	
	
	
	
	@Test
	public void verify_account_regis() {
		
		logger.info("Starting account registration test.");

		try {
			logger.info("Starting account registration test.");

		HomePage homePage = new HomePage(driver);
		rg=new AccountRegistrationPage(driver);
		
		homePage.clickMyAccount();
		homePage.clickRegister();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	    rg.setName(randomString());
		rg.setLastName(randomString());
		rg.setEmail(randomString() + "@gmail.com");
		rg.setPhone(randomNumber());
		String alfnum=randomAlfNum();
		rg.setPswd(alfnum);
		rg.setpassword(alfnum);
		
		rg.setAgreeTerm();
		rg.submitButton();
	}catch (Exception e) {
		logger.error("Account registration test failed.",e);
		Assert.fail("Test failed due to exception:"+ e.getMessage());
		
	}
		logger.info("**************Finished TC001 Register");
		
			}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
