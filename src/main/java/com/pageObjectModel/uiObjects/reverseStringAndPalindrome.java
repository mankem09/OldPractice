package com.pageObjectModel.uiObjects;

public class reverseStringAndPalindrome {

	public void reversAndpalindrome() {

		String s = "boob", reverse = "";
		int len = s.length();
		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
		if(s.compareToIgnoreCase(reverse)==0) {
			System.out.println(s+"it iis a palindrome"+reverse);
		}else {
			System.out.println("not a palindrome");
		}
	}

	public static void main(String[] args) {
		reverseStringAndPalindrome rsap= new reverseStringAndPalindrome();
		rsap.reversAndpalindrome();
	}
}
