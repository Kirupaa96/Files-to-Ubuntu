package pack;

import utils.excel_code;

public class demo {

	public static void main(String[] args) 
	{
	 String Excelpath ="./excel_data/data.xlsx";
	 String Sheetname ="Sheet1";
	
	 excel_code obj =new excel_code(Excelpath, Sheetname);
	 obj.get_row_count();
	 obj.get_col_count();
	 obj.get_cell_data(1, 0);
	}
	
	
}
