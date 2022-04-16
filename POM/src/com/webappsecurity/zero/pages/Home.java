package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
 
	@FindBy(id="transfer_funds_link")
	private WebElement transferfunds;
	
	public Home(WebDriver driver) //constructor 
	{
		PageFactory.initElements(driver,this); 
	}
	
	
	public void clicktransferfunds()
	{
		transferfunds.click();
	}
	
	public boolean isTransferFundsPresent()  // checking if transfer funds link exists.
	{
	  return transferfunds.isDisplayed();    // you are returning either true or false , so do not use void 
	                                         //  and replace it with datatype its returning. 
	}
	
}
