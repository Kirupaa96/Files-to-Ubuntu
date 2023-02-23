import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

public static void main(String[] args) {
		
	Logger Log = LogManager.getLogger(New.class.getName());
	    
		
	Log.debug("Test Execution Started"); //general logs 
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	Log.debug("Chrome Browser got launched");	
		driver.get("http://omayo.blogspot.com/");
	Log.debug("Omayo Application got opened");	
		driver.manage().window().maximize();
	Log.debug("Browser got maximized");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("compendiumdev")).click();
	Log.debug("Compendiumdev link got clicked");	
		driver.navigate().back();
	Log.debug("Browser navigated back to Omayo website");
		driver.navigate().forward();
	Log.debug("Browser navigated forward to Compendiumdev page");
		
		if(driver.getTitle().equals("Basic Web Page Title")) 
		{
	Log.info("Success: We are in correct page"); //success logs
		} 
		else
		{
	Log.error("Error: We are in wrong page"); // error logs
		}
		
		driver.close();
	Log.debug("End of Test execution");
	
	}

}
