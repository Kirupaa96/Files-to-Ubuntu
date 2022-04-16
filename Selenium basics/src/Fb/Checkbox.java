package Fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Checkboxes")).click();
		
		boolean result = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)")).isSelected();
		if(result == false)
		{
			driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)")).click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
