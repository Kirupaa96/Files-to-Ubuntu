package Demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshot_ex {
  WebDriver driver;	
	
	@BeforeTest
		
		public void openapplication()
		{
		System.setProperty("webdriver.chrome.driver","chromedriver"); 
		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://zero.webappsecurity.com/login.html");
		driver.navigate().refresh();
		}
	
	@Test
	
	     public void verifyfundtransfer() throws IOException{
		 try 
			{
			   driver.findElement(By.id("user_login")).sendKeys("username1"); //username is the crct key
			   driver.findElement(By.id("user_password")).sendKeys("password");
			   driver.findElement(By.name("submit")).click();
			   driver.navigate().back(); // coz its a http protocol,not like in the real time.
			   
			   driver.findElement(By.id("transfer_funds_link")).click();
			   driver.findElement(By.id("tf_amount")).sendKeys("200");
			   driver.findElement(By.id("btn_submit")).click();
			   driver.findElement(By.id("btn_submit")).click();
			   String Actualtext = driver.findElement(By.cssSelector("#transfer_funds_content > div > div > div.alert.alert-success")).getText();
			   String Expectedtext = "You successfully submitted your transaction.";
			   Assert.assertEquals(Actualtext, Expectedtext);
			}
	     catch (Exception ex) //ex is the name of an exception
	        {
	    	 takeScreenshot();
	    	 Assert.fail("Script failed due to exception " + ex);
	    	 }
	       }		
	
		 private void takeScreenshot() throws IOException {
				File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(ss, new File("/Users/kirupaashankar/SC"+(new Random().nextInt())+".jpg"));
			}

 
	@AfterTest
	
	     public void closeapplication()
	    {
		 driver.quit();
    	}
	
}
