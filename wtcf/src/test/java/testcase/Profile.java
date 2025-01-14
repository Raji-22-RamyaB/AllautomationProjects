package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.pagefactory.AndroidBy;


public class Profile extends BaseClass {

	@Test(priority = 0)

	public void homemenu() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("com.wtcf:id/drawer_menu")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 1)
	public void profile() throws InterruptedException {
		driver.findElement(By.id("com.wtcf:id/layoutUser")).click();
		Thread.sleep(2000);



		// driver.navigate().back();
	}

	@Test(priority = 2)
	public void profileEdit() throws InterruptedException, IOException {
		driver.findElement(By.id("com.wtcf:id/edit_button")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("com.wtcf:id/name"));
		ele.click();
		ele.clear();
		Thread.sleep(500);
		ele.sendKeys("Rajeshwari");
		Thread.sleep(2000);
		driver.findElement(By.id("com.wtcf:id/dob")).click();
		driver.findElement(By.id("com.wtcf:id/month_navigation_fragment_toggle")).click();
		Thread.sleep(1000);

		/*
		 * driver.findElement(MobileBy.AndroidUIAutomator(
		 * "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
		 * driver.findElement(MobileBy.AndroidUIAutomator(
		 * "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(100000)"
		 * ));
		 * 
		 * MobileElement listitem = (MobileElement)
		 * driver.findElement(MobileBy.AndroidUIAutomator(
		 * "new UiScrollable(new UiSelector()).scrollIntoView(" +
		 * "new UiSelector().text(\"2000\"));")); listitem.getLocation();
		 * listitem.click();
		 */

		// mail
		driver.findElement(By.id("com.wtcf:id/confirm_button")).click();
		Thread.sleep(2000);
		WebElement mail = driver.findElement(By.id("com.wtcf:id/email"));
		mail.clear();
		mail.click();
		mail.sendKeys("raji@gmail.com");
		driver.navigate().back();
		Thread.sleep(2000);

		// location
		driver.findElement(By.id("com.wtcf:id/img_map")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.wtcf:id/btnLocation")).click();
		Thread.sleep(4000);


		//pincode
		WebElement pin = driver.findElement(By.id("com.wtcf:id/pin_code"));
		pin.click();
		pin.sendKeys("820012");

		// selectState
		driver.findElement(By.id("com.wtcf:id/state")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.wtcf:id/search_input")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.wtcf:id/search_input")).sendKeys("Tamil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Tamil Nadu']")).click();
		Thread.sleep(4000);

		// Selectdistrict
		MobileElement listitem = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
						+ "new UiSelector().text(\"Select, District/City\"));"));
		listitem.getLocation();
		listitem.click();

		//driver.findElement(By.id("com.wtcf:id/district")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.wtcf:id/search_input")).sendKeys("Tiru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Tiruvallur']")).click();
		Thread.sleep(2000);

		MobileElement listitem1 = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
						+ "new UiSelector().text(\"Select, Area/Locality\"));"));
		listitem1.getLocation();
		listitem1.click();

		// SelectCity
		//driver.findElement(By.id("com.wtcf:id/city")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("com.wtcf:id/search_input")).sendKeys("korat");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Korattur']")).click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		// playerType

		MobileElement listitem11 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Player Type*\"));"));
		listitem11.getLocation();
		listitem11.click();
		Thread.sleep(2000);
		WebElement playertype = driver.findElement(By.id("com.wtcf:id/all_rounder_radio"));
		playertype.click();
		Thread.sleep(2000);

		// update
		driver.findElement(By.id("com.wtcf:id/update")).click();
		Thread.sleep(3000);


		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.HOME));
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
     

		/*((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(4000);

	    (AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
        Thread.sleep(3000);

 	    tring cmd = "adb shell input keyevent 4";
	    Runtime.getRuntime().exec(cmd);
		/*(WebElement btn=driver.findElement(By.id("com.wtcf:id/back_button"));
		btn.click();
		Thread.sleep(4500);
		driver.navigate().back();
	    Thread.sleep(3000);

	    driver.navigate().back();
	    Thread.sleep(3000); */

	}

}
