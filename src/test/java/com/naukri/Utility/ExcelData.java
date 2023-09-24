package com.naukri.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	XSSFWorkbook wb;
	
	public ExcelData()  {
	
		File src=new File("./TestData//Login.xlsx");
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			System.out.println("  read excel Successfully ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read Excel Data"+e.getMessage());
		}
		
	}
	
	public String getStringData(String sheetIndex,int row,int column) {
		return wb.getSheet(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		
	}
	public String getNumbericData(String sheetName,int row,int column) {
		
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	public double getNuricData(String sheetName,int row,int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
   }
}



















