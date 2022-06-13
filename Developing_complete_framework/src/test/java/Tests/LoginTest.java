package Tests;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pageobjects.AccountPage;
import Pageobjects.LandingPage;
import Pageobjects.LoginPage;
import Resources.Base;

public class LoginTest extends Base{
	Logger log;
	public WebDriver driver;
	
	
	@BeforeMethod
	public void openapplication() throws IOException
	{
		log = LogManager.getLogger(LoginTest.class.getName());  // code for logs. create in beforemethod since this method will execute first 
		
		driver = initializedriver();
	    log.debug("Browser got launched");
		driver.get(prop.getProperty("url"));
		log.debug("Navigated to application URL");
	}
	
	@Test(dataProvider="getLoginData")
	public void login(String email,String password,String expectedresult) throws IOException
	{
	    LandingPage obj1=new LandingPage(driver);
		LoginPage obj2=new LoginPage(driver);
		AccountPage obj3=new AccountPage(driver);
	
		obj1.myaccdropdown().click();
		log.debug("Clicked on My Account dropdown");
		obj1.loginoption().click();
		log.debug("Clicked on login option");
		
		//obj2.emailaddressfield().sendKeys(prop.getProperty("email"));
		//obj2.passwordfield().sendKeys(prop.getProperty("password"));
		obj2.emailaddressfield().sendKeys(email);
		log.debug("Email addressed got entered");
		obj2.passwordfield().sendKeys(password);
		log.debug("Password got entered");
		obj2.loginbtn().click();
		log.debug("Clicked on Login Button");
		
		String actualresult = null;
	    try
	    {
		   if(obj3.assertion().isDisplayed())
		   {
			   log.debug("User got logged in");
			   actualresult="Successful";
		   }
	    }
	    catch(Exception e)
	    {
	    	log.debug("User didn't log in");
	    	actualresult="Failure";
	    }
		
       if(actualresult.equals(expectedresult)) 
       {
		   log.info("Login Test got passed");
	   } 
       else
       {
		   log.error("Login Test got failed");
	   }
	
	} 
	
	@DataProvider
	public Object[][] getLoginData()
	{
		Object data[][]= {{"arun.selenium@gmail.com","Second@123","Successful"}};
		return data;
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		log.debug("Browser got closed");
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
