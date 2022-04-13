package selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitlePass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		String actual=driver.getTitle();
		String expected="myntra";
		
		if(actual.equals(expected)) {
			
			System.out.println("Test Case Pass");
		}
		else {
			
			System.out.println("Test Case Fail");
		}
}
	}

