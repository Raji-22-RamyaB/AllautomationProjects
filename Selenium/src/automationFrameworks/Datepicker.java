package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://formy-project.herokuapp.com/datepicker");
		driver.manage().window().maximize();
		 driver.findElement(By.id("datepicker")).sendKeys("03/22/2000");
	
	}

}
