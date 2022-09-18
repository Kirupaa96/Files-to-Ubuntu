package Fb;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Multiple_window_handles {
	 

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/"); //Main window 
		
		driver.findElement(By.linkText("Open a popup window")).click();  // 1st Child window opens
		driver.findElement(By.linkText("Blogger")).click(); //2nd child window opens
		 
	    Set<String> windowids = driver.getWindowHandles(); //All the windows will be captured and stored in set of strings in random order.
	    Iterator<String> itr = windowids.iterator();
	   
//	     When there is only 1 pop window 
//	    String mainwindowid = itr.next();
//		String childwindowid = itr.next();
//		driver.switchTo().window(childwindowid); // Now the focus is switched to childwindow.
//		String text= driver.findElement(By.id("para1")).getText(); //this a text from child window
//		System.out.println(text);

	    //Switching to a desired window by getting the window title since all windids are stored in a random order.
	    while(itr.hasNext())
	    {
	    	String windowid = itr.next(); 
	    	driver.switchTo().window(windowid);
	    	if(driver.getTitle().equals("Basic Web Page Title"))
	    	{
	    	   String text= driver.findElement(By.id("para1")).getText(); 
	    	   System.out.println(text);
	    	}
	    	if(driver.getTitle().contains("Blogger.com"))
	    	{
	    	  boolean button= driver.findElement(By.linkText("CREATE YOUR BLOG")).isEnabled();
	    	  System.out.println(button);
	    	}
	    	
	     }
	    
	   
		
		driver.quit(); 
			
		
		
		
		
		
		
		
	}

}
