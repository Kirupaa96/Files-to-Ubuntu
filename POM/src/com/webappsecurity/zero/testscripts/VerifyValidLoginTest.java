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

public class VerifyValidLoginTest extends Base {
	 
	
	@Test 
	   
	   public void verifyValidLogin()
	   {
	    Login lp = new Login(driver);
	    Home hm = new Home(driver);
	    
	    
	    lp.applicationlogin("username","password");
	    driver.navigate().back();
	    
	    boolean transferfundspresent = hm.isTransferFundsPresent();
	    Assert.assertTrue(transferfundspresent);	
	    
	   }
				
  
}
