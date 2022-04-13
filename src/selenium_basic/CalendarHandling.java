package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {
	//Program for frame and calendar Handling
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Opening URL
		driver.get("https://jqueryui.com/datepicker/");
		
		/*int no=driver.findElements(By.tagName("iframe")).size();
		System.out.println(no);
		*/
		//Switching to frame
		WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		while(true) {
		String month=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		System.out.println(month);
		
		if(!month.equalsIgnoreCase("May 1997"))
		{
		driver.findElement(By.xpath("//*[@title='Prev']")).click();
		}
		else
		{
			break;
		}
		
		}
		//Handling the date
		int date=5;
		driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='"+date+"']")).click();
	}
}

