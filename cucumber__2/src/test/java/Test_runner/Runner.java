package Test_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)    //it will run cucumber feature files 
@CucumberOptions(
		         
		//plugin={"html:target/cucumber_html_report.html","pretty"}, //to create a html report //pretty to beautify console o/p
		features="src/test/java/Features/login.feature", //path of feature files, you can also run a single feature file,eg /search.feature
        glue="Step_defenitions",
        //tags="@Ninja"        //runs only scenarios named as @Smoke_test
        monochrome=true     // removes unwanted symbols in console window.  
               )





public class Runner {

	
	
}
