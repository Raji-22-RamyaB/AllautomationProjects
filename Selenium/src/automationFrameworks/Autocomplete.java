package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver","E:\\ChromeTest\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://formy-project.herokuapp.com/autocomplete");
		driver.manage().window().maximize();
		 driver.findElement(By.id("autocomplete")).sendKeys("no.16,mothilal street,chennai");
		 driver.findElement(By.id("street_number")).sendKeys("1st cross streer");
		 driver.findElement(By.id("route")).sendKeys("mothilal street");
		 driver.findElement(By.id("locality")).sendKeys("chennai");
		 driver.findElement(By.id("administrative_area_level_1")).sendKeys("Tamil Nadu");
		 driver.findElement(By.id("postal_code")).sendKeys("600040");
		 driver.findElement(By.id("country")).sendKeys("India");

		 

		
		
		
		
		
		
		
	}

}
