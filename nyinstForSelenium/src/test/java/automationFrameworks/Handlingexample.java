package automationFrameworks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingexample {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\\\ChromeTest\\\\chromedriver-win64\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		  
		String oldWindow=driver.getWindowHandle();
		WebElement element=driver.findElement(By.id("home"));
		element.click();
		Set<String>handles=driver.getWindowHandles();
		
		for (String newWindow: handles) {
		 driver.switchTo().window(newWindow);	
		}
		WebElement editbox=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		editbox.click();
		System.out.println("handles");
		System.out.println(driver.getCurrentUrl());
		System.out.println("oldWindow" +handles);
        driver.close();
		driver.switchTo().window(oldWindow);
		
		WebElement openMultiple=driver.findElement(By.xpath("//button[contains(text(),'Open Multiple Windows')]"));
		openMultiple.click();
		Thread.sleep(2000);
		int numberOfWindows=driver.getWindowHandles().size();;
		System.out.println("No of windows opened" + numberOfWindows);
		WebElement dontCloseMe=driver.findElement(By.id("color"));
		dontCloseMe.click();
		
		Thread.sleep(300);
			
		Set<String> newWindowHandles=driver.getWindowHandles();
		for (String allWindows : handles) {
			if(!allWindows.equals(oldWindow))
			{
			//.switchTo().window(allWindows.get);
			//driver.close();
			
			}
		}
		}



}
