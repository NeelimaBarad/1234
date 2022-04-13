package testNG;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import selenium2.screenshot;

public class TestNGListenersClass extends TestNGListeners implements ITestListener{
	
	screenshot sc;


	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("On test failure");
		   
		
		sc=new screenshot();
		String name=result.getName();
		
		try {
			sc.CaptureScreenShot(driver,name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
		
		
		
		
		
	