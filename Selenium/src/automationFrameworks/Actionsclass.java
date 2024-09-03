package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actionsclass {
	@Test
	public void actions() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.nopcommerce.com/computers");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);

        
		/*
		//mouse hover
		WebElement mousehover=driver.findElement(By.linkText("Computers"));
		act.moveToElement(mousehover).build().perform();C:\\Users\\XSC-10261\\Downloads\\chromedriver_win32\\chromedriver.exe
 
		//right click
        WebElement booklink=driver.findElement(By.linkText("Books"));	
        act.contextClick(booklink).build().perform(); 

        //enter in caps
        WebElement caps=driver.findElement(By.id("small-searchterms"));
        //act.moveToElement(caps).click().keyDown(Keys.SHIFT).sendKeys("mobile").build().perform();
 
        //double click
        WebElement doubleclk=driver.findElement(By.id("small-searchterms"));
        act.moveToElement(doubleclk).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();

        //scroll up
        Thread.sleep(2000);
        act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		 */

		//scroll down
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
        
		
        
	}

}
