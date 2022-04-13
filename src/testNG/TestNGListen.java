package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testNG.implementationclass.class)
public class TestNGListen {
	
	WebDriver driver;
	@BeforeClass
  public void init() {
		
		System.setProperty("webdriver.chrome.driver",
		"D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
  }
	
	@Test
	public void getTitle() {
		  
		
		String acutalTitle=driver.getTitle();
		String expectedTitle="Facebook – log in or sign up";
		System.out.println(acutalTitle);
		Assert.assertNotEquals(acutalTitle, expectedTitle);
		
	}
	
	@Test(dependsOnMethods="getTitle")
	public void getindex() {
		
		System.out.println("getindex");
		
	}
	
	@Test
	public void login() {
		
		System.out.println("login");
	}
	
	
}


