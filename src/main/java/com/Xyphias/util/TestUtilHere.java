package com.Xyphias.util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Xyphias.Schneider.testbase.TestBase;

public class TestUtilHere extends TestBase{
	public static Workbook book;
	
	public static Sheet sheet;
	
	public static String Excel_Sheet_Path = "D:\\Eclipse Workspace\\MyPageObjectModelHybridproject"
			+ ""
			+ ""
			+ "\\src\\main\\java\\com\\Xyphias\\Schneider\\ExcelSheet\\FreeCRM.xlsx" ;
	
	public long PAGE_LOAD_TIMEOUT = 30;
	
	public long IMPLICIT_WAIT = 30;
	
	
	public void SwitchFrames() {
		
		
		driver.switchTo().frame("mainpanel") ;
		
	}
	
	
	public static Object[][] getstringdata(String sheetName){
		
		FileInputStream file = null ;
		
		try {
			
			file = new FileInputStream(Excel_Sheet_Path);
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		try {
			
			book = WorkbookFactory.create(file);
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		sheet = book.getSheet(sheetName);
		
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		
		for(int i = 0 ; i < sheet.getLastRowNum() ; i++) {
			
			for(int j = 0 ; j <sheet.getRow(0).getLastCellNum();j++ ) {
				
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		return data ;
		
	}
	
	
	
	
	
	

}
