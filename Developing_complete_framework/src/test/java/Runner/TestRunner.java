package Runner;

import java.io.File;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin={"html:target/cucumber_html_report.html"},
        features="src/test/java/Features/Login.feature", 
        glue="StepDefenition")

public class TestRunner extends AbstractTestNGCucumberTests
{
	
}
 