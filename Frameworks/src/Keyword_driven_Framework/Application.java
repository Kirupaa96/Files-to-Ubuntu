package Keyword_driven_Framework;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {

	@Test
	public void verifyInvalidLogin() throws IOException {
		
	String[][] data = GenericMethods.getData("\\Users\\kirupaashankar\\Kirupaa\\Software Testing\\Course\\Selenium\\week 4\\Testdata.xlsx", "Sheet2");
	Methods mtd =new Methods(); // create outside for loop
	for(int i=1;i<data.length;i++)
	{
		switch(data[i][3])
		{
		case "openApp":
			mtd.openApplication(data[i][6]);
			break;
			
		case "enterInTextBox":
			mtd.enterInTextBox(data[i][5],data[i][6]);
		    break;
		    
		case "clickButton":  
			mtd.clickAbuton(data[i][4],data[i][5]);
			break;
			
		case "verifyMsg":
			String actualMsg = mtd.getMessage(data[i][4],data[i][5]); // since its returning error msg store it in a string var.
			String expectedMsg = data[i][6];
			Assert.assertEquals(actualMsg, expectedMsg);
			break;
			
		case "closeApp":
			mtd.closeApplication();
			break;
		}
	}
}
}
