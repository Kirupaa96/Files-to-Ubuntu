package Demo; 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiple_validaations {
WebDriver driver;

@BeforeTest
@Parameters("browser")
	
	public void openapplication(String browser)
	{
	if (browser.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","chromedriver"); 
	driver = new ChromeDriver(); 
	}
	else if(browser.equals("Edge"))
	{
		System.setProperty("webdriver.edge.driver","msedgedriver.exe"); 
		driver = new EdgeDriver(); 	
	}
	 else if(browser.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver","geckodriver.exe"); 
		driver = new FirefoxDriver(); 	
	} 
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.monsterindia.com/");
	driver.navigate().refresh();
	}
	


@Test(priority =0)
 
   public void verifypagetitle()
   {
	String Actualtitle = driver.getTitle();
	String Expectedtitle = "Monster India - Jobs - Recruitment - Job Search - Job Vacancies - Aug 2022";
	Assert.assertEquals(Actualtitle, Expectedtitle);
   }

@Test(priority =1)
 
    public void verifyText()
    {
      String Actualtext = driver.findElement(By.cssSelector("#user-signup-actions > div:nth-child(1) > div.engage.w100.fl.tc.engage-desktop > h2")).getText();
      String Expectedtext = "NEW TO MONSTER?";
      Assert.assertEquals(Actualtext,Expectedtext);
    }

@Test(priority =2)// ,enabled = false) //this will skip the validation
      
     public void verifylogin()
     {
	   
	   boolean loginbutton = driver.findElement(By.xpath("(//li[contains(@id,'seekerLoginBtn')])[2]")).isDisplayed();
	   Assert.assertTrue(loginbutton);                         
     }

@Test(priority =3)
 
     public void verifysearchbutton()
     {
	  boolean searchbtn = driver.findElement(By.cssSelector("#searchForm > div > div.col-xl-2.col-lg-3.col-sm-2.col-xxs-12.fl.no-padding > input")).isEnabled();
	  Assert.assertTrue(searchbtn);
     }


@AfterTest

       public void closeapp()
       {
        driver.quit();
        }	
}
