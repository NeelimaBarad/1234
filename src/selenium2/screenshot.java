package selenium2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class screenshot {
	
	
	public void CaptureScreenShot(WebDriver driver,String name) throws IOException {
		 
		TakesScreenshot tss=(TakesScreenshot)driver;
		
		File source=tss.getScreenshotAs(OutputType.FILE);
		
		File destination=new File(System.getProperty("C:\\Users\\Rajendra Barad\\Desktop")+"\\Screenshots\\"+name+".png");
		
		FileHandler.copy(source, destination);
		
		System.out.println("Screenshot Captured");
		
	}
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		//Step-1
		WebDriver driver =new ChromeDriver();
		
		//step-2
		driver.manage().window().maximize();
		
		//step-3
		driver.get("https://www.facebook.com/login/");
		
		//step-4 capture screenshot
		
		@SuppressWarnings("unused")
		screenshot sc=new screenshot();
		
		
		
	}

}
