package Fb;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownbox_ex {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
	//	driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
// Dropdown menu will have select tag on chrome dev tool, only then u can use select commands.	
		
// To select from a drop down menu	
		
		
	WebElement monthdropdown = driver.findElement(By.id("month")); // since u r finding a webelement on the page,store in that variable 
	Select dd =new Select(monthdropdown); // select is a class,dd is the object 
	dd.selectByVisibleText("May"); // selectByVisibleText is a method 
	
 /* you can select the month using Index. The value of index starts from 0, just call the index of that month 
	
	       dd.selectByIndex(11);
	
     you can select the month by its value. On chrome dev tool ,click on black triangle button to know the value 
	
	      dd.selectByValue("8"); */	
	
	
	// getoptions()method is used to get all the menus from the drop down 
	
	WebElement yeardd= driver.findElement(By.name("birthday_year"));
	
	Select ydd = new Select(yeardd);
	List <WebElement> options= ydd.getOptions();
	
	for (WebElement totalyrs : options)
	{
		System.out.println(totalyrs);
	}
	
	
	
	
	
	
	
	
			
	}
}
