package Data_properties;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class data {

	public static void main(String[] args) throws IOException  {
		
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("data.properties");
		prop.load(fis);
		
		FileOutputStream fos=new FileOutputStream("data.properties");
		prop.setProperty("result","Logged in");
		prop.store(fos, "no comments");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		
	}
	
	
}
