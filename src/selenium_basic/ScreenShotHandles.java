package selenium_basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotHandles {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//capture screenshot
		TakesScreenshot tss=(TakesScreenshot)driver;
		//store in variable
		File source=tss.getScreenshotAs(OutputType.FILE );
		//location or path
		File destination=new File("D:\\Users\\Rajendra Barad\\eclipse-workspace\\Selenium\\Screenshots\\screen565.png");
		//File handler class
		FileHandler.copy(source, destination);
		
		System.out.println("Screenshot Captured");
		
		driver.close();
	}

}
