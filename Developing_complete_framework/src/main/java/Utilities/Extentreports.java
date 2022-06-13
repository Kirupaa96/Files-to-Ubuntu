package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreports {

static ExtentReports extentReport;
	
	public static ExtentReports getExtentReport()
	{
		String extentReportPath = System.getProperty("user.dir")+"\\ExtentReports\\Report.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("TutorialsNinja Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extentReport = new ExtentReports();
		extentReport.attachReporter(reporter);
		extentReport.setSystemInfo("Operating System","Windows 10");
		extentReport.setSystemInfo("Tested By","Kirupaa shankar");
		
		return extentReport;
	}

	
	
}
