package Fb; 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_invalid_login {
	public static void main(String[] args) {
		
		
WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();  // just to maximise the window 
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //Implicitly wait 
		
driver.findElement(By.id("email")).sendKeys("thjaslf@gmail.com");//find the web element whose id is "email"
		                                                           //& tell what action it has to perform.
driver.findElement(By.id("pass")).sendKeys("Jaguar"); 	
driver.findElement(By.name("login")).click(); 

String ActualErrorMsg = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();

String ExpectedErrorMsg = "The email you entered isn’t connected to an account. Find your account and log in.";		
		
	if (ActualErrorMsg.equals(ExpectedErrorMsg))	
	{
		System.out.println("Test case passed");
	}
	else
	{
	    System.out.println("Test case failed");	
	}
driver.quit();



	
}

}
