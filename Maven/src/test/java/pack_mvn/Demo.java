package pack_mvn;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	
	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[contains(@class,'hidden-xs hidden-sm hidden-md')])[3]")).click(); //clicking myaccount
		driver.findElement(By.linkText("Login")).click(); //clicking login 
		driver.findElement(By.id("input-email")).sendKeys("arun.selenium5@gmail.com"); //id
		driver.findElement(By.id("input-password")).sendKeys("Second@123"); //pswd
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();  //login btn
		
		boolean validation= driver.findElement(By.linkText("Logout")).isDisplayed();
	    if(validation==true)
	    {
		 System.out.println("You have successfully logged in");
	    }
		
	    driver.findElement(By.name("search")).sendKeys("iphone");
	    driver.findElement(By.cssSelector("#search > span > button")).click();
	    
	    boolean result= driver.findElement(By.xpath("//div[contains(@class,'product-thumb')]")).isDisplayed();
		if(result==true)
		{
			System.out.println("Result is diplayed");
		}
		driver.findElement(By.xpath("//div[contains(@class,'product-thumb')]")).click();
		boolean iphone= driver.findElement(By.cssSelector("#content > div:nth-child(1) > div.col-sm-4 > h1")).isDisplayed();
		if(iphone==true)
		{
			System.out.println("Iphone page is displayed");
		}
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("3");
		driver.findElement(By.xpath("(//button[contains(@type,'button')])[11]")).click(); //add to cart 
		
		WebDriverWait obj =new WebDriverWait(driver,Duration.ofSeconds(10));
		obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'alert alert-success alert-dismissible')]")));
		
		String Actual_msg= driver.findElement(By.xpath("//div[contains(@class,'alert alert-success alert-dismissible')]")).getText();
		String Expected_msg = "Success: You have added iPhone to your shopping cart!";
		if(Actual_msg.equals(Expected_msg))
		{
			System.out.println("Success: You have added iPhone to your shopping cart!");
		}
		
		driver.findElement(By.linkText("shopping cart")).click();
		boolean s_cart= driver.findElement(By.cssSelector("#content > h1")).isDisplayed();
		if(s_cart==true)
		{
			System.out.println("You are in Shopping carts page");
		}
		
		driver.findElement(By.linkText("Checkout")).click();
		
		
		
		
		
		
		
		
		


	
	
	}
}
