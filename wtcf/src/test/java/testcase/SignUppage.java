package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class SignUppage extends BaseClass {

	@Test(priority = 0)
	public void signUpPage() throws InterruptedException {
		WebElement name = driver.findElement(By.id("com.wtcf:id/first_name"));
		name.click();
		Thread.sleep(2000);
		name.sendKeys("Rajeshwari.b");
		Thread.sleep(2000);

		WebElement lastname = driver.findElement(By.id("com.wtcf:id/last_name"));
		lastname.click();
		Thread.sleep(2000);
		lastname.sendKeys("'cool'");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		WebElement dob = driver.findElement(By.id("com.wtcf:id/dob"));
		dob.click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.wtcf:id/confirm_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.wtcf:id/female")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.wtcf:id/all_rounder_radio")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.wtcf:id/img_map")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(4000);

		driver.findElement(By.id("com.wtcf:id/btnLocation")).click();
		Thread.sleep(4000);

		// MobileElement
		// Listitem=(MobileElement)driver.findElement(MobileBy.AndroidUIAutomator("new
		// UiScrollable(new UiSelector()).scrollIntoView(" + "new
		// UiSelector().text(\"\"));"));

		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
		//driver.findElement(MobileBy
			//	.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(100000)"));
     
	    driver.findElement(By.id("com.wtcf:id/state")).click();
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("//*[@text='Goa']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("com.wtcf:id/district")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@text='South Goa']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("com.wtcf:id/city")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@text='Aldona']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("com.wtcf:id/submit")).click();
	    Thread.sleep(2000);
	    
	}

	
		
		
	
}

