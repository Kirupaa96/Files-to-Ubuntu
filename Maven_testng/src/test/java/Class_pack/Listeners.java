package Class_pack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners  implements ITestListener{

	public void onTestStart(ITestResult result) 
	{
		
		System.out.println("Test execution started for Test: "+result.getName()); // will print the name of the method its listening 
	}
	
public void onFinish(ITestContext context)
    {
		
		System.out.println("Test execution finished");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test execution successful");
	}
	
	public void onTestFailure(ITestResult result)
	{
		//take screenshot code
		//updating failure status code into the test reports
		//updating logs
		System.out.println("Test execution failed");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test execution got skipped");
	}
}
