package com.webappsecurity.zero.testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webappsecurity.zero.pages.Home;
import com.webappsecurity.zero.pages.Login;
import com.webappsecurity.zero.pages.TransferFundsVerfiy;
import com.webappsecurity.zero.pages.Transferfunds;
import com.webappsecurity.zero.pages.TransferfundsConfirmation;

public class VerifyFundTransferTest extends Base {
	

	@Test 
	
	public void doFundTransfer()
	{
		Login lp = new Login(driver); // since it has the constructor you have to pass the driver.
		Home hm = new Home(driver);
		Transferfunds tf = new Transferfunds(driver);
		TransferFundsVerfiy tfv = new TransferFundsVerfiy(driver);
		TransferfundsConfirmation tfc =new TransferfundsConfirmation(driver);
		
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
