package Extent_reports;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Class_1 {
	
WebDriver driver; 
ExtentReports extent;

    @BeforeMethod
    public void openapp()    // code for Extent reports
    {
    	String reportsfile = System.getProperty("user.dir")+"\\Extent Reports\\index.html"; //you are creating a new folder extent reports and saving
    	                                                                                  // reports into index.html file //user.dir is a dynamic path
    	ExtentSparkReporter reporter =new ExtentSparkReporter(reportsfile);
    	reporter.config().setReportName("Omayo Test Results");
    	reporter.config().setDocumentTitle("Class_1 Test Results");
        extent = new ExtentReports();
    	extent.attachReporter(reporter);
    	extent.setSystemInfo("Operating System","Windows 10");
    	extent.setSystemInfo("Tested By","Kirupaa shankar");
    }



	@Test
	public void demo()
	{
		
		ExtentTest etest = extent.createTest("Test one"); //starting of the reports
		
        WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		etest.info("Chrome browser launched"); // These are just logs
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		etest.info("Home page launched"); // These are just logs
		
		String actual= driver.findElement(By.id("pah")).getText();
		String expected="PracticeAutomationHere123";
		
		etest.fail("Test one failed"); // Usually this will be written in listeners class
		Assert.assertEquals(actual,expected);
		
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
		extent.flush(); // you are flushing all into reports and closing it
	}
}
