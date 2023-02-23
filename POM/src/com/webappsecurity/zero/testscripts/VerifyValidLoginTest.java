package com.webappsecurity.zero.testscripts;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.webappsecurity.zero.pages.B_home;
import com.webappsecurity.zero.pages.A_login;

public class VerifyValidLoginTest extends Base {
	 
	
	@Test 
	   
	   public void verifyValidLogin()
	   {
	    A_login lp = new A_login(driver);
	    B_home hm = new B_home(driver);
	    
	    
	    lp.applicationlogin("username","password");
	    driver.navigate().back();
	    
	    boolean transferfundspresent = hm.isTransferFundsPresent();
	    Assert.assertTrue(transferfundspresent);	
	    
	   }
				
  
}
