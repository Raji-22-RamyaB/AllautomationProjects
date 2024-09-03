package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class AppStatistics extends BaseClass{
 @Test(priority=0)
 public void appStatistics()
 {
	driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS); 
		
		//driver.findElement(By.id("com.xcelcorp.sascfi:id/design_menu_item_text")).click();
		driver.findElement(By.xpath("//*[@text='App Statistics']")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
	/*	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5000)"));
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);*/
		
	/*	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)."
                + "resourceId(\"<com.xcelcorp.sascfi:id/txt_team>\"))"
                + ".setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\"<TN SASC>\"))"));*/
		
		
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollHorozontal().scrollRight()"));
		
		/*driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.xcelcorp.sascfi:id/txt_team\"))"
                + ".scrollIntoView(new UiSelector().text(\"TN SASC\")"
                + ".instance(0));"));*/
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
 }
}
