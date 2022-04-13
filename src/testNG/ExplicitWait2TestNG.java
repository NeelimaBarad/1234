package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExplicitWait2TestNG {
	
	WebDriver driver;
	@BeforeClass
	public void init(){

	System.setProperty("webdriver.chrome.driver", 
	"D:\\Web Drivers\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
	}
	@Test
	public void testCase1() {
	
	driver.findElement(By.id("populate-text")).click();
		
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(11));
	
	WebElement text=driver.findElement(By.xpath("//*[@id='h2']"));
	
	wait.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver"));
	
	if(text.getText().contains("Selenium Webdriver")) {
		
		
		System.out.println("test case PASS");
	}
	
	}
	
}
