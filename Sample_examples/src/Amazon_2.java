                                         // Testing Invalid login of amazon
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_2 {
	public static void main(String[] args) {
		
       
        WebDriver object1 =new ChromeDriver(); 
		object1.get("https://www.amazon.ca/");
		
		object1.findElement(By.id("nav-link-accountList-nav-line-1")).click();// findinf hello sign in and click on it
		object1.findElement(By.id("ap_email")).sendKeys("abjbfkda@gmail.com");// giving the email address 
	    object1.findElement(By.id("continue")).click(); // clicking on continue 
	    
	    String Actual_Error_msg = object1.findElement(By.cssSelector("#auth-error-message-box > div > h4")).getText();
	    String Expected_Error_msg = "There was a problem";
	    
	    if(Actual_Error_msg.equals(Expected_Error_msg))
		{
		 System.out.println("Test case is passed");	
		}
		else 
		{
		 System.out.println("Test case failed");
		}
	    object1.quit();
}
}
//    driver.findElement(By.xpath("(//button[contains(@data-test-id,'select-link')])[1])).getText();     ===== xpath

//    driver.findElement(By.linkText("Forgot Password?")).click();         ===== linkText

//    driver.findElement(By.partiallinkText("Forgot")).click();     ======= Partial link text

//    driver.findElements(By.tagName("a"));   =====  tag name

//    driver.findElements(By.className("_422_jsn_lknqf"));   ======= class name


          