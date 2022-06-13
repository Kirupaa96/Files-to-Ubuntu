package Step_defenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class software_tester {

	
	 @Given("^I am a \"([a-zA-Z]{1,})\" software tester$")   // accepts oly alphabets
	 public void method1(String tester_type) 
 	   {
		  System.out.println("Am a "+tester_type+" software tester");
	   }

	 @When("^I go to work$")
	 public void method2() 
	    {
		   System.out.println("I go to work");
	    }

	 @And("^I \"(.*)\" with it$")   // it will accept anything
	 public void method3(String work_type) 
	    {
		  System.out.println("I "+work_type+" with it");
	    }
	
	 @Then("^My boss \"([^\"]*)\" me$")  // it will accept alp,nos,symbols
	 public void my_boss_ignores_me(String boss_rxn) 
	    {
		  System.out.println("My boss "+boss_rxn+ " me");
	    }
	
	
	
	
	
}
