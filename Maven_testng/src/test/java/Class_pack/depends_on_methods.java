package Class_pack;

import org.testng.annotations.Test;

public class depends_on_methods {

	@Test
	public void flipkart() 
	{
		System.out.println("Flipkart");
	}
	
	@Test(dependsOnMethods= {"flipkart","walmart"})
	public void amazon()
	{
		System.out.println("Amazon");
    }
	
	@Test//(enabled=false)
	public void macys() 
	{
		System.out.println("Macys");
    }
	
	@Test (timeOut=5000)
	public void walmart() throws InterruptedException 
	{
		Thread.sleep(4000);
		System.out.println("Walmart");
	}
}
