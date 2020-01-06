package com.pageObjectModel.uiObjects;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int sizeOfRows = Integer.parseInt(s.nextLine());
		int sizeOfColumns = Integer.parseInt(s.nextLine());
		int[][] matrix = new int[sizeOfRows][sizeOfColumns];
		for (int i = 0; i < sizeOfRows; i++) {
			for (int j = 0; j < sizeOfColumns; j++) {
				matrix[i][j] = Integer.parseInt(s.nextLine());
			}
		}

		System.out.println("rOW SIZE" + matrix.length);
		System.out.println("Column size" + matrix[0].length);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();

		}

		
		int a=0,b=0;
		for(int i=0;i<sizeOfColumns;++i) {
			
			System.out.print(matrix[a][i]+",");
		}a++;
		for(int i=a;i<matrix[0].length;i++) {
			System.out.print(matrix[i][sizeOfColumns-1]+",");
		}sizeOfColumns--;
		for(int i=sizeOfRows-1;i>a;i--) {
			System.out.print(matrix[i][a]);
		}
		
		
		
	}
	
	

}
