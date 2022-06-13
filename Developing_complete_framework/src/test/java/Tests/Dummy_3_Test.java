package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Resources.Base;

public class Dummy_3_Test extends Base{
public WebDriver driver; //Giving it as global becoz when it fails it should pass the driver to sc code.

	@Test
	public void test3() throws IOException, InterruptedException
	{
		System.out.println("Test three");
		driver = initializedriver();
		driver.get("http://tutorialsninja.com/demo/");
		Thread.sleep(5000);
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void closeapplication()
	{
		driver.close();
	}
}
