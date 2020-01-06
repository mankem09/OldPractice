package com.pageObjectModel.customlistners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.pageObjectModel.testbase.TestBase;

public class customListners extends TestBase implements ITestListener {

	public void onFinish(ITestContext arg0) {
		

	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println(getMethodName(arg0));
	}

	private static String getMethodName(ITestResult result) {

		return result.getMethod().getConstructorOrMethod().getName();
	}
}
