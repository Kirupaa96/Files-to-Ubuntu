package Fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
	
	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	 List<WebElement> allLinks = driver.findElements(By.tagName("a")); // It will store all the links in array
	
	 
	 System.out.println("Total links in Fb page is "+allLinks.size());
	 for(WebElement link:allLinks)
	    {
		 System.out.println(link.getText() + " - " + link.getAttribute("href"));
		 }
	
	}
}
