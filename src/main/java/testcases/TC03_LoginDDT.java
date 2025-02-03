package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyaccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC03_LoginDDT extends BaseClass {

	
//	LoginPage loginPage;
//	MyaccountPage myaccountPage;
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void verify_LoginData(String email, String password, String exp) {
		
		try {
			logger.info("");
			
			HomePage homePage = new HomePage(driver);
			homePage.clickMyAccount();
			homePage.clickLogin();
			
		    LoginPage loginPage = new LoginPage(driver);
			loginPage.setenterEmail(email);
			loginPage.setPasscod(password);
			loginPage.LoginButton();
			
		MyaccountPage	myaccountPage = new MyaccountPage(driver);
			
			
			
boolean targetPage=myaccountPage.isMyAccountPageExists();
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					myaccountPage.clickLogout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
					myaccountPage.clickLogout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}
			
		logger.info("**** Finished TC_003_LoginDDT *****");
	}
			
			
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
