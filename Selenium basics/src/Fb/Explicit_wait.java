package Fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.partialLinkText("hidden")).click(); //or u can use linktext as well 
		
		driver.findElement(By.cssSelector("#start > button")).click();
		
		WebDriverWait obj =new WebDriverWait(driver,Duration.ofSeconds(20));//create object of webdriverwait class 
		obj.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));// webelement waits untill the 
		                     // output of css selector is visible which is hello world in this ex 
		
		
		
		
		String ActualResult = driver.findElement(By.cssSelector("#finish > h4")).getText();
		String ExpectedResult = "Hello World!";
		

		if (ActualResult.equals(ExpectedResult))
		{
			System.out.println("Test case passed");
		}
		else 
		{
			System.out.println("Test case failed");
		}
		
	}

}
             /* Fluent wait 
              //Declare and initialise a fluent wait
      FluentWait wait = new FluentWait(driver);
//Specify the timout of the wait
      wait.withTimeout(5000, TimeUnit.MILLISECONDS);
//Sepcify polling time
      wait.pollingEvery(250, TimeUnit.MILLISECONDS);
//Specify what exceptions to ignore
      wait.ignoring(NoSuchElementException.class)

//This is how we specify the condition to wait on.
//This is what we will explore more in this chapter
      wait.until(ExpectedConditions.alertIsPresent());

           */
