package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	static AndroidDriver driver;
 public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities capablities= new DesiredCapabilities ();
		capablities.setCapability("platformName", "Android");
		capablities.setCapability("platformVersion", "7.0");
		capablities.setCapability("deviceName", "INTEX_AQUA_LIONS_3");
		capablities.setCapability("udid", "FEZLG6I7QSCYN7FA");
		capablities.setCapability("appPackage", "com.android.calculator2");
		capablities.setCapability("appActivity", "com.android.calculator2.Calculator");
		URL url = new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url,capablities);

		//WebElement ele=driver.findElement(By.id("com.xcelcorp.cricdost:id/sing_in_mobile_no"));
		//ele.click();
	}}