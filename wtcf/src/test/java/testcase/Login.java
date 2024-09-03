package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;

public class Login extends BaseClass{

	@BeforeTest
	public void LoginByPin() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(6000);
		driver.findElement(By.id("com.wtcf:id/edt_mobile")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.wtcf:id/edt_mobile")).sendKeys(properties.getProperty("mobile"));
		Thread.sleep(2000);
		driver.findElement(By.id("com.wtcf:id/rlClickConsumer")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='India (IN)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.wtcf:id/checkbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.wtcf:id/have_pin")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.wtcf:id/txtPinEntry")).click();
		driver.findElement(By.id("com.wtcf:id/txtPinEntry")).sendKeys(properties.getProperty("pin"));
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("com.wtcf:id/submit")).click();
		Thread.sleep(4000);


	}
	@Test(priority=2,enabled=false)
	public void logOutTest() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("com.wtcf:id/layoutUser")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.wtcf:id/log_out_layout")).click();
		Thread.sleep(2000);

	}




}

