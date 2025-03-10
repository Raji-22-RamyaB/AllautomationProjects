package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class NctRegistration extends BaseClass{
	@Test(priority=0)
	public void Nct() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@text='WTCF National Champions Trophy 2023']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@text='REGISTER NOW']")).click();
		Thread.sleep(2000);

	}
	@Test(priority=1)
	public void registration() throws InterruptedException
	{
		WebElement name=driver.findElement(By.id("com.wtcf:id/team_name"));
		name.click();
		Thread.sleep(2000);
		name.sendKeys("SWAN");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("com.wtcf:id/img_map")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.wtcf:id/btnLocation")).click();
		Thread.sleep(2000);

		//select state
		driver.findElement(By.id("com.wtcf:id/state")).click();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("com.wtcf:id/search_input"));
		search.click();
		search.sendKeys("tamil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Tamil Nadu']")).click();
		Thread.sleep(2000);
		
		/*driver.findElement(MobileBy.AndroidUIAutomator
				("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(500000))"));*/

		//district
		driver.findElement(By.id("com.wtcf:id/district")).click();
		Thread.sleep(3000);
		WebElement city=driver.findElement(By.id("com.wtcf:id/search_input"));
		city.click();
		Thread.sleep(2000);
		city.sendKeys("tiruval");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Tiruvallur']")).click();
		Thread.sleep(2500);

		//area
		driver.findElement(By.xpath("//*[@text='Select, Area/Locality *']")).click();
		Thread.sleep(3000);
		WebElement area=driver.findElement(By.id("com.wtcf:id/search_input"));
		area.click();
		Thread.sleep(2000);
		area.sendKeys("ambatt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Ambattur']")).click();
		Thread.sleep(2000);

		//continue button
		driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
		Thread.sleep(2000);

	}
	@Test(priority=2)
	public void addNewMembers() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@text='Add members']")).click();
		Thread.sleep(2000);

		//number
		WebElement number=driver.findElement(By.id("com.wtcf:id/contact_number"));
		number.click();
		Thread.sleep(2000);
		number.sendKeys("9854632130");
		Thread.sleep(2000);

		//name
		WebElement name=driver.findElement(By.xpath("//*[@text='Player Name*']"));
		name.click();
		Thread.sleep(2000);
		name.sendKeys("Raju");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		//dob
		driver.findElement(By.xpath("//*[@text='D.O.B*']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.wtcf:id/confirm_button")).click();
		Thread.sleep(2000);

		//jerseysize
		driver.findElement(By.xpath("//*[@text='L']")).click();
		Thread.sleep(2000);

		//jersey no
		driver.findElement(By.id("com.wtcf:id/jersey_number")).click();
		Thread.sleep(3000);

		//pick jersey number
		driver.findElement(By.xpath("//*[@text='17']")).click();
		Thread.sleep(2000);

		//continue
		driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
		Thread.sleep(2000);

		//jersey name

		MobileElement listitem11 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Preferred Jersey Name*\"));"));
		listitem11.getLocation();
		listitem11.click();
		Thread.sleep(2000);

		WebElement pre=driver.findElement(By.id("com.wtcf:id/prefered_jersey_name"));
		pre.click();
		Thread.sleep(2000);
		pre.sendKeys("KingMakers");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		

	/*	//name
		MobileElement listitem111 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Player Name*\"));"));
		listitem111.getLocation();
		listitem111.click();
		Thread.sleep(2000);
		
		WebElement name2=driver.findElement(By.xpath("//*[@text='Player Name*']"));
		name2.click();
		Thread.sleep(2000);
		name2.sendKeys("Raju");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		//dob
		driver.findElement(By.xpath("//*[@text='D.O.B*']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.wtcf:id/confirm_button")).click();
		Thread.sleep(2000);*/

		driver.findElement(MobileBy.AndroidUIAutomator
				("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(50000))"));
		
		/*driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(50000)"));*/
		Thread.sleep(2000);

		//phant size
		WebElement waist=driver.findElements(By.id("com.wtcf:id/waist")).get(1);
		waist.click();
		Thread.sleep(2000);
		waist.sendKeys("22");
		Thread.sleep(2000);

		WebElement length=driver.findElements(By.id("com.wtcf:id/length")).get(3);
		length.click();
		Thread.sleep(2000);
		length.sendKeys("22");
		Thread.sleep(2000);

		//food
		driver.findElement(By.id("com.wtcf:id/non_veg_radio")).click();
		Thread.sleep(2000);

		//player type
		driver.findElement(By.xpath("//*[@text='BATTER']")).click();
		Thread.sleep(2000);

		//reg
		driver.findElement(By.id("com.wtcf:id/submit")).click();
		Thread.sleep(2000);


	}
	    @Test(priority=3)
	    public void addMembers() throws InterruptedException
	    {
	    driver.findElement(By.xpath("//*[@text='Add members']")).click();
	    Thread.sleep(2000);

	    }

}

