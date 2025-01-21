package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

	
	public WebDriver driver;
	public Logger logger;
	public Properties p;
	
		@BeforeClass
		@Parameters({"os", "browser"})
	public void setup(@Optional String os, @Optional String br) throws IOException {
				//logger= LogManager.getLogger(BaseClass.class.getName());
			logger=LogManager.getLogger(this.getClass());

	//	driver = new ChromeDriver();
		
//		switch(br.toLowerCase()){
//		case "chrome" : driver = new ChromeDriver(); break;
//		case "firefox" : driver = new FirefoxDriver(); break;
//		default : System.out.println("Invalid browser name"); return;
//
//
//		}
			p= new Properties();
			 FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config.properties");
	            p.load(file);
	            file.close();
		
		 if (os.equalsIgnoreCase("Mac")) {
	            if (br.equalsIgnoreCase("chrome")) {
	              	                driver = new ChromeDriver();
	            } else if (br.equalsIgnoreCase("firefox")) {
	               	                driver = new FirefoxDriver();
	           
	            } else {
	                throw new IllegalArgumentException("Unsupported browser: " + br);
	            }
		
		
		//logger
	//static	logger= LogManager.getLogger(BaseClass.class);
		//logger.info("Test setup started.");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50));
		driver.manage().deleteAllCookies();
		
		
		
		//driver.get("http://localhost/openshare/");
		driver.get(p.getProperty("url"));
		
		driver.manage().window().maximize();
		 }
		
		
		}
	
		@AfterClass
		public void tearDown() {
			//logger.info("Test teardown completed .");
			
			//driver.quit();
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
