package Listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Resources.Base;
import Utilities.Extentreports;

public class listeners extends Base implements ITestListener{

	WebDriver driver =null;
	ExtentReports reports = Extentreports.getExtentReport(); 
	ExtentTest etest;
	ThreadLocal<ExtentTest> extentTestThread = new ThreadLocal<ExtentTest>(); // Making it thread safe 
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		String testname =result.getName();
	    etest= reports.createTest(testname);
	    extentTestThread.set(etest);
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		//String testname =result.getName();
		//etest.log(Status.PASS, testname +" got passed");
		extentTestThread.get().log(Status.PASS,"Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		String testName= result.getName(); //it will get u the name of @Test methods 
		//etest.fail(result.getThrowable());
		extentTestThread.get().fail(result.getThrowable());
		
	    try 
	    {
		  driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} 
	    catch (Exception e) 
	    {
		  e.printStackTrace();
		}
	    try
	    {
	       String screenshotFilePath = takescreenshot(testName,driver);
	       extentTestThread.get().addScreenCaptureFromPath(screenshotFilePath, testName);
		} 
	    catch (IOException e) 
	    {
		  e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
	}
		

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
	}

	@Override
	public void onStart(ITestContext context)
	{
		
	}

	@Override
	public void onFinish(ITestContext context)
	{
		reports.flush();
	}

	
	
	 
	
	
	
	
	
}
