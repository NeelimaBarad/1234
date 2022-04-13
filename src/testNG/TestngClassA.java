package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestngClassA {
 
	
	WebDriver driver;
	 @BeforeClass
	public void init() {
		
		 		System.setProperty("webdriver.gecko.driver", "D:\\Users\\Rajendra Barad\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
				
		 		 driver=new FirefoxDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://opensource-demo.orangehrmlive.com/");
	 }
	 @Test
	 public void afterpage() {
		 
		 System.out.println(driver.getTitle());
	 }
}