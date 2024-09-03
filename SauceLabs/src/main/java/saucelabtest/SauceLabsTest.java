package saucelabtest;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;


public class SauceLabsTest {
	
	public WebDriver driver= null;
	
	public static final String USERNAME ="XSC-TEST-002";
	public static final String ACCESS_KEY="e51796b8-7937-4025-8692-1a9f95026451";
	public static final String URL ="https://" + USERNAME +  ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	
	@BeforeClass
	@org.testng.annotations.Parameters({ "browser", "version", "platform" })
    public void setup(String br, String vr, String pf)throws MalformedURLException
    {
     DesiredCapabilities capabilities=new DesiredCapabilities();
     capabilities.setCapability("browserName", br);
     capabilities.setCapability("version", vr);
     capabilities.setCapability("platform", pf);
     driver=new RemoteWebDriver(new java.net.URL(URL),capabilities);
       
    }
	@Test
	public void verifyLogin() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        
        
	} 
     @AfterClass
     public void tearDown() {
    	 driver.quit();
        	
	}
	
	
	
}
