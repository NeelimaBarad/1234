package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExplicitWaitTestNG {
  
	WebDriver driver;
	@BeforeClass
	public void init(){

	System.setProperty("webdriver.chrome.driver", 
	"D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
	}
	
	@Test
	public void testCase1() {
		
	driver.findElement(By.id("alert")).click();
	
	WebDriverWait wait=new WebDriverWait(driver,20);
	
	wait.until(ExpectedConditions.alertIsPresent());
		
	driver.switchTo().alert().accept();
	
	driver.findElement(By.id("display-other-button")).click();
	
	WebElement hidden=driver.findElement(By.id("hidden"));
	
	wait.until(ExpectedConditions.visibilityOf(hidden));
	
	hidden.click();
	
	driver.findElement(By.id("checkbox")).click();
	
	driver.findElement(By.id("enable-button")).click();
	
	WebElement button=driver.findElement(By.id("disable"));
	
	wait.until(ExpectedConditions.visibilityOf(button));
	
  	} 

	}
