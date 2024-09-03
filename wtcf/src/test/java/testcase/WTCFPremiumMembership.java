package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;

public class WTCFPremiumMembership extends BaseClass {

	@Test(priority = 0)

	public void homemenu() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("com.wtcf:id/drawer_menu")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='Premium Membership']")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 1)
	public void Register() throws InterruptedException {
		driver.findElement(By.xpath("//*[@text='REGISTER NOW']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.wtcf:id/check_box")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='REGISTER']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.wtcf:id/wallet_radio")).click();
		Thread.sleep(2000);

		WebElement mail = driver.findElement(By.id("com.wtcf:id/email_input"));
		mail.clear();
		Thread.sleep(2000);
		mail.sendKeys("raji@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.wtcf:id/submit")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("com.wtcf:id/submit")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@text='Ola Money (Postpaid + Wallet)']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@text='Pay Now']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@text='Success']")).click();
		Thread.sleep(2000);
		
		
		
		 
		
		
		
		

	}
}