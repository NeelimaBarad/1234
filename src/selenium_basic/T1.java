package selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
			WebDriver driver=new  ChromeDriver();
			
			driver.get("https://www.myntra.com/");
			
	
	}

}
