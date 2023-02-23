package ReadData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read {

	
		public static void main(String[] args) throws IOException
		{
			
			String excelFilePath = "/Users/kirupaashankar/eclipse-workspace/EXCEL/Testdata/Sampledata.xlsx";
			FileInputStream inputStream = new FileInputStream(excelFilePath);
			
			XSSFWorkbook workBook = new XSSFWorkbook(inputStream); // This is to get the workbook 
			XSSFSheet sheet= workBook.getSheet("Sheet1"); // This will get the sheet 
			
			// To get the rows and cols from the sheet using For loop 
			
			int rows = sheet.getLastRowNum(); // This will give the last row number which is no of rows 
			int cols = sheet.getRow(1).getLastCellNum(); // Gives the last cell no in the first row which is column no  
			
			for (int r=0; r<=rows; r++)
			{
			    XSSFRow row = sheet.getRow(r);  
			for (int c=0; c<cols; c++)
			  {
			    XSSFCell cell = row.getCell(c);
			  
			    //The cell data can be of diff data type, so to read that we need to use getcelltype method
			    
			   switch(cell.getCellType())
			   {
			   case STRING:  System.out.println(cell.getStringCellValue());  break;
			   case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
			   case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;
			   }
			  }
			System.out.println();
			}  
			
		/*	// Ierator Method //
			
			Iterator iterator = sheet.iterator();
			
			while (iterator.hasNext())
			{
			  XSSFRow row = (XSSFRow) iterator.next();
			  Iterator cellIterator = row.cellIterator();
			  
			  while(cellIterator.hasNext())
			  {
				 XSSFCell cell = (XSSFCell) cellIterator.next();
				 
				 switch(cell.getCellType())
				   {
				   case STRING:  System.out.println(cell.getStringCellValue());  break;
				   case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
				   case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;
				   }
			  }
			  
			  
			} */ 
		
		}
		
}
