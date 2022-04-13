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

public class excel {
		//notepad code
	public static String readData(int r, int c) throws IOException {
		String path=System.getProperty("user.dir")+"\\data.xlsx";
		
		File file =new File(path);
		
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		String value=sheet.getRow(r).getCell(c).getStringCellValue();
		
		wb.close();
		return value;
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Rajendra Barad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//Step-1
		WebDriver driver =new ChromeDriver();
		
		//step-2
		driver.manage().window().maximize();
		
		//step-3
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		
		//step-4
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys(readData(0,0));
		Thread.sleep(2000);
		

		//step-5
		WebElement pass=driver.findElement(By.id("txtPassword"));
		pass.sendKeys(readData(0,1));
		Thread.sleep(2000);
		
		//step-6
		WebElement button=driver.findElement(By.id("btnLogin"));
		button.click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a[text()='Logout']")).click();

		
		Thread.sleep(8000);
		driver.close();
	}

	}


