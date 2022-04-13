  package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testngdp {
	
	WebDriver driver;
	@BeforeClass
	public void init() {
		
				System.setProperty("webdriver.chrome.driver", 
				"D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				
				driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/login/");
	}
	
	@Test(dataProvider="testData")
	public void login(String u,String p) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(u);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(p);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		Thread.sleep(8000);
		
		
	}
	
	@DataProvider(name="testData")
	public String[][] getData(){
		String[][] data= {{"abc@gmail.com","abc123"},{"def@gmail.com","def123"},
				{"xyz@gmail.com","xyz123"}};
		
		return data;
	}
	
	
	
	
	
	
	
	
  
}
