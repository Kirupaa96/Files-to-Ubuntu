package Fb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCalendar {
		
public static void main(String[] args) throws InterruptedException 
          {
		    //WebDriverManager.chromedriver().setup();
	        WebDriver driver =new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.manage().window().maximize();
			driver.get("https://www.path2usa.com/travel-companions");
			
			
			driver.findElement(By.id("travel_date")).click();
			while(!driver.findElement(By.className("datepicker-switch")).getText().contains("December"))
			{
			  driver.findElement(By.className("next")).click();
			}
			
			List<WebElement> days = driver.findElements(By.xpath("//td[@class='active day' or @class='day']"));
			for(int i=0;i<days.size();i++) 
			{
	           if(days.get(i).getText().equals("15")) 
	             {
					days.get(i).click();
					break;
				}
			}
		   }
        }


