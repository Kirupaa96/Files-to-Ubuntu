package Fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_page_title {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver"); //path for chrome driver 
		WebDriver driver =new ChromeDriver(); //webdriver is class name, driver is the object name,chromedriver is a childclass.
		
		driver.get("https://www.facebook.com/");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Facebook - log in or sign up";
		
		if (ActualTitle.equals(ExpectedTitle))
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
