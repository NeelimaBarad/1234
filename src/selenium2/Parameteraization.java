package selenium2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameteraization {
	private static String readData1(int r, int c) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("D:\\Users\\Rajendra Barad\\eclipse-workspace\\Selenium\\New Microsoft Excel Worksheet.xlsx");
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
	String username=sh.getRow(r).getCell(c).getStringCellValue();
	//System.out.println(username);
	return username;
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
			//Step-1
			System.setProperty("webdriver.chrome.driver", "D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(2000);
			
			//Step-2
			WebElement user=driver.findElement(By.id("txtUsername"));
			user.sendKeys(readData1(0,0));
			Thread.sleep(2000);
			
			//Step-3
			WebElement password=driver.findElement(By.id("txtPassword"));
			password.sendKeys(readData1(0,1));
			Thread.sleep(2000);
			
			//Step-4
			WebElement button=driver.findElement(By.id("btnLogin"));
			button.click();
			Thread.sleep(2000);
			
			//step-5 click on icon
			driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a[text()='Logout']")).click();
			
			Thread.sleep(8000);
			
			driver.close();
	}

	
}
