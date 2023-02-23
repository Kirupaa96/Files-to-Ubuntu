	package com.webappsecurity.zero.pages;
	
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
		
		public class A_login {
	
			@FindBy(id="user_login")
			private WebElement uName; // storing the webelement in uName 
			
			@FindBy(id="user_password")
			private WebElement pass;
			
			@FindBy(name="submit")
			private WebElement login;
			
			@FindBy(css="#login_form > div.alert.alert-error") //locator for error msg during invalid login.
			private WebElement errMsgBox; 
			
			public A_login(WebDriver driver) //constructor 
			{
				PageFactory.initElements(driver,this);  // It will locate all the webelements on "this" class to driver.
			}
			
			// what action it has to do will be given in a method. If you want to send any data to this method pass it as parameter.
			
			public void applicationlogin(String loginname, String loginpassword) // loginname,loginpassword are the variables used to store test data.
			{
				uName.sendKeys(loginname);
				pass.sendKeys(loginpassword);
				login.click();
			}	
		   
			public String getErrorMsgText()
			{
			String errorMsgText = errMsgBox.getText();
			return errorMsgText;
			}
					
	}
		