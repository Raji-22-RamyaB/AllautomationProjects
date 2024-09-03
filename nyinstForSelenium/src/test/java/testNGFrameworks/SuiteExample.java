package testNGFrameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample{
WebDriver driver;
Long startTime;
Long endTime;



 @BeforeSuite
 public void launchBrowser()
 { 
	 System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	  startTime=System.currentTimeMillis();
	 
 }
	
	
   


@Test 
   public void OpenChrome()
   {
	driver.get("https://www.google.co.in/");
   }
   @Test
   public void OpenBing()
   {
	   driver.get("https://www.bing.com/");
   }
	@Test 
	public void OpenYahoo()
	{
		driver.get("https://in.search.yahoo.com/");
	}
	

@AfterSuite
public void closeBrowser()
{
	//driver.quit();
	endTime=System.currentTimeMillis();
	 Long totalTime=endTime-startTime;
	System.out.println("total time taken"+totalTime);
	
	

}

}










