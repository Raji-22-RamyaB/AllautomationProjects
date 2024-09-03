package test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class four extends Base {

public WebDriver driver;
	
	@Test
   public void testfour()
   {
	   driver.get("https://the-internet.herokuapp.com/");
	   System.out.println(driver.getTitle()+ "from Opera");
	   
	   
   }
	@BeforeMethod
  public void setup() throws MalformedURLException
  {
		driver=initializeBrowser("opera");	  
  }
	@AfterMethod
  public void teardown() 
  {
	  driver.quit();
  }

	
}
