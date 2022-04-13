package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

			// program for frame and calander handling
			public static void main(String[] args) {
				
				// step 1 
				System.setProperty("webdriver.chrome.driver", "\"D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\"");
				
				// step 2 
				WebDriver driver = new ChromeDriver();
				
				// step 3  opening url
				driver.get("https://jqueryui.com/datepicker/");
				
				// step 4
				driver.manage().window().maximize();
				
				// step 5 finding the iframe
				
				int no=	 driver.findElements(By.tagName("iframe")).size();
				System.out.println(no);
				
				// step 6
				WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
			
				//step 7 switching to frame
			
				driver.switchTo().frame(frame);
			
				// step 8
				 driver.findElement(By.xpath("//*[@id='datepicker']")).click();
			
				 // step 9 handling month and year
				 while(true) {
					
				
					String month=  driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
					System.out.println(month);
					
					if(!month.equalsIgnoreCase("May 2021"))
					{
						driver.findElement(By.xpath("//*[@title='Prev']")).click();
					}
					else
					{
						break;

					}	
		}
				 // step 10 handling the date
				 int date = 20;
				
				 driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()= '"+date+"' ]")).click();
				
			}
			
	}


