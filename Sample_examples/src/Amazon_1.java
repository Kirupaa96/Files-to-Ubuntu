                                   // Verifying the Page Title of Amazon

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_1 {
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver object =new ChromeDriver();
		object.get("https://www.amazon.ca/");
		
		String Actual_Title = object.getTitle();
		String Expected_Title = "Amazon.ca: Low Prices � Fast Shipping � Millions of Items";
		
		if(Actual_Title.equals(Expected_Title))
		{
		 System.out.println("Test case is passed");	
		}
		else 
		{
		 System.out.println("Test case failed");
		}
		
		object.quit();
		
	}

}
