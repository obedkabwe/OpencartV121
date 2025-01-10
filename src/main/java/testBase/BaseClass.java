package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	
	public WebDriver driver;
	public Logger logger;
	
		@BeforeClass
	public void setup() {
				//logger= LogManager.getLogger(BaseClass.class.getName());
			logger=LogManager.getLogger(this.getClass());

		driver = new ChromeDriver();
		
		//logger
	//static	logger= LogManager.getLogger(BaseClass.class);
		//logger.info("Test setup started.");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		driver.manage().deleteAllCookies();
		driver.get("http://localhost/openshare/");
		driver.manage().window().maximize();
		
	}
	
		@AfterClass
		public void tearDown() {
			//logger.info("Test teardown completed .");
			
			driver.quit();
		}
	
	
	public String randomString() {
		String generateString = RandomStringUtils.randomAlphabetic(6);
		return generateString;
	}
	
	public String randomNumber() {
		String generateNumber = RandomStringUtils.randomNumeric(6);
		return generateNumber;
	}
	
	public String randomAlfNum() {
		String generateAlfnum = RandomStringUtils.randomAlphanumeric(8);
		return generateAlfnum;
	}
	
	
	
	
	
	
	
	
}
