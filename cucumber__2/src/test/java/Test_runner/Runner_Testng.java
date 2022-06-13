package Test_runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	        features="src/test/java/Features/login.feature", 
	        glue="Step_defenitions"
	       // tags="@Register"
	       
	                       )
public class Runner_Testng extends AbstractTestNGCucumberTests
	{        
	               
	
	
	
}
