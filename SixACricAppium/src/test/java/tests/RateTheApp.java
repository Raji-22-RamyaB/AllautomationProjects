package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;

public class RateTheApp extends BaseClass{
	@Test(priority=0)
    public void rateApp() throws IOException {
		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='Rate the App']")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5000)"));
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollale(new UiSelector().scrollable(true)).scrollToBeginning(5000)"));
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(50000)"));
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		//driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		String cmd = "adb shell input keyevent 4";
		Runtime.getRuntime().exec(cmd);	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		
		
	}
}
