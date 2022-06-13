package Class_pack;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng_Listeners {

	
	public void listeners()
	{
		int a=1;
		int b=5;
		int c=10;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    if(a==1)
	    {
	    	Assert.assertTrue(b<c);
	    }
	    else if(a==2)
	    {
	    	Assert.assertTrue(b>c);
	    }
	    else if(a==3)
	    {
	    	throw new SkipException("Test skipped");
	    }
	
	    driver.quit();
	}
	
	
}
