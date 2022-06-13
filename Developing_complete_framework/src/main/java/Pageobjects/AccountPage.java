package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

WebDriver driver;
	
	public AccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Edit your account information")
	private WebElement assertion;
	
	public WebElement assertion()
	{
		return assertion;
	}
	
	
	
	
	
	
	
	
}
