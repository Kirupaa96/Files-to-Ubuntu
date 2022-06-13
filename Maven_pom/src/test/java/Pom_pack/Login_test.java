package Pom_pack;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import object_repo.Login_page;
import object_repo.Myacc_page;

public class Login_test {
	WebDriver driver;
	
	@Test
	public void login()
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		
		Login_page obj1=new Login_page(driver);
		
		obj1.email().sendKeys("arun.selenium@gmail.com");
		obj1.password().sendKeys("Second@123");
        obj1.loginbtn().click();
		
		Myacc_page obj2 =new Myacc_page(driver);
		boolean val = obj2.validation().isDisplayed();
		Assert.assertTrue(val);
		
	}
	
	@AfterTest
	public void closeapp()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
