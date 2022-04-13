package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

				public class HomePageTest {
	
				WebDriver driver;
				LoginPages lp;
				HomePage hp;
	
				@BeforeClass
				public void init() {
		
				System.setProperty("webdriver.chrome.driver", 
				"D:\\Web Drivers\\chromedriver.exe");
							
				driver=new ChromeDriver();
							
				driver.manage().window().maximize();
							
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				lp=new LoginPages(driver);
				hp=new HomePage(driver);
				
				}
				
				@Test
				public void login() {
					
				lp.getUsernameTab().sendKeys("Admin");
				lp.getPasswordTab().sendKeys("admin123");
				lp.getButton().click();
				}
	
				@Test 
				public void logoff() throws InterruptedException {
					
				hp.WelcomeTab().click();
				hp.LogoutTab().click();
				Thread.sleep(2000);
				}
				
				@AfterClass
				public void teardown() {
					
					driver.close();
				}
}
