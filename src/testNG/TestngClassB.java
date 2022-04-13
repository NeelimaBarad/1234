package testNG;

import org.testng.annotations.Test;

public class TestngClassB {
 
	  @Test(groups="Sanity")
	  public void generaltab() {
		  System.out.println("generaltab");
	  }
	  
	  @Test(groups="Integration")
	  public void HomePage() {
		  
		  System.out.println("HomePage");
		  
	  }
	  @Test(groups="Integration")
	  public void Sidebar() {
		
		  System.out.println("Sidebar");
		
	  }
	  
	  @Test(groups="Sanity")
	  public void testCase1() {
		  System.out.println("First Test Case");
	  }
}