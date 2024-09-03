package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class HomeMenu extends BaseClass{
	@Test(priority=0)
	public void home() throws InterruptedException
	{
		driver.findElement(By.id("com.wtcf:id/drawer_menu")).click();
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void MyTeam() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@text='My Team']")).click();
		Thread.sleep(2000);


		MobileElement listitem1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"\"));"));
		listitem1.getLocation();
		listitem1.click();                           
		Thread.sleep(2000);
        
		
		driver.navigate().back();
		Thread.sleep(2000);
		//driver.findElement(By.id("wtcf:id/back_button")).click();
		Thread.sleep(2000);
	}
} 