package Class_pack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {

	@Test(dataProvider="getdata")
	public void logintest(String username, String password)
	{
		
		System.out.println("User logged in successfully using "+username+" and "+password);
		
	}
	
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="Kirupaa";
		data[0][1]="123";
		
		data[1][0]="Shankar";
		data[1][1]="456";
		
		data[2][0]="AJK";
		data[2][1]="789";
		
		return data;
	}
}
