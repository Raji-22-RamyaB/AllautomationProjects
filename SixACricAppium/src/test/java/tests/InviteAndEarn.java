package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;

public class InviteAndEarn extends BaseClass {
	@Test(priority = 0)
	public static void inviteAndEarn(){
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();	
	driver.findElement(By.xpath("//*[@text='Invite & Earn']")).click();
    //driver.findElement(By.id("com.xcelcorp.sascfi:id/design_menu_item_text")).click();
    //driver.findElement(By.id("com.xcelcorp.sascfi:id/referralCodeCopy")).click();
    driver.findElement(By.id("com.xcelcorp.sascfi:id/invite_back")).click();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    

	}
	
}
