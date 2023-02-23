package Fb;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class LightBox {

	public static void main(String[] args)
	{
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://omayo.blogspot.com/p/lightbox.html");
		driver.findElement(By.id("lightbox1")).click();
		driver.findElement(By.cssSelector("span[class$='cursor']")).click();
		//driver.quit();
           
		
		
		
		
		
		
		
	}

}
