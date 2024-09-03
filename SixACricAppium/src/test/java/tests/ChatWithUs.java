package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;

public class ChatWithUs extends BaseClass {
	@Test(priority=0)
	public void chatwithus() throws IOException
	{
		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.id("com.xcelcorp.sascfi:id/design_menu_item_text")).click();
		driver.findElement(By.xpath("//*[@text='Chat with us']")).click();
		//driver.findElement(By.id("action-button")).click();
		
		driver.findElement(By.xpath("//*[@text='CONTINUE TO CHAT']"));
		//driver.navigate().back();
	    String cmd = "adb shell input keyevent 4";
		Runtime.getRuntime().exec(cmd);	  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}

}
