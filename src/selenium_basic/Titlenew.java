package selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlenew {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver Shrau=new ChromeDriver();
		
		Shrau.get("https://www.facebook.com/");
		Shrau.manage().window().maximize();
		String smart=Shrau.getTitle();
		String silly=new String("Facebook – log in or sign up");
		
		System.out.println(smart);
		
		if(smart.equals(silly)) {
			
			System.out.println("Properly Working"+  smart);
		}
		else {
			
			System.out.println("Not Working Properly"+smart+silly);
		}
		Shrau.close();
	}

}
