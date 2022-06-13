package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class C_transferfunds {

	@FindBy(id="tf_fromAccountId")
	private WebElement fromAcc;
	
	
	@FindBy(id="tf_toAccountId")
	private WebElement toAcc;
	
	@FindBy(id="tf_amount")
	private WebElement amt;
	
	@FindBy(id="tf_description")
	private WebElement desc;
	
	@FindBy(id="btn_submit")
	private WebElement continueBtn;
	
	
	public C_transferfunds(WebDriver driver)  //constructor 
	{
		PageFactory.initElements(driver,this); 
	}
	
	
	public void doFundTransfer(String amount, String description) //sendkeys accept only string.
	{
		Select fromAccDD= new Select(fromAcc); //create object of select class 
		fromAccDD.selectByIndex(2); //use this object to call the method selectbyindex and pass the index 2 
		
		Select toAccDD = new Select(toAcc);
		toAccDD.selectByIndex(3);		
		
		amt.sendKeys(amount);
		desc.sendKeys(description);
		continueBtn.click();
	}	
}
