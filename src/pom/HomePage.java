package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//*[@id='welcome']")
	private WebElement welcome;
	
	@FindBy(xpath="//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	private WebElement logout;
	
	HomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement WelcomeTab() {
		
		return welcome;
	}
		
	public WebElement LogoutTab() {
		
		return logout;
	}
		
	

}
