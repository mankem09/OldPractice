package com.pageObjectModel.uiObjects;

public class toPrintPrimeNumbers {

	public void printPrimeNumber() {
		int count, n = 100;
		System.out.println("hi");

		for (int i = 1; i < n; i++) {
			count=0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(i + ",");
			}
		}

	}

	public void givenValuePrimeorNot() {

		int n = 3;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("is prime");
		} else {
			System.out.println("not prime");
		}
		

	}

	public static void main(String[] args) {
		toPrintPrimeNumbers tpp = new toPrintPrimeNumbers();
		tpp.givenValuePrimeorNot();
		tpp.printPrimeNumber();

	}

}
