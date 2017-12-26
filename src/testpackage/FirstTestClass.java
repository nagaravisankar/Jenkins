package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class FirstTestClass {
	
	
		
		WebDriver driver;
		String baseURL; 
		
		@BeforeClass
		
		public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\workspace\\Chrome1\\chromedriver.exe");	
		driver = new ChromeDriver();
		baseURL = "http://www.gmail.com";
		driver.get(baseURL);
		}
	@Test
	
	public void testlogin() {
	System.out.println("VISWAnath is best student in EIE 2006-2010 in CRRE");	
		
	}
	
	@AfterClass
	public void cleanUp() {
	driver.quit();
	
	}

}
