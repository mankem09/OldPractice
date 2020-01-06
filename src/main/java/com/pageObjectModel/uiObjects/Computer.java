package com.pageObjectModel.uiObjects;

import org.openqa.selenium.WebDriver;

public class Computer {

	WebDriver driver;

public static void main(String[] args) {
	
	String s = "aabbccssddbbcca";
	int size = s.length();
	for(int i = size - 1;i==0;i--)
	{
		System.out.println(s.charAt(i));

	}
}

}
