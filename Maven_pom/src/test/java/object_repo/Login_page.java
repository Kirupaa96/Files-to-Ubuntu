package object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	WebDriver driver;
	
	/* private By email = By.id("input-email");
	private By password = By.id("input-password");
	private By loginbtn= By.cssSelector("#content > div > div:nth-child(2) > div > form > input"); */
	
	
	@FindBy(id="input-email")
	private WebElement email;
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(css="#content > div > div:nth-child(2) > div > form > input")
	private WebElement loginbtn;
	
	
	public Login_page(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement email()
	{
		//return driver.findElement(email);
		return email;
	}
	
	public WebElement password()
	{
		//return driver.findElement(password);
		return password;
	}
	
	public WebElement loginbtn()
	{
		//return driver.findElement(loginbtn);
		return loginbtn;
	}
	
	
	
	
	
	
	
	
	
	
	
}
