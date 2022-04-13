package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NEWParameter {
	      // cross browser testing

					WebDriver driver;
					@Parameters("browser")
					@BeforeClass
					public void init(String arg){
						
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
					@Parameters("param")
					@Test
					public void login(String s ) throws InterruptedException {
				  	WebElement username=driver.findElement(By.id("txtUsername"));
					username.sendKeys(s);
					Thread.sleep(2000);
					
					WebElement pass=driver.findElement(By.id("txtPassword"));
					pass.sendKeys("admin123");
					Thread.sleep(2000);
					
					WebElement button=driver.findElement(By.id("btnLogin"));
					button.click();
					} 
 
					

					@Test (dependsOnMethods="login")
					 public void logout() throws InterruptedException {
					WebElement menu=driver.findElement(By.xpath("//*[@id='branding']//a[@id='welcome']"));
					menu.click();
					Thread.sleep(2000);
							
					WebElement logout=driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]//a[text()='Logout']"));
					logout.click();
					Thread.sleep(2000);
							
						  }
					 
					@Test(dependsOnMethods="logout")
					 public void teardown(){
						 driver.close();
					}
					
					}
