package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YouTube {
	
	
	WebDriver driver;
	@BeforeClass
	public void init() {
		
	System.setProperty("webdriver.chrome.driver", 
	"D:\\Web Drivers\\chromedriver.exe");
				
	driver=new ChromeDriver();
				
	driver.manage().window().maximize();
				
	driver.get("https://www.youtube.com/");
	
	} 
	
	@Test
	public void credentials() {
		
		WebElement tab=driver.findElement(By.xpath("//*[@id=\"search\"]"));
		tab.click();
		tab.sendKeys("search second most trending video");
		
		WebElement searchicon=driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon"));
		searchicon.click();
		
	}
	

}
