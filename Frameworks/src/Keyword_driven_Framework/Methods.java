package Keyword_driven_Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	WebDriver driver;
	public void openApplication(String url) 
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	
	public void enterInTextBox(String locValue,String testData)
	{
		driver.findElement(By.id(locValue)).sendKeys(testData);
	}
	
	public void clickAbuton(String loc,String locValue) 
	{
	if (loc.equals("name"))
	  {
		driver.findElement(By.name(locValue)).click();
	  }
	else if (loc.equals("Xpath"))
	  {
		driver.findElement(By.xpath(locValue)).click();
	  }
	}
	
	public String getMessage(String loc,String locValue)
	{
	String errMsg = null; // increasing the scope of var,since we are trying to use it outside.
	if (loc.equals("cssSelector"))	
	  {	
	    errMsg =driver.findElement(By.cssSelector(locValue)).getText();
	  }   
	else if (loc.equals("id"))
	 {
	   errMsg =driver.findElement(By.id(locValue)).getText();
	 }
	  return errMsg;// returning the error msg back to app class 
	                // since var errmsg is defined inside {}u can't call it outside, so just define it outside {}
	}
	
	public void closeApplication()
	{
		driver.quit();
	}
	
}
