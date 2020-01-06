package com.pageObjectModel.tsetNGPackage;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample {

	/*@BeforeSuite
	public void BeforeSuite1() {
		System.out.println("before suite");
	}

	@BeforeTest
	public void BeforeTest1() {
		System.out.println("beforeTest");
	}

	@BeforeClass
	public void BeforeClass1() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before method");
	}*/

	@Test(dependsOnMethods= {"Test5","Test6"})
	public void Test1() {
		System.out.println("test1");
	}

	@Test(groups= {"sanity","smoke"})
	public void Test2() {
		System.out.println("test2");
	}

	@Test(groups="sanity")
	public void Test3() {
		System.out.println("test3");
	}

	@Test(priority=1)
	public void Test4() {
		System.out.println("test4");
		
	}

	@Test(groups="smoke")
	public void Test5() {
		System.out.println("test5");
	}

	@Test(groups= {"regression","smoke"})
	public void Test6() {
		System.out.println("test6");
	}

	/*@AfterMethod
	public void AfterMethod() {
		System.out.println("After method");
	}

	@AfterClass
	public void AfterClass1() {
		System.out.println("After class");
	}

	@AfterTest
	public void AfterTest1() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void AfterSuite1() {
		System.out.println("after suite");*/
	
}
