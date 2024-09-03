package saucelabtest;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Xsc {


	public static AndroidDriver<WebElement> driver;

	@Test(priority = 0)
	public static void appiumSetup() throws IOException, InterruptedException {
		DesiredCapabilities caps = DesiredCapabilities.android();
		caps.setCapability("appiumVersion", "1.9.1");
		caps.setCapability("deviceName","Android GoogleAPI Emulator");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("browserName", "");
		caps.setCapability("platformVersion","9.0");
		caps.setCapability("platformName","Android");
		caps.setCapability("app","storage:filename=ae90bdbf-4df4-42f1-94e5-86a81479ec0b");
		 //URL url= new URL("http://127.0.0.1:4723/wd/hub");
		URL url = new URL("https://XSC-TEST-002:e51796b8-7937-4025-8692-1a9f95026451@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		
		driver = new AndroidDriver<WebElement>(url, caps);
		
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("username", "XSC-TEST-002");
		sauceOptions.setCapability("accessKey", "e51796b8-7937-4025-8692-1a9f95026451");
		caps.setCapability("sauce:options", sauceOptions);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
}

}
