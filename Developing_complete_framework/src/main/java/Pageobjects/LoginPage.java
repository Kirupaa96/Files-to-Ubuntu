package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="email")
	private WebElement emailaddressfield;
	
	@FindBy(name="password")
	private WebElement passwordfield;
	
	@FindBy(xpath="//input[contains(@type,'submit')]")
	private WebElement loginbtn;
	
	public WebElement emailaddressfield()
	{
		return emailaddressfield;
	}
	
	public WebElement passwordfield()
	{
		return passwordfield;
	}
	
	public WebElement loginbtn()
	{
		return loginbtn;
	}
	
	
	
	
	
	
}
