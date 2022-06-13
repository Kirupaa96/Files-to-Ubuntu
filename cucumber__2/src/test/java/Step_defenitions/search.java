package Step_defenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {

	@Given("^I visit the website as the guest user$")
	public void I_visit_the_website_as_the_guest_user ()
	{
		System.out.println("=====I visit the website as the guest user=====");
		
	}
	
	@When("^I select the books option from the search dropdown$")
	public void I_select_the_books_option_from_the_search_dropdown()
	{
		System.out.println("=====I select the books option from the search dropdown=====");
	}
	
	@And("^I click on search icon$")
	public void i_click_on_search_icon()
	{
		System.out.println("=====I click on search icon=====");
	}

	@Then("^I should see the page having Amazon Bookstore displayed$")
	public void i_should_see_the_page_having_amazon_bookstore_displayed()
	{
		System.out.println("=====I should see the page having Amazon Bookstore displayed====="); 
	}

	@But("^I should not see other category products$")
	public void i_should_not_see_other_category_products() 
	{
		System.out.println("=====I should not see other category products====="); 
	}

	@When("^I select the Baby option from the search dropdown$")
	public void i_select_the_baby_option_from_the_search_dropdown() 
	{
		System.out.println("=====I select the Baby option from the search dropdown=====");
	}

	@Then("^I should see the page having Countdown deals on baby products displayed$")
	public void i_should_see_the_page_having_countdown_deals_on_baby_products_displayed() 
	{
		System.out.println("=====I should see the page having Countdown deals on baby products displayed=====");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
