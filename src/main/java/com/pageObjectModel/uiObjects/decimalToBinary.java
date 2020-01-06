package com.pageObjectModel.uiObjects;

public class decimalToBinary {
	
	public static void main(String[] args) {
		int number=6,binary=0,actual,remainder,i=1;
		actual=number;
		while(number!=0)
		{
			remainder=number%2;
			number=number/2;
			binary=binary+(remainder*i);
			i=i*10;
		}
		System.out.println(actual+"binary value is"+binary);
	}

}
