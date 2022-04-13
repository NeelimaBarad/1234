package selenium_basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTabHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//Scroll
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		
		Thread.sleep(5000);
		
		String parentTab=driver.getWindowHandle();
		
		
		//ButtonClick
		WebElement button=driver.findElement(By.xpath("//*[@id='opentab']"));
		button.click();
		
		Thread.sleep(5000);
		
		Set<String> allTab=driver.getWindowHandles();
		for(String ns:allTab) {
			
			System.out.println(ns);
			
			if(!ns.equals(parentTab)) {
				
				driver.switchTo().window(ns);
				System.out.println(driver.getTitle());
			}
		}
		
		Thread.sleep(5000);
		
		driver.switchTo().window(parentTab);
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
