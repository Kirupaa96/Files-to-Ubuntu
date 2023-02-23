package Fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox_ex {
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
		
		driver.switchTo().alert().accept(); // to accept (clicks ok) on alert box. 
		//  driver.switchTo().alert().cancel(); >>>>>> if u want to cancel an alert box 
		
		
	    driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		driver.switchTo().alert().sendKeys("Hi this is kirupaa");
		driver.switchTo().alert().accept();
		
	
		
		
		
		
	}

}
