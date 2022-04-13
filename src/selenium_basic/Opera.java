package selenium_basic;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.opera.OperaDriver;

public class Opera {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.opera.driver","D:\\Users\\Rajendra Barad\\Downloads\\operadriver_win32 (2)\\operadriver_win32");
		
		WebDriver driver=new OperaDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
		driver.get("https://www.amazon.in/amazonprime/");
		
		driver.close();

	}

}
