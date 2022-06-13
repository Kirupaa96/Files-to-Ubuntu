package StepDefenition;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pageobjects.AccountPage;
import Pageobjects.LandingPage;
import Pageobjects.LoginPage;
import Resources.Base;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Base {
	
	public WebDriver driver;
	LandingPage obj1;
	LoginPage obj2;
	AccountPage obj3;

	    @Given("^Open any Browser$")
	    public void open_any_browser() throws IOException 
	    {
	    	driver = initializedriver();
	    }

	    @And("^Navigate to Login page$")
	    public void navigate_to_login_page() 
	    {
	    	driver.get(prop.getProperty("url"));
	    	obj1=new LandingPage(driver);
	    	
	    	obj1.myaccdropdown().click();
	    	obj1.loginoption().click();
	     }
	    
	    @When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
	    public void user_enters_username_as_something_and_password_as_something_into_the_fields(String email, String password)
	    {
	    	obj2=new LoginPage(driver);
	    	
	    	obj2.emailaddressfield().sendKeys(email);
			obj2.passwordfield().sendKeys(password);
	   }

	    @And("^User clicks on Login button$")
	    public void user_clicks_on_login_button() 
	    {
	    	obj2.loginbtn().click();
	    }

	    @Then("^Verify user is able to successfully login$")
	    public void verify_user_is_able_to_successfully_login()
	    {
	        obj3=new AccountPage(driver);
	    	Assert.assertTrue(obj3.assertion().isDisplayed());
	    }

	    
	    @After
	    public void closeapplication()
	    {
	    	driver.quit();
	    }
	   

	   
	}
	
	

