package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ImplicitWaitTestNG {
  
	WebDriver driver;
	@BeforeClass
	public void init(){

	System.setProperty("webdriver.chrome.driver", 
	"D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	@Test
	public void login() {
  	WebElement username=driver.findElement(By.id("txtUsername"));
	username.sendKeys("Admin");
	
	WebElement pass=driver.findElement(By.id("txtPassword"));
	pass.sendKeys("admin123");
	
	WebElement button=driver.findElement(By.id("btnLogin"));
	button.click();
	} 

	@Test (dependsOnMethods="login")
	 public void logout()  {
	WebElement menu=driver.findElement(By.xpath("//*[@id='branding']//a[@id='welcome']"));
	menu.click();
	
	WebElement logout=driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]//a[text()='Logout']"));
	logout.click();
			
	}
	 
	@Test(dependsOnMethods="logout")
	 public void teardown(){
		 driver.close();
	}
	
	}


