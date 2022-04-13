package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngClass4 {
	@Test
  public void Page1() {
	  
	  System.out.println("Page1");
  }
  
  @Test
  public void HomePage() {
	  
	  System.out.println("HomePage");
	  
  }
  @Test
  public void Sidebar() {
	
	  System.out.println("Sidebar");
	Assert.assertTrue(false);
  }
  @Test
  public void GeneralTab() {
	  
	  System.out.println("GeneralTab");
  }
}
