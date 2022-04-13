package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
	
		//Declarations
	
		@FindBy(id="txtUsername")
		private WebElement username;
		
		@FindBy(xpath="//*[@id='txtPassword']")
		private WebElement password;
		
		@FindBy(xpath="//*[@id='btnLogin']")
		private WebElement button;
		
		//initialization ----constructor
		  
		LoginPages(WebDriver driver){
			
		PageFactory.initElements(driver, this);
		}
		
		public  WebElement getUsernameTab() {
			
			return username;
		}
		
		public  WebElement getPasswordTab() {
			
			return password;
		}
		
		public  WebElement getButton() {
			
			return button;
		}
}
