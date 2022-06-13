package mpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneTest {
WebDriver driver;
	@Test
	public void method1()
	{
		WebDriverManager.chromedriver().setup();
	    driver =new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String actual= driver.findElement(By.id("pah")).getText();
		System.out.println(actual);
		
		Assert.assertEquals(actual,"PracticeAutomationHere");
	}
		
		
		@AfterTest
		public void closeapp()
		{
			driver.quit();
		}
		
	
}
