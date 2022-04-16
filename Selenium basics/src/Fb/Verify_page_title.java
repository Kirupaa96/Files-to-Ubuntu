package Fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_page_title {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); //path for chrome driver 
		
		WebDriver driver =new ChromeDriver(); //webdriver is class name, driver is the object name.
		driver.get("https://www.facebook.com/");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Facebook - Log In or Sign Up";
		
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
