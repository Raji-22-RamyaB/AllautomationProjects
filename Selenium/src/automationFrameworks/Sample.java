package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	     
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 //driver.findElement(By.name("password")).sendKeys("secret_sauce");
		 
		 
		// driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		// driver.findElement(By.id("username")).sendKeys("raji");
		 
		 
		 
	}

}
