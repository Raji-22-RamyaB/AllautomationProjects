package test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class one extends Base {
public WebDriver driver;
	
	@Test
   public void testone()
   {
	   driver.get("https://the-internet.herokuapp.com/");
	   System.out.println(driver.getTitle()+ "from Chrome");
	   
	   
   }
	@BeforeMethod
  public void setup() throws MalformedURLException
  {
		driver=initializeBrowser("chrome");	  
  }
	@AfterMethod
  public void teardown() 
  {
	  driver.quit();
  }
}
