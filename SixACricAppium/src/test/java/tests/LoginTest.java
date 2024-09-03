package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;

public class LoginTest extends BaseClass{
	
	@BeforeTest//@Test
	public void LoginByPin() {
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[@text='SIGN IN MOBILE NUMBER']")).click();//signin
		
		
		driver.findElement(By.id(appPackage+":id/edt_mobile")).sendKeys(properties.getProperty("mobile"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(appPackage+":id/edt_mobile"))).sendKeys("9931778331");
		driver.findElement(By.id(appPackage+":id/imageView_arrow")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
		
		driver.findElement(By.id(appPackage+":id/have_pin")).click();
		driver.findElement(By.id(appPackage+":id/txt_pin_entry")).sendKeys(properties.getProperty("pin"));
		driver.findElement(By.id(appPackage+":id/submit")).click();
		driver.findElement(By.id(appPackage+":id/skip")).click();
	    driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}
	
	@Test(priority = 1)
	public void logOutTest() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Logout']")));
        driver.findElement(By.xpath("//*[@text='Logout']")).click();
        driver.findElement(By.xpath("//*[@text='LOGOUT']")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}
	
	@Test(priority = 2)
	public void logInWithOtp() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[@text='SIGN IN MOBILE NUMBER']")).click();//signin
		
		driver.findElement(By.id(appPackage+":id/edt_mobile")).sendKeys(properties.getProperty("mobile"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(appPackage+":id/edt_mobile"))).sendKeys("9931778331");
		driver.findElement(By.id(appPackage+":id/imageView_arrow")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
		
		driver.findElement(By.id(appPackage+":id/submit")).click();
		driver.findElement(By.id(appPackage+":id/otp_input")).sendKeys(properties.getProperty("otp"));
		driver.findElement(By.id(appPackage+":id/submit")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id(appPackage+":id/skip")).click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
	
	
	
}
