package com.pageObjectModel.uiObjects;

public class reverseNumber {
	
	public static void main(String[] args) {
		
	int number=123,reminder,reverse=0;
	int neww=number;
	while(number>0) {
		reminder=number%10;
		number=number/10;
		reverse=reverse*10+reminder;
		}
	System.out.println(reverse);
	if(neww==reverse) {
		System.out.println("palindrome");
	}else {
		System.out.println("not a palindrome");
	}
	}
}
