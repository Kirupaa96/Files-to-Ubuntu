package Class_pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_1 {

	@Test
	@Parameters("URL")
	public void test_1(String website)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get(website);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    String title= driver.getTitle();
	    System.out.println(title);
	}
	
	@Test
	public void test_2()
	{
		System.out.println("Test_2 of class_1 got executed");
	}
	
	@Test(groups= {"smoke"})
	public void test_3()
	{
		System.out.println("Test_3 of class_1 got executed");
	}
	
	
	
	
	
	
	
}
   