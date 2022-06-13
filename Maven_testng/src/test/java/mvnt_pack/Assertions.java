package mvnt_pack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	@Test
	public void method1()
	{
		
		Assert.assertEquals("Kirupaa", "Kirupaa"); 
		
		int a=5;
		int b=10;
		
		Assert.assertTrue(b>a);
		Assert.assertNotEquals("hi","bye");
		Assert.assertFalse(b<a);
		//Assert.fail();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
