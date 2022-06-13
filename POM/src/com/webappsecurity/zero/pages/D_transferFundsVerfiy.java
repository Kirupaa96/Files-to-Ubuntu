package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class D_transferFundsVerfiy {
	
	
	@FindBy(id="btn_submit")
	private WebElement submitBtn;
	
	public D_transferFundsVerfiy(WebDriver driver) //constructor 
	{
		PageFactory.initElements(driver,this); 
	}
	
	
	public void clickSubmit()
	{
		submitBtn.click();
	}
	
}
