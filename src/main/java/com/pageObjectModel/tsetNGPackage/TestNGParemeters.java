package com.pageObjectModel.tsetNGPackage;

import org.testng.annotations.Test;

public class TestNGParemeters {
	
	@Test(enabled=false)
	public void test1() {
		System.out.println("test 1");
	}

	@Test(priority=1,dependsOnMethods= {"test6"})
	public void test2() {
		System.out.println("test 2, priority 1");
	}

	@Test(dependsOnMethods= {"test2"})
	public void test3() {
		System.out.println("test 3");
	}

	@Test(priority=2,dependsOnMethods= {"test3"})
	public void test4() {
		System.out.println("test 4 priority 2");
	}

	@Test(priority=3)
	public void test5() {
		System.out.println("test 5 priority 3");
	}

	@Test
	public void test6() {
		System.out.println("test 6");
	}


}
