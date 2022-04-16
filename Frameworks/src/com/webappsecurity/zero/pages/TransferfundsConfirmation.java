package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferfundsConfirmation {

	
	@FindBy(css ="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement confMsgBox;
	
	
	public TransferfundsConfirmation(WebDriver driver) //constructor 
	{
		PageFactory.initElements(driver,this); 
	}
	
	@FindBy(css ="#settingsBox > ul > li:nth-child(3) > a")
	private WebElement username;
	
	@FindBy(id ="logout_link")
	private WebElement logout;
	
// void is used when it returns nothing. since we are returning confMsg use tat datatype instead of void.	
	
	
	public String getConfMsg() // since u r returning string, donot give void.
	{
	  String confMsg= confMsgBox.getText();
	  return confMsg;
	 }
	
	public void logoutFromApp()
	{
		username.click();
		logout.click();
	}
	
	
	
}
        