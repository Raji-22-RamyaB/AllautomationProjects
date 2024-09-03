package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;

public class About extends BaseClass{
	@Test(priority=0)
	public void about()
	{
	 driver.findElement(By.id("com.xcelcorp.sascfi:id/bottom_nav_about")).click();
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
   @Test(priority=1)
   public void info()
   {
	   driver.findElement(By.xpath("//*[@text='INFO']")).click();
	   
	   
   }
	
   @Test(priority=2)
   public void admins()
   {
	   driver.findElement(By.xpath("//*[@text='ADMINS']")).click();
	   
   }
	
   @Test(priority=3)
   public void aboutUs()
   {
	   driver.findElement(By.xpath("//*[@text='ABOUT US']")).click();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   }
}
