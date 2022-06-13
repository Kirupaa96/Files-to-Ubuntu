package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Transferfunds {

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
	
	
	public Transferfunds(WebDriver driver)  //constructor 
	{
		PageFactory.initElements(driver,this); 
	}
	
	
	public void doFundTransfer(String fromAcountIndex,int toAccountIndex,String amount,String description) //sendkeys accept only string.
	{
		Select fromAccDD= new Select(fromAcc); //create object of select class 
		fromAccDD.selectByValue(fromAcountIndex); //use this object to call the method selectbyindex and pass the index 2 
		
		Select toAccDD = new Select(toAcc);
		toAccDD.selectByIndex(toAccountIndex);		
		
		amt.sendKeys(amount);
		desc.sendKeys(description);
		continueBtn.click();
	}	
	
}
