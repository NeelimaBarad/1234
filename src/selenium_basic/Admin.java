package selenium_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		/*WebElement username=driver.findElement(By.id("txtUsername"));
		
		WebElement link2=driver.findElement(By.partialLinkText("Forgot your"));
		link2.click();
		*/
		
		List<WebElement> ele=driver.findElements(By.xpath("//*[@class='textInputContainer']//input"));
		
		for(WebElement el1:ele) {
			
			String s=el1.getAttribute("name");
			System.out.println(s);
			
			if(s.contains("Username")) {
				
				el1.sendKeys("Admin");
			}
			else if(s.contains("Password")) {
				
				el1.sendKeys("admin123");
			}
			Thread.sleep(2000);
		}
	}

}
