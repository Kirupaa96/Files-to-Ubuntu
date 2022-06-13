package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//span[contains(@class,'hidden-xs hidden-sm hidden-md')])[3]")
	private WebElement myaccdropdown;
	
	@FindBy(linkText="Login")
	private WebElement loginoption;
	
	
	
	public WebElement myaccdropdown()
	{
		return myaccdropdown;
	}
	
	public WebElement loginoption()
	{
		return loginoption;
	}
	
	
	
	
	
	
}
