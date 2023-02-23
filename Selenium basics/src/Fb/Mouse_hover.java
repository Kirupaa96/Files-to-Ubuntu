package Fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	driver.get("https://www.amazon.ca/");
	
	WebElement accsignin = driver.findElement(By.id("nav-link-accountList"));
	Actions obj1 =new Actions(driver);
	obj1.moveToElement(accsignin).perform(); // move to element is a method which moves the mouse pointer to webelement accsignin
	
	driver.findElement(By.linkText("Your Account")).click();
	
	
	
		
		
		
	
		
		
		
		
		
		
	}

}
