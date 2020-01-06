package com.pagObjectModel.excelreader;

import java.io.File;

import jxl.Workbook;

public class jxlReader {
	
	public static void main(String[] args) throws Exception {
	
	File file= new File("D:\\Jxcel\\jxeclwb.xls");
	
	Workbook wb=Workbook.getWorkbook(file);
	int rows = wb.getSheet(0).getRows();
	int columns = wb.getSheet(0).getColumns();
	String data00 = null;
	
	for(int i=0;i<=rows;i++)
	{
		for(int j=0;j<=columns;j++)
		{
			data00= wb.getSheet(0).getCell(i,j).getContents();
			System.out.println(data00);
		}
		
		
	}
	

}


	
}
