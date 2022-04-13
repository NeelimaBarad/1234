package selenium2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {

	public static String readData(int r,int c) throws IOException {
		
		//path of excel sheet
		String path="D:\\Users\\Rajendra Barad\\eclipse-workspace\\Selenium\\New Microsoft Excel Worksheet.xlsx"; 
		
		//To handle file
		File file =new File(path);
		
		//To read/manipulate file-its read binary raw data
		FileInputStream fis=new FileInputStream(file);
		
		//To locate excel 
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//To locate excel sheet
		XSSFSheet sheet=wb.getSheetAt(0);
		
		//To locate Rows and coloumns
		String value=sheet.getRow(r).getCell(c).getStringCellValue();
		
		//closing workbbok
		wb.close();
		return value;
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		//Step-1
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		//Step-2
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys(readData(0,0));
		Thread.sleep(2000);
		
		//Step-3
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(readData(0,1));
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
