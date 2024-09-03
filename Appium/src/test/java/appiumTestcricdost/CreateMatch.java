package appiumTestcricdost;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Test;

//import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;

public class CreateMatch{  
	
	public static AndroidDriver driver; 
	
	public static void main(String[] args){
		try {
		openCricdost();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
			
		}
	}
	
    public static void openCricdost () throws MalformedURLException {
    	
     DesiredCapabilities cap= new DesiredCapabilities();
     cap.setCapability("deviceName","Z60");
     cap.setCapability("udid","Z60E418AA091798");
     cap.setCapability("platformName","Android");
     cap.setCapability("platformVersion","7.0");
     
     cap.setCapability("appPackage","com.xcelcorp.cricdost");
     cap.setCapability("appActivity","com.xcelcorp.cd.splash.SplashActivity");
     
     URL url= new URL("http://127.0.0.1:4723/wd/hub");
     driver = new AndroidDriver(url, cap);
     System.out.println("application started...");
    }
    
}

