package selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class currentpageurl {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Users\\\\Rajendra Barad\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver cupaurl=new ChromeDriver();
		
		cupaurl.get("https://www.facebook.com/");
		
		String current=cupaurl.getCurrentUrl();
		
		String expected="https://www.facebook.com/";
		
		if(current.equalsIgnoreCase(expected)) {
			
			System.out.println("Current Url is same");
		}
		else {
			System.out.println("Current url is Different");
		}
		
	}

}
