package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class NewTestparameter {
 
	
			WebDriver driver;
			@Parameters("browser")
			@BeforeClass
			public void init(String arg) {
			
			if(arg.equals("chrome")){
	
			System.setProperty("webdriver.chrome.driver", 
			"D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			}
			else if(arg.equals("firefox")) {
				
				System.setProperty("webdriver.gecko.driver", 
						"D:\\Users\\Rajendra Barad\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
						
						driver=new FirefoxDriver();
						
						driver.manage().window().maximize();
						
						driver.get("https://opensource-demo.orangehrmlive.com/");
						
						}
			}
			
	}
