package com.pageObjectModel.tsetNGPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListnerDemo implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("All test finshed");
		Reporter.log("All test finished");
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("All Test Starrted");
		Reporter.log("All test Started");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("on test failed with sucees percentage"+getMethodName(arg0));
		Reporter.log("on test failed with sucess percentage"+getMethodName(arg0));
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("test failed"+getMethodName(arg0));
		Reporter.log("Test Failed"+getMethodName(arg0));
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("test skipped"+getMethodName(arg0));
		Reporter.log("test skipped"+getMethodName(arg0));
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
	System.out.println("test started"+getMethodName(arg0));
	Reporter.log("test Started"+getMethodName(arg0));
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("test Success"+getMethodName(arg0));
		Reporter.log("test Success"+getMethodName(arg0));
	}
	
	private static String getMethodName(ITestResult result) {
	 return result.getMethod().getConstructorOrMethod().getName();		
	}

}
