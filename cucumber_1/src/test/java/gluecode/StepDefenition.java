package gluecode;              // Eqv code for Given,When,And,Then commands


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefenition {

	WebDriver driver;
	
	@Given("^Login page of zero bank on Browser \"(.*)\"$")
	public void openApplication(String Browser)
	{
	 if(Browser.equals("Chrome"))
	 { 
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	 }
	 else if (Browser.equals("Firefox"))
	 {
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	 }
	 else if (Browser.equals("Edge"))
	 {
		 WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
	  }	 
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.get("http://zero.webappsecurity.com/login.html");
	}
	
	@When("^correct loginname \"(.*)\" and password \"(.*)\" is entered$")
	public void enterCredentials(String loginname, String loginpassword)
	{
		driver.findElement(By.name("user_login")).sendKeys(loginname);
		driver.findElement(By.name("user_password")).sendKeys(loginpassword);
	}
	
	@And("^click on sign in button$")
	public void clickSignin()
	{
		driver.findElement(By.name("submit")).click();
	}
	
	@Then("^Login is successful$")
	public void verifyLogin()
	{
		driver.navigate().back();
	    boolean home =driver.findElement(By.id("transfer_funds_link")).isDisplayed();
	    Assert.assertTrue(home);
	    driver.quit();
	}
	
}
