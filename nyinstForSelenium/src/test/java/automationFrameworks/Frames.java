package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    
	    
	    driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		//driver.findElement(By.)
		//driver.switchTo().frame(frame);
		driver.findElement(By.name("fname")).sendKeys("raji");
		driver.findElement(By.name("lname")).sendKeys("c");

	}

}
