package tests;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Settings extends BaseClass {
	

	@Test(priority = 0)
	public static void appiumSetup(){
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		/*DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Z60");
		dc.setCapability("udId", "Z60E418AA091798");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "7.0");
		dc.setCapability("appPackage", "com.xcelcorp.cricdost");
		dc.setCapability("appActivity", "com.xcelcorp.cd.splash.SplashActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);

		String appPackage = "com.xcelcorp.cricdost";
		driver.findElement(By.id(appPackage + ":id/skip")).click();
		driver.manage().timeouts().implicitlyWait(75, TimeUnit.SECONDS);*/
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@text='Settings']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.id(appPackage + ":id/privacy")).click();

		driver.findElement(By.id(appPackage + ":id/switch_profile_visibility")).click();
		driver.findElement(By.id(appPackage + ":id/positive_button")).click();
		driver.findElement(By.id(appPackage + ":id/switch_dp_visibility")).click();
		WebElement ele = driver.findElement(By.id(appPackage + ":id/positive_button"));
		ele.click();
		driver.findElement(By.id(appPackage + ":id/switch_allow_call")).click();
		WebElement ele1 = driver.findElement(By.id(appPackage + ":id/positive_button"));
		ele1.click();
		driver.findElement(By.id(appPackage + ":id/img_back")).click();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);


	}

	@Test(priority = 1)
	public void profile() {
		//String appPackage = "com.xcelcorp.cricdost";
		driver.findElement(By.id(appPackage + ":id/profile")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		  driver.findElement(By.xpath("//*[@text='EDIT']")).click();
		  
		  driver.findElement(By.id(appPackage+":id/edt_text")).sendKeys("raji");
		  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  
		  //driver.findElement(By.id(appPackage+":id/txt_text")).sendKeys("Mar 7,2022");
		  
		 /*  driver.findElement(MobileBy.
		  xpath("//android.widget.LinearLayout[@content-desc=\"Kaycee, WY 82639, USA\"]/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.TextView"
		  )).click();*/
		  
	/*	 // driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_text")).click();
		   driver.findElement(By.xpath("//*[@text='chennai']")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.id( "com.android.packageinstaller:id/permission_allow_button")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		 //driver.findElement(By.id("com.xcelcorp.cricdost:id/atv_places")).click();
		 //driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		  driver.findElement(By.id("com.xcelcorp.cricdost:id/atv_places")).sendKeys("chennai");
		  driver.findElement(By.id("com.xcelcorp.cricdost:id/locationInfo")).click();
		  
		/*  driver.findElement(By.id("com.xcelcorp.cricdost:id/btnLocation")).click();
		  driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);*/  
		  
		  driver.findElement(By.id("com.xcelcorp.sascfi:id/spn_gender")).click();
		  driver.findElement(By.xpath("//*[@text='Female']")).click();
		  
		  driver.findElement(By.id("com.xcelcorp.sascfi:id/spn_skills")).click();
		  driver.findElement(By.xpath("//*[@text='Bowler']")).click();
		  
		  driver.findElement(By.id(appPackage+":id/btn_submit")).click();
		  //driver.findElement(By.id("com.xcelcorp.cricdost:id/img_back")).click();
		  driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		  driver.navigate().back();
		  
		  /*driver.findElement(By.id(appPackage+":id/markerImg")).click();
		 driver.manage().timeouts().implicitlyWait(50 , TimeUnit.SECONDS);
		 WebDriverWait wait = new WebDriverWait(driver,25);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id(appPackage+
		  ":id/btnLocation"))).click(); MobileElement element = (MobileElement)
		  driver.findElement(By.id(appPackage+":id/btnLocation"));
		  
		  element.click();
		 
		
		  driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		  
		 
		  driver.findElement(By.id(appPackage+":id/spn_gender")).click(); Select
		ele=new Select(driver.findElement(By.id(appPackage+":id/spn_gender"))); //
		  ele.selectByIndex(2); driver.manage().timeouts().implicitlyWait(25,
		 TimeUnit.SECONDS); ele.selectByIndex(2);
		 
		
		  driver.findElement(By.id(appPackage+":id/spn_skills")).click(); Select
		  ele1=new Select(driver.findElement(By.id(appPackage+":id/spn_skills")));
		  ele1.selectByIndex(1); driver.manage().timeouts().implicitlyWait(25,
		  TimeUnit.SECONDS);
		  
		 
		 driver.findElement(By.id(appPackage+":id/btn_submit")).click();
		 driver.findElement(By.id(appPackage+":id/btn_cancel")).click();*/
		  
		 }

	

	@Test(priority = 2)
	public void viewfullcareer() {
		 driver.findElement(By.id("com.xcelcorp.sascfi:id/txt_title")).click();
		//driver.findElement(By.id("com.xcelcorp.sascfi:id/img_details")).click();
		
		//driver.findElement(By.xpath("//*[@text='GENERAL MATCH']")).click();
		
		//driver.findElement(By.xpath("//*[@text='TOTAL']")).click();
		driver.navigate().back();
	}

	@Test(priority = 3)
	public void playerinsight() {
		driver.findElement(By.xpath("//*[@text='Player Insight']")).click();
		driver.findElement(By.id("com.xcelcorp.sascfi:id/batting_insight")).click();
		driver.findElement(By.id("com.xcelcorp.sascfi:id/bowling_insight")).click();
		driver.navigate().back();

	}

	@Test(priority = 4)
	public void mymatches() {
		driver.findElement(By.xpath("//*[@text='My Matches']")).click();
		driver.findElement(By.xpath("//*[@text='LIVE']")).click();
		driver.findElement(By.xpath("//*[@text='UPCOMING']")).click();
		driver.findElement(By.xpath("//*[@text='RECENT']")).click();
		driver.findElement(By.xpath("//*[@text='ALL']")).click();
		driver.navigate().back();

	}

	@Test(priority = 5)
	public void mytournament() {
		driver.findElement(By.xpath("//*[@text='My Tournament']")).click();
		driver.findElement(By.xpath("//*[@text='LIVE']")).click();
		driver.findElement(By.xpath("//*[@text='UPCOMING']")).click();
		driver.findElement(By.xpath("//*[@text='RECENT']")).click();
		driver.findElement(By.xpath("//*[@text='ALL']")).click();
		driver.navigate().back();

	}

	@Test(priority = 6)
	public void myteams() {
		driver.findElement(By.xpath("//*[@text='My Teams']")).click();
		
		/*driver.findElement(By.xpath("//*[@text='champs team']")).click();
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_player")).click();
		driver.findElement(By.xpath("//*[@text='MY TEAMS']")).click();
		driver.findElement(By.xpath("//*[@text='raji']")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		driver.navigate().back();
		driver.navigate().back();*/
		driver.navigate().back();

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}
	/*
	 * @Test(priority=7) public void scroll() { Actions act=new Actions(driver);
	 * act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	 * driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); }
	 */

	/*@Test(priority = 8)
	public void mywallet() {

		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"My Wallet\"));"));
		listitem.getLocation();
		listitem.click();
		// driver.findElement(By.xpath("//*[@text='My Wallet']")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='Add Money']")).click();
		driver.findElement(By.id("com.xcelcorp.sascfi:id/amount_input")).click();
		driver.findElement(By.id("com.xcelcorp.sascfi:id/amount_input")).sendKeys("100");
		driver.findElement(By.id("com.xcelcorp.sascfi:id/add_mny")).click();
		driver.findElement(By.id("com.xcelcorp.sascfi:id/radio_upi")).click();
		// driver.findElement(By.id("com.xcelcorp.cricdost:id/email_input")).click();

		// driver.findElement(By.id("com.xcelcorp.cricdost:id/email_input")).sendKeys("raji");
		// driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		// driver.findElement(By.id("com.xcelcorp.cricdost:id/email_input")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		// driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.id("com.xcelcorp.sascfi:id/cancel_action")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();

		// driver.findElement(By.id("com.xcelcorp.cricdost:id/submit")).click();
		// driver.findElement(By.id("com.xcelcorp.cricdost:id/okbtn")).click();
		// driver.navigate().back();
		// driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}*/

	@Test(priority=9)
	public void mytimeline() 
	
	{	
		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"My Timeline\"));"));
		listitem.getLocation();
		listitem.click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.id("com.xcelcorp.sascfi:id/spinner")).click();
		
		driver.findElement(By.xpath("//*[@text='CD Match']")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		/*By _driver = null;
		Select one = new Select((WebElement) _driver.findElements((SearchContext) By.xpath(".//*[@text='CD Match']")));
		one.selectByIndex(1);
		driver.findElement(By.xpath(".//*[@text='CD Match']")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
         driver.findElement(By.id("com.xcelcorp.cricdost:id/filter_icon")).click();
		driver.findElement(By.id("//*[@text='Filter by date'")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/cancel")).click();
		driver.navigate().back();
		*/
	
	}

	@Test(priority = 10)
	public void myrequests() {

		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"My Requests\"));"));
		listitem.getLocation();
		listitem.click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[@text='My Requests']")).click();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		driver.findElement(By.id("com.xcelcorp.sascfi:id/img_back")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);		// driver.navigate().back();

	}

	/*@Test(priority = 11)
	public void pushnotification() {
		driver.findElement(By.id("com.xcelcorp.sascfi:id/switch_notifications")).click();
		driver.findElement(By.id("com.xcelcorp.sascfi:id/positive_button")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	@Test(priority = 12)
	public void mobileno() {
		driver.findElement(By.id("com.xcelcorp.sascfi:id/change_mobile")).click();
		//driver.findElement(By.id("com.xcelcorp.cricdost:id/change_mobile")).sendKeys("8825569993");
		driver.findElement(By.id("com.xcelcorp.sascfi:id/cancel")).click();
		
	}*/
	
	@Test(priority=13)
	public void changepin()
	{
	driver.findElement(By.id("com.xcelcorp.sascfi:id/change_pin")).click();
	driver.findElement(By.id("com.xcelcorp.sascfi:id/old_pin_entry")).click();
	driver.findElement(By.id("com.xcelcorp.sascfi:id/old_pin_entry")).sendKeys("1111");
	driver.findElement(By.id("com.xcelcorp.sascfi:id/new_pin_entry")).click();
	driver.findElement(By.id("com.xcelcorp.sascfi:id/new_pin_entry")).sendKeys("0909");
	//driver.findElement(By.id("com.xcelcorp.cricdost:id/new_pin_entry")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
	driver.findElement(By.id("com.xcelcorp.sascfi:id/cancel")).click();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	driver.findElement(By.id("com.xcelcorp.sascfi:id/img_back")).click();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}
	
	/*@Test(priority=14)
	public void signout()
	{
	driver.findElement(By.id("com.xcelcorp.sascfi:id/sign_out")).click();
	driver.findElement(By.id("com.xcelcorp.sascfi:id/cancel")).click();
	driver.findElement(By.id("com.xcelcorp.sascfi:id/img_back")).click();
	
	}*/
	


}