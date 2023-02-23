package Fb;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frames {
public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	
	driver.switchTo().frame("classFrame"); // goes inside the frame called as class frame.
	driver.findElement(By.linkText("INDEX")).click(); // then it clicks on the index link.
	
	driver.switchTo().defaultContent(); //comes out of the class frame to a default location. 
	
	driver.switchTo().frame("packageFrame"); // goes inside package frame.
	driver.findElement(By.linkText("Actions")).click(); //then it clicks on actions link  
	
	
}
}
