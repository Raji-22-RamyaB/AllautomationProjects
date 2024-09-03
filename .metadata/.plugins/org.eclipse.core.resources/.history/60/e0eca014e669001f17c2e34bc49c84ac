   package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public static AppiumDriver<MobileElement> driver;
	public static Properties properties;
	public static Wait<AppiumDriver<MobileElement>> wait;
	public static String appPackage;

	@BeforeTest
	public void setup() throws IOException {   

		properties = new Properties();
		
		FileInputStream inputStream = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/properties/testconfig2.properties");
		properties.load(inputStream);

		try {

			URL url = new URL(properties.getProperty("url"));
			appPackage = properties.getProperty("appPackage");

			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, properties.getProperty("deviceName"));
			cap.setCapability(MobileCapabilityType.UDID, properties.getProperty("udid"));
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, properties.getProperty("platformName"));
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, properties.getProperty("platformVersion"));

			// cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			// cap.setCapability(MobileCapabilityType.APP, "");
			// cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

			if (properties.getProperty("platformName").equals("Android")) {

				cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, properties.getProperty("appPackage"));
				cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, properties.getProperty("launcherActivity"));
			}else {
				cap.setCapability("app", "location of .app or .ipa file");
			}

			driver = new AppiumDriver<MobileElement>(url, cap);

			System.out.print("Application Started");
		} catch (MalformedURLException e) {	
			e.printStackTrace();
		}

		wait = new FluentWait<AppiumDriver<MobileElement>>( driver) // Fbluent Wait
				.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));

	}

	@AfterTest
	public void tearDown() {
		// driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open
		// navigation drawer\"]")).click();
		// driver.findElement(By.)
		//		driver.quit();
		//		driver.close();
	}

}
