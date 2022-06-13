package Step_defenitions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class omayo {
	WebDriver driver;
	
	
	@Before("@omayo")
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
	    driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Given("^I navigate to application url$")
	public void I_navigate_to_application_url()
	{
		
		driver.get("https://omayo.blogspot.com/");
	}
	
	@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void I_enter_username_as_someusername_and_password_as_somepassword(String username, String password)
	{
		driver.findElement(By.name("userid")).sendKeys(username);
		driver.findElement(By.name("pswrd")).sendKeys(password);
	}
	
	@And("^I click on login button$") 
	public void I_click_on_login_button()
	{
		driver.findElement(By.cssSelector("#HTML42 > div.widget-content > form > input[type=button]:nth-child(3)")).click();
	}
	
	@Then("^User should be able to login based on \"([^\"]*)\" login status$")
	public void User_should_be_able_to_login_based_on_expected_login_status(String expectedresult)
	{
		String actualresult=null;
		
		try
	    {
		  Alert alert = driver.switchTo().alert();
		  
	      if(alert.getText().contains("Error Password or Username"))
	        {
	    	  actualresult="failure";
	        }
	    }
		catch(Exception e)
	    {
	      actualresult="success";
	    }
	   
	    Assert.assertEquals(expectedresult,actualresult);
	    
	  
	}
	
	@After("@omayo")
	public void closeapp()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
