package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Resources.Base;

public class Dummy_2_Test extends Base{
public WebDriver driver;

    @Test
	public void test2() throws IOException
	{
		System.out.println("Test two");
		driver = initializedriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.close();
	}
	
}
