package Apache_pack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {

	public ArrayList<String> getData(String testcasename) throws IOException  {
		
		ArrayList<String> alist = new ArrayList<String>();
		FileInputStream fis=new FileInputStream("G:\\D backup\\Software testing\\Course\\Selenium\\Poi_test_data.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		int sheetcount = workbook.getNumberOfSheets(); // this will give you the no of sheets
		System.out.println("The no of sheets are "+sheetcount);
		
		for(int i=0;i<sheetcount;i++)
		{
			if(workbook.getSheetName(i).equals("SheetA")) //compares the name of sheet at index0  
			{
			 XSSFSheet sheet = workbook.getSheetAt(i); //goes inside the sheet or getting the sheet
			 Iterator<Row> rows = sheet.iterator(); //returns you the rows
			 Row firstrow = rows.next(); //this will give you the first row 
			 Iterator<Cell> firstrowcells = firstrow.iterator(); //this will return you the cells
			 
			int c = 0;
			int TestCcolumnPostion = 0;
			 
			 while(firstrowcells.hasNext())
			 {
				  Cell firstrowcell = firstrowcells.next();
				  if(firstrowcell.getStringCellValue().equalsIgnoreCase("Tests"))
				  {
					  TestCcolumnPostion=c;
				  }
				  c++;
			 }
			 
			 while(rows.hasNext()) 
			 {
				Row row = rows.next();
			    Cell cell = row.getCell(TestCcolumnPostion);
				if(cell.getStringCellValue().equalsIgnoreCase("Register")) 
				 {
					Iterator<Cell> citr = row.iterator();
					while(citr.hasNext())
					 {
						Cell cellvalue = citr.next();
						if(cellvalue.getCellType()==CellType.STRING) 
						   {
							alist.add(cellvalue.getStringCellValue());
						   }else 
						   {
							alist.add(NumberToTextConverter.toText(cellvalue.getNumericCellValue()));
						   }
							
			           System.out.println(citr.next().getStringCellValue());
					 }
				}
			 }
			 
		   }
		 }
	}
}		
		
		
		
		
		
		
		

