package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngClass7 {
	WebDriver driver;
	 @BeforeClass
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				
				driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://opensource-demo.orangehrmlive.com/");
	 }
		
	 @Test
	 public void afterpage() {
		 
		 System.out.println(driver.getTitle());
	 }
	 
	}

