package mvnt_pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations {

	//@BeforeMethod
	@BeforeClass
	public void openapp()
	{
		System.out.println("Opening chrome browser");
	}
	
	@Test(priority=2)
	public void testLogin()
	{
		System.out.println("Inside annotated method - testLogin");
	}		
	
	@Test(priority=3)
	public void testHomePage()
	{
		System.out.println("Testing Home Page functionality");
	}
	
	@Test(priority=1)
	public void testRegistration()
	{
		System.out.println("Testing Registration functionality");
	}
	
	//@AfterMethod
	@AfterClass
	public void closapp()
	{
		System.out.println("Closing the browser");
	}
	
	
	
	
}
