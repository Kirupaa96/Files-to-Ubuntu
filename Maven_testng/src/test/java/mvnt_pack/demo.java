package mvnt_pack;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	
	@Parameters("URL")
	@Test  // testcase 
	
	public void title(String website)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get(website);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    String title= driver.getTitle();
	    System.out.println(title);
	    
	}
	
	/* public void ex() 
	{
		int a=10;
		
		if(a<18)
		{
			throw new SkipException("Age cannot be less than 18");
			
		}
	} */
	
	
	
	
	
}
