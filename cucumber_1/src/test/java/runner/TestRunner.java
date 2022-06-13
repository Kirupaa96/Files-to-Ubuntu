package runner;            // used to merge features with gluecode

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java",glue= {"gluecode"})
//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },monochrome = true) //setting the path and plugin for reports

public class TestRunner {
   
   @AfterClass
  
   public static void writeExtentReport() 
   {
    Reporter.loadXMLConfig(new File("Config/report.xml"));
   } 

	
}
