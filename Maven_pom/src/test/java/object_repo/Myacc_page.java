package object_repo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myacc_page {

	WebDriver driver;
	
	//private By logout = By.linkText("Logout");
	
	@FindBy(linkText="Logout")
	private WebElement logout;
	
	public Myacc_page(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement validation()
	{
		return logout;
	}
	
	
}
