package excelFileReading;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReading {

	public static void main(String[] args) throws BiffException, IOException 
	
	{

		File scr=new File("C:\\Users\\Kavya\\Desktop\\Eclipse\\Selenium_1\\TestData.xls");
		
		Workbook wb=Workbook.getWorkbook(scr);
		
		int no_sheets=wb.getNumberOfSheets();
		
		int no_cloumns_insheet1=wb.getSheet(0).getColumns();
		
		int no_rows_insheet1=wb.getSheet(0).getRows();
		
		String data=wb.getSheet(1).getCell(1, 0).getContents();
		
		
		System.out.println("Number of sheets in the TestData excel---> "+no_sheets);
		
		System.out.println("Number of Columns in the sheet1---> "+no_cloumns_insheet1);
		
		System.out.println("Number of Rows in the sheet1---> "+no_rows_insheet1);
		
		System.out.println("cloumn1 and row0 info of sheet2---> "+data);
		
		
		
		
	}

}
