package Step_defenitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
WebDriver driver;
	
	@Before("@Ninja")
	public void openapp()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
    @Given("^I navigates to login page of the application$")
	public void loginpage() 
	{
       driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");	
	}
	    
	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\" into the fields$")
	public void credentials(String username, String password)
	{
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
	}
	    
	@And("^I click on Login button$")
	public void click()
	{
		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
	}
	
	@Then("^I should be successfully login$")
	public void success()
	{
	   try
	   {
	   WebElement a=driver.findElement(By.linkText("Logout"));
	   boolean ans=a.isDisplayed();
	   Assert.assertTrue(ans);
	   }
	   catch(Exception e)
	   {
		   Assert.fail("Login failed");
		   //System.out.println("Login Failed");
	   }
	
	}
	
	@After("@Ninja")
	public void closeapp()
	{
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
