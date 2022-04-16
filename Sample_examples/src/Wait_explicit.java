import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_explicit {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		
		driver.findElement(By.cssSelector("#start > button")).click();
		
	    WebDriverWait obj = new WebDriverWait(driver,Duration.ofSeconds(20)); // explicit wait statements
	    obj.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
	    
	    
	    
				
	String Actual_result = driver.findElement(By.cssSelector("#finish > h4")).getText();
	String Expected_result = "Hello World!";
	
	 if(Actual_result.equals(Expected_result))
		{
		 System.out.println("Test case is passed");	
		}
		else 
		{
		 System.out.println("Test case failed");
		}
		
		
		
	}

}
