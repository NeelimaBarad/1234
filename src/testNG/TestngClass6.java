package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngClass6 {
	
	WebDriver driver;
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", 
		"D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
  @Test(groups="sanityTesting")
  public void SignUp() {
	  
	  System.out.println("SignUp-TestngClass6");
  }
  
  @Test(groups="RegressionTesting")
  public void AddToCart() {
	  
	  System.out.println("AddToCart-TestngClass6");

  }
  
  @Test(groups="sanityTesting")
  public void Wishlist() {
	  
	  System.out.println("Wishlist-TestngClass6");

  }
  
  @Test(groups="RegressionTesting")
  public void CheckOut() {
	  
	  System.out.println("CheckOut-TestngClass6");

  }
  
  @Test(groups="RegressionTesting")
  public void Payment() {
	  
	  System.out.println("Payment-TestngClass6");

  }
}
