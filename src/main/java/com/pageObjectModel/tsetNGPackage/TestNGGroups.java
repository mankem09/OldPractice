package com.pageObjectModel.tsetNGPackage;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGGroups {

	@Test(groups = { "Smoke" })
	public void test1() {
		System.out.println("test class test1 ");
		Assert.assertEquals(1,11);
	}
/**
 * 
 */
	@Test(dependsOnGroups = {"Smoke"})
	public void test2() {
		System.out.println("test class test2 ");
		
	}

	@Test(groups= {"sanity"})
	public void test3() {
		System.out.println("test class test 3");
	}

	@Test(groups= {"regrssion"})
	public void test4() {
		System.out.println("test class test 4");
	}

	@Test(groups= {"Smoke","sanity"})
	public void test5() {
		System.out.println("test class test 5");
	}

	@Test
	public void test7() {
		System.out.println("test class test 7");
	}

}
