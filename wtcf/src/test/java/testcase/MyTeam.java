package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class MyTeam extends BaseClass {

	@Test(priority = 0)

	public void homemenu() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("com.wtcf:id/drawer_menu")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 1)
	public void RegisterTeam() throws InterruptedException {
		/*
		 * driver.findElement(By.id("com.wtcf:id/design_menu_item_text")).click();
		 * Thread.sleep(2000);
		 */



		driver.findElement(By.xpath("//*[@text='My Team']")).click();
		Thread.sleep(2000);



	}

	/*
	 * driver.findElement(By.id("com.wtcf:id/register_team_layout")).click();
	 * Thread.sleep(2000);
	 */



	@Test(priority = 2)
	public void RegisterNow() throws InterruptedException {
		//driver.findElement(By.xpath("//*[@text='REGISTER NOW']")).click();

		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Register New Team\"));"));
		listitem.getLocation();
		listitem.click();

		Thread.sleep(5000);

	}

	@Test(priority = 3)
	public void TeamRegistration() throws InterruptedException {
		WebElement name = driver.findElement(By.id("com.wtcf:id/team_name"));
		name.click();
		name.sendKeys("chennai moonstars");
		Thread.sleep(2000);
		driver.navigate().back();

		driver.findElement(By.id("com.wtcf:id/img_map")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.wtcf:id/btnLocation")).click();
		Thread.sleep(3000);

		// selectState

		driver.findElement(By.id("com.wtcf:id/state")).click();
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.id("com.wtcf:id/search_input"));
		search.click();
		search.sendKeys("Tamil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Tamil Nadu']")).click();
		Thread.sleep(4000);

		// Selectdistrict
		driver.findElement(By.id("com.wtcf:id/district")).click();
		Thread.sleep(2000);
		WebElement dis=driver.findElement(By.id("com.wtcf:id/search_input"));
		dis.click();
		dis.sendKeys("Tiruv");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Tiruvallur']")).click();
		Thread.sleep(2000);

		/*MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Select, City\"));"));
		listitem.getLocation();
		listitem.click();*/

		// SelectCity
		// driver.findElement(By.id("com.wtcf:id/city")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("com.wtcf:id/city")).click();
		Thread.sleep(4000);
		WebElement city=driver.findElement(By.id("com.wtcf:id/search_input"));
		city.click();
		city.sendKeys("Ambattur Ind");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Ambattur Indl Estate']")).click();
		Thread.sleep(2000);

		// pincode
		/*WebElement pin = driver.findElement(By.id("com.wtcf:id/pin_code"));
		pin.click();
		pin.sendKeys("602023");*/

		//driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
		Thread.sleep(2000);

	}
	@Test(priority=4)
	public void addNewMember() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("com.wtcf:id/add_layout")).click();
		Thread.sleep(2000);

	}
	@Test(priority=5)
	public void memberDetail1() throws InterruptedException
	{
		//mobilenumber		
		WebElement number=driver.findElement(By.id("com.wtcf:id/contact_number"));
		number.click();
		number.sendKeys("9081344455");
		//playername
		WebElement name=driver.findElement(By.id("com.wtcf:id/player_name"));
		name.click();
		/*name.sendKeys("Rajichlm");
		driver.navigate().back();
		Thread.sleep(1000);
		//DOB
		driver.findElement(By.id("com.wtcf:id/player_dob")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.wtcf:id/confirm_button")).click();
		Thread.sleep(2000);
		//playerType
		driver.findElement(By.xpath("//*[@text='BOWLER']")).click();
		Thread.sleep(2000);
		*/ 
		
		//register
		//driver.findElement(By.id("com.wtcf:id/submit")).click();
		Thread.sleep(3500);
		driver.findElement(By.xpath("//*[@text='REGISTER']")).click();
		Thread.sleep(2000);
		//AddnewMember
		driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
		Thread.sleep(3000);
		//chooseCaptain
		driver.findElement(By.id("com.wtcf:id/captain_label")).click();
		Thread.sleep(3000);
		//done
		driver.findElement(By.xpath("//*[@text='DONE']")).click();
		Thread.sleep(3000);

	}
	@Test(priority=5)
	public void paymentMethod() throws InterruptedException
	{
		//payforcompleteTeam
		driver.findElement(By.id("com.wtcf:id/positive_button")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void reg() throws InterruptedException {

		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Grand Total\"));"));
		listitem.getLocation();
		listitem.click();
		Thread.sleep(2000);
		// driver.navigate().back();

		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
		// driver.findElement(MobileBy.AndroidUIAutomator(
		// "new UiScrollable(new
		// UiSelector().scrollable(true)).scrollToBeginning(100000)"));

		driver.findElement(By.id("com.wtcf:id/check_box")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@text='REGISTER']")).click();
		Thread.sleep(4000);
	}

	@Test(priority = 7)
	public void PaymentPage() throws InterruptedException {
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
		
		//driver.findElement(By.id("com.wtcf:id/submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Ola Money (Postpaid + Wallet)']")).click();
		Thread.sleep(3500);

		// driver.findElement(By.id("wallet-radio-freecharge")).click();
		//driver.findElement(By.xpath("//*[@text='Freecharge']")).click();
		//Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='Pay Now']")).click();
		Thread.sleep(3500);

		/*WebElement otp = driver.findElement(By.id("otp"));
		otp.click();
		Thread.sleep(5000);
		otp.sendKeys("0718");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='VERIFY']")).click();
		Thread.sleep(2000);*/

		driver.findElement(By.xpath("//*[@text='Success']")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@text='OKAY']")).click();
        Thread.sleep(2500);
        //congrats cancel
        driver.findElement(By.id("com.wtcf:id/close")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
	}
/*
	@Test(priority = 8)
	public void addMyTeam() throws InterruptedException {
		driver.findElement(By.xpath("//*[@text='ADD MY TEAM']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='Add members']")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 9)
	public void memberDetail() throws InterruptedException {
		WebElement number = driver.findElement(By.id("com.wtcf:id/contact_number"));
		number.click();
		number.sendKeys("8520145963");
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.id("com.wtcf:id/player_name"));
		name.click();
		name.sendKeys("Rajii");
		Thread.sleep(2000);

		WebElement dob = driver.findElement(By.id("com.wtcf:id/player_dob"));
		dob.click();

		driver.findElement(By.id("com.wtcf:id/confirm_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='BOWLER']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='REGISTER']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
		Thread.sleep(2000);

	}*/

}