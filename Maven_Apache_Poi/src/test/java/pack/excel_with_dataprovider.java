package pack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.excel_code;

public class excel_with_dataprovider {

	
	@Test(dataProvider="test1data")
	public void test1(String username, String password)
	{
		System.out.println(username +"|"+ password);
	}
	
	@DataProvider(name= "test1data")
	public static Object[][] getdata()
	{
		String excelpath ="./excel_data/data.xlsx";
		String sheetname ="Sheet1";
		Object data[][]=  testdata(excelpath, sheetname);
        return data;	
	}
	
	public static Object[][] testdata(String excelpath,String sheetname)
	  {
		excel_code obj =new excel_code(excelpath, sheetname);
		int rowcount= obj.get_row_count();
		int colcount= obj.get_col_count();
		
		Object data[][]=new Object[rowcount-1][colcount]; //specifies the size of array excluding headers so -1
		
		for (int i=1; i<rowcount; i++)
		  {
		   for (int j=0; j<colcount; j++)
		   {
			  Object celldata = obj.get_cell_data(i, j);
			  data[i-1][j] = celldata;
		   }  
		  }
		return data;
	  }
}
