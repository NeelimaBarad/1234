package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngClass8 {
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
  public void getTitle() {
	  
	  
	 String actitle= driver.getTitle();
	 String exTitle= "OrangeHRM";
	 System.out.println(actitle);
	 Assert.assertEquals(actitle, exTitle);
	  
	  
  }
}
