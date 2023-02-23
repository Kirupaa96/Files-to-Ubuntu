package Fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestive_dropdown {

	public static void main(String[] args)
	{
		//WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	    driver.get("https://www.makemytrip.com/");
	    
	   
	   driver.findElement(By.id("fromCity")).click();
	   WebElement Fromcity = driver.findElement(By.xpath("//input[@placeholder='From']"));
	   Fromcity.click();
	   Fromcity.sendKeys("chen");
	   
	    int i=0;
	    while(i<5)
		{
		  driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys(Keys.DOWN);
		  i++;
		}
		
		 driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys(Keys.ENTER);
		
		
		

	}

}
