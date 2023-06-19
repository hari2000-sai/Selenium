package com.hari.TestNgAsserts;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class ITestListiner implements ITestListener {
	
	  public  void onTestFailure(ITestResult result) {
		  
		  System.out.println("This method is failed message from itestlistener");
		     
		  }
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("This method is success message from itestlistener");

		  }

}
