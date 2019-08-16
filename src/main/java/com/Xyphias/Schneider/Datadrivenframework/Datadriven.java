package com.Xyphias.Schneider.Datadrivenframework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadriven {
	
	public static String Excel_Home_Location = "D:\\Eclipse Workspace\\MyPageObjectModelHybridproject\\src\\main\\java\\com\\Xyphias\\Schneider\\ExcelSheet\\FreeCRM.xlsx";
	
	
	public static Workbook work;
	
	public static Sheet sheet;
	
    
	
	public  static Object[][] getdatahere(String sheetName){
		
		
		FileInputStream file = null ;
		
		try {
			
			file = new FileInputStream(Excel_Home_Location);
			
			
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		try {
			
			work = WorkbookFactory.create(file);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		sheet = work.getSheet(sheetName);
		
		
		Object[][] datas = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i = 0 ; i<sheet.getLastRowNum(); i++) {
			
			for(int j = 0; j< sheet.getRow(0).getLastCellNum();j++) {
				
				datas[i][j] = sheet.getRow(i+1).getCell(j);
			}
		}
		
		return datas;
		
		
	}
	

}
