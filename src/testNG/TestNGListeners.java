package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNGListeners {
 
	 public static WebDriver driver;
	@BeforeClass
  public void init() {
		
		System.setProperty("webdriver.chrome.driver",
		"D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
  }  
	
	@Test
	public void getTitle() {
		
		String aTitle=driver.getTitle();
		String exTitle="Jnfjehdnckm";
		System.out.println(aTitle);
		Assert.assertEquals(aTitle, exTitle);
	}
	
	@Test(dependsOnMethods="getTitle")
	public void geturl() {
		
		System.out.println("geturl");
		
		
	}
	
	@Test
	public void getHomepage() {
		
		System.out.println("getHomepage");
	}
		
}
