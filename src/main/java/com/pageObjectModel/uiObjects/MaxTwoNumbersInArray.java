package com.pageObjectModel.uiObjects;

public class MaxTwoNumbersInArray {
		
		public void twoMaxNumbersInArray(int[]a){
			int firstBigNumber = 0;
			int secondBigNumber = 0;
			for(int num:a){
				if(firstBigNumber<num){
					secondBigNumber = firstBigNumber;
					firstBigNumber = num;
				}
				else if(secondBigNumber<num){
					secondBigNumber = num;
				}
			}
			System.out.println("firstBigNumber is "+firstBigNumber);
			System.out.println("secondBigNumber is:"+secondBigNumber);
			
		}

		public static void main(String[] args) {
			int[] num = {10,2,30,45,77,107,5};
			MaxTwoNumbersInArray obj = new  MaxTwoNumbersInArray();
			obj.twoMaxNumbersInArray(num);
		}


}
