package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
public WebDriver driver;
public Properties prop;
	
	public WebDriver initializedriver() throws IOException
	{
	  prop =new Properties();
	  String proppath = System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties"; //user.dir just gives you the path of proj
	  FileInputStream fis =new FileInputStream(proppath);
	  prop.load(fis);
	  
	  String browserName =prop.getProperty("browser");
	  if(browserName.equalsIgnoreCase("chrome"))
	  {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
	  }
	  else if(browserName.equalsIgnoreCase("firefox"))
	  {
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
	  }
	  else if(browserName.equalsIgnoreCase("edge"))
	  {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
	  }
	
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  return driver;
	}
	
	public String takescreenshot(String testName,WebDriver driver) throws IOException
	{
	   File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   String destinationFilePath = System.getProperty("user.dir")+"\\screenshots\\"+testName+".png"; //testname shows the name of test which got failed
	   FileUtils.copyFile(SourceFile,new File(destinationFilePath));
	   
	   return destinationFilePath; //inorder to attach into extent reports
	}
	 
	
	
	
}
