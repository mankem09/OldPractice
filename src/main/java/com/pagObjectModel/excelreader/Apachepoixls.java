package com.pagObjectModel.excelreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Apachepoixls {

	public static void main(String[] args) throws Exception {
		File file= new File("D:/Jxcel/jxeclwb.xls");
			
		FileInputStream fis= new FileInputStream(file);
		
		HSSFWorkbook WB = new HSSFWorkbook(fis);
		int frow = WB.getSheetAt(0).getFirstRowNum();
		int lrow=WB.getSheet("data").getLastRowNum();
		
		System.out.println(frow);
		
		System.out.println(lrow);
		
		
		
	}
}
