package com.webappsecurity.zero.Testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.pages.Home;
import com.webappsecurity.zero.pages.Login;
import com.webappsecurity.zero.pages.TransferFundsVerfiy;
import com.webappsecurity.zero.pages.Transferfunds;
import com.webappsecurity.zero.pages.TransferfundsConfirmation;

import utils.GenericMethods;

public class VerifyFundTransferTest extends Base {

	@Test 
	
	public void VerifyFundTransfer() throws IOException  
	{
		Login lp =new Login(driver);
		Home hm =new Home(driver);
		Transferfunds tf =new Transferfunds(driver);
		TransferFundsVerfiy tfv = new TransferFundsVerfiy(driver);
		TransferfundsConfirmation tfc = new TransferfundsConfirmation(driver);
		
		
		String[][] data = GenericMethods.getData("\\Users\\kirupaashankar\\Kirupaa/Software Testing\\Course\\Selenium\\week 4\\Testdata.xlsx","Sheet1"); //so,this test data will be 
		                                                                                                                              //stored in a array name data.
		
		// If i have to run the below script for m/p iterations,use for loop.
		
		for (int i=1;i<data.length;i++) //data.length is the length of 2d array which tells the no of rows that is 4.
		{
		lp.applicationlogin(data[i][0],data[i][1]);
		driver.navigate().back();
		
		hm.clicktransferfunds();
		
		tf.doFundTransfer((data[i][2]),Integer.parseInt(data[i][3]),data[i][4],data[i][5]);
		
		tfv.clickSubmit();
		
		String Actualmsg = tfc.getConfMsg();
		String Expectedmsg = data[i][6];
		Assert.assertEquals(Actualmsg,Expectedmsg);
		
		// to logout from app and to return to login page inorder to run m/p iterations
		tfc.logoutFromApp();
		driver.navigate().to("http://zero.webappsecurity.com/login.html");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
