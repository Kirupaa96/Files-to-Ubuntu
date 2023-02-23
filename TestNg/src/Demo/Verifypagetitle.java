package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verifypagetitle {
WebDriver driver; // declaring the object driver globally 	
	
	@BeforeTest
	
	public void openapplication()
	{
	System.setProperty("webdriver.chrome.driver","chromedriver"); 
	driver = new ChromeDriver(); 
	driver.get("https://www.facebook.com/");
	}
	
	@Test
	
	public void verifytitle()
	{
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Facebook - log in or sign up";
		Assert.assertEquals(ActualTitle,ExpectedTitle);
	}
	
	@AfterTest
	
	public void closeapplication()
	{
		  driver.quit();
	}
	
}
