package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngClass5 {
	
	WebDriver driver;
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", 
		"D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
  @Test(groups="RegressionTesting")
  public void LogIn() {
	  
	  System.out.println("LogIn Button-TestngClass5");
	  
  }
  
  @Test(groups="sanityTesting")
  public void HomePage() {
	  
	  System.out.println("HomePage-TestngClass5");
	  
  }
  
  @Test(groups="RegressionTesting")
  public void SearchIcon() {
	  
	  System.out.println("SearchIcon-TestngClass5");
	  
  }
  
  @Test(groups="sanityTesting")
  public void Profile() {
	 
	  System.out.println("Profile-TestngClass5");
	  
  }
  
  @Test(groups="sanityTesting")
  public void AfterScroll() {
	  
	  System.out.println("AfterScroll-TestngClass5");
	  
  }
}
