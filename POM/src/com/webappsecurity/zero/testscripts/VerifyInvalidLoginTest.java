package com.webappsecurity.zero.testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webappsecurity.zero.pages.Login;

	public class VerifyInvalidLoginTest extends Base {
		@Test  
		   
		 public void InvalidLogin()
		  {
		 	Login lp =new Login(driver);
		 	lp.applicationlogin("username","hbwojfnlvwn");
			
			String ActualText = lp.getErrorMsgText();
			String ExpectedText ="Login and/or password are wrong.";
			Assert.assertEquals(ActualText,ExpectedText);
			
			
			
		  }
		
			
	}
