package Class_pack;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_fn {
	WebDriver driver;
	
	@Test
	public void scrollVertically()
	{
		try 
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.switchTo().alert().dismiss();
		
		JavascriptExecutor obj = (JavascriptExecutor)driver;
		
		// Scroll down 
		obj.executeScript("window.scrollBy(0,500);");
		Thread.sleep(5000);
		
		// Scroll up 
		obj.executeScript("window.scrollBy(0,-500);");
		Thread.sleep(5000);
		
		// To get the complete pixel (length) of the page - Bottom of the screen 
		//obj.executeScript("window.scrollBy(0,document.body.scrollHeight);");     
		
		//Scroll to particular WebElement 
	    WebElement youtube = driver.findElement(By.xpath("//a[contains(@title,\"Youtube\")]"));
	    obj.executeScript("arguments[0].scrollIntoView();",youtube);
	    youtube.click();
		} 
		catch (Exception ex)
		{
			ex.printStackTrace();
			System.out.println(ex);
		}
    }
	
	@Test
	public void scrollHorizontally()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.album.alexflueras.ro/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor obj = (JavascriptExecutor)driver;
		
		WebElement scrollRight= driver.findElement(By.id("a22"));
		WebElement scrollLeft= driver.findElement(By.id("a1"));
		
		obj.executeScript("arguments[0].scrollIntoView();", scrollRight); 
		
		obj.executeScript("arguments[0].scrollIntoView();", scrollLeft); 
		
	}
	
	
	
}
