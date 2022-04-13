package selenium_basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotHandling {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		TakesScreenshot cool=(TakesScreenshot)driver;
		
		File source=cool.getScreenshotAs(OutputType.FILE);
		
		File destination=new File(System.getProperty("D:\\Users\\Rajendra Barad\\eclipse-workspace\\Selenium\\Screenshots\\cool.png"));
		
		FileHandler.copy(source, destination);
		
		System.out.println("Screenshot Taken");
	}

}
