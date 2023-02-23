package com.webappsecurity.zero.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.webappsecurity.zero.pages.B_home;
import com.webappsecurity.zero.pages.A_login;
import com.webappsecurity.zero.pages.D_transferFundsVerfiy;
import com.webappsecurity.zero.pages.C_transferfunds;
import com.webappsecurity.zero.pages.E_transferfundsConfirmation;

public class VerifyFundTransferTest extends Base {
	

	@Test 
	
	public void doFundTransfer()
	{
		A_login lp = new A_login(driver); // since it has the constructor you have to pass the driver when you are creating object of the class.
		B_home hm = new B_home(driver);
		C_transferfunds tf = new C_transferfunds(driver);
		D_transferFundsVerfiy tfv = new D_transferFundsVerfiy(driver);
		E_transferfundsConfirmation tfc =new E_transferfundsConfirmation(driver);
		
		lp.applicationlogin("username","password");
		driver.navigate().back(); // coz of http req
		
		hm.clicktransferfunds();
		
		tf.doFundTransfer("350","Fund Transfer of 350$");
		
		tfv.clickSubmit();
		
		String ActualMsg = tfc.getConfMsg();	
	    String ExpectedMsg = "You successfully submitted your transaction.";
	    Assert.assertEquals(ActualMsg , ExpectedMsg);
	        		
	}
}
