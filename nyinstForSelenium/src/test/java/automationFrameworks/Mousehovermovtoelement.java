package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehovermovtoelement {
	public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver","E:\\\\ChromeTest\\\\chromedriver-win64\\\\chromedriver.exe");
    WebDriver driver = new ChromeDriver(); 
    driver.get("https://www.flipkart.com/");
 
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	
	

	}
}