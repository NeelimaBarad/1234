package selenium_basic;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
				//Step-1
				WebDriver driver =new ChromeDriver();
				
				//step-2
				driver.manage().window().maximize();
				
				//step-3
				driver.get("https://www.facebook.com/login/");
				
				//step-4 capture screenshot
				TakesScreenshot tss=(TakesScreenshot)driver;
				
				File source=tss.getScreenshotAs(OutputType.FILE);
				
				File destination=new File(System.getProperty("user.dir")+"\\Screenshots\\screen3.png");
				
			}
		
	File destination=new File("D:\\Users\\Rajendra Barad\\eclipse-workspace\\Selenium\\Screenshots\\screen1.png");

		
	}


