package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngClass {
	WebDriver driver;
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", 
		"D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
		
		driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	  @Test
	  public void login() throws InterruptedException {
		  	WebElement username=driver.findElement(By.id("txtUsername"));
			username.sendKeys("Admin");
			Thread.sleep(2000);
			
			WebElement pass=driver.findElement(By.id("txtPassword"));
			pass.sendKeys("admin123");
			Thread.sleep(2000);
			

			WebElement button=driver.findElement(By.id("btnLogin"));
			button.click();
			
		  } 
	  
	  @Test (dependsOnMethods="login")
	  public void logout() throws InterruptedException {
		  	WebElement menu=driver.findElement(By.xpath("//*[@id='branding']//a[@id='welcome']"));
			menu.click();
			Thread.sleep(2000);
			
			WebElement logout=driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]//a[text()='Logout']"));
			logout.click();
			Thread.sleep(2000);
			
		  }
	  
	  @Test(dependsOnMethods="logout")
	  public void teardown(){
		 driver.close();
	  }
}
