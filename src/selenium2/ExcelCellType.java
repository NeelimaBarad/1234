package selenium2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelCellType {
	public static  String value;
	public static XSSFSheet sheet;
	public static String convert;
	
	public static String readData(int r, int c) throws IOException  {
		String path=System.getProperty("user.dir")+"\\data.xlsx";
		
		File file =new File(path);
		
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		sheet=wb.getSheetAt(0);
		
		XSSFRow row=sheet.getRow(r);
		
		XSSFCell cell=row.getCell(c);
	
		System.out.println(cell.getCellType());
		
		
		switch (cell.getCellType()) {
		
		case STRING:System.out.println(cell.getStringCellValue());
		break;
		case NUMERIC: System.out.println(cell.getNumericCellValue());
		convert=String.valueOf(cell);
		break;
		
		}
		wb.close();
		
		return value;
	}

	public static void main(String[] args) throws  InterruptedException, IOException {
		
		
		System.out.println(readData(2,0));
		
		  System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Admin\\Desktop\\Slenium Jar\\Chrome_98\\chromedriver.exe");
		  
		  //Step-1 
		  WebDriver driver =new ChromeDriver();
		  
		  //step-2 
		  driver.manage().window().maximize();
		  
		 // step-3 
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  Thread.sleep(2000);
		 
		 //step-4 
		  WebElement username=driver.findElement(By.id("txtUsername"));
		  readData(1,0);
		  username.sendKeys(convert); 
		  Thread.sleep(2000);
		  
		 
		  //step-5 
		  WebElement pass=driver.findElement(By.id("txtPassword"));
		 
		 pass.sendKeys(readData(0,1)); Thread.sleep(2000);
		 
		 //step-6
		 WebElement button=driver.findElement(By.id("btnLogin"));
		 button.click(); Thread.sleep(3000);
		  
		 driver.findElement(By.xpath("//*[@id='welcome']")).click();
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a[text()='Logout']")).click();
		
		 
		  Thread.sleep(8000);
		  driver.close();
		 	}


}
