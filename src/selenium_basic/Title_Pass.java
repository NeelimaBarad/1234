package selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Pass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		
		WebDriver cute=new ChromeDriver();
		
		cute.get("https://www.google.com/");
		
		String J=cute.getTitle();
		String k=new String("Google");
		
		if(k.equals(J)) {
			
			System.out.println("test case pass");
		}
		else {
			
			System.out.println("test case fail");
		}
	}

}
