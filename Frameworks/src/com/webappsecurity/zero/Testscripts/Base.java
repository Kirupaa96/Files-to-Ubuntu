package com.webappsecurity.zero.Testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	 WebDriver driver;	
		@BeforeClass
		
		public void openapplication()
		{
		System.setProperty("webdriver.chrome.driver","chromedriver"); 
		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://zero.webappsecurity.com/login.html");
		driver.navigate().refresh();
		}
	
	
	
	    @AfterClass
		
	    public void closeapplication()
	       {
		      driver.quit();
	       }

}
