package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyaccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{

	HomePage homePage;
	LoginPage loginPage;
	MyaccountPage myaccountPage;

	
@Test	
public void verify_Login() {
		try {
		logger.info("Starting login test.");

		homePage= new HomePage(driver);
		loginPage = new LoginPage(driver);
		myaccountPage = new MyaccountPage(driver);
		
		
		homePage.clickMyAccount();
		homePage.clickLogin();
		loginPage.setenterEmail(p.getProperty("Email"));
		loginPage.setPasscod(p.getProperty("Password"));
		loginPage.LoginButton();
		
		
		Boolean target = myaccountPage.isMyAccountPageExists();

        Assert.assertTrue(target);

		
	} catch (Exception e) {
		// TODO: handle exception
		Assert.fail();

	}
	
	
	
	
}
	
}
