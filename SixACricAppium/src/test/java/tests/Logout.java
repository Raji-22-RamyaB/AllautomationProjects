package tests;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Logout extends BaseClass {
	
	

	@Test(priority = 0)
	public static void logout(){
	

		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@text='Logout']")).click();
		
		driver.findElement(By.id("com.xcelcorp.sascfi:id/cancel")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		

		
		
}
}