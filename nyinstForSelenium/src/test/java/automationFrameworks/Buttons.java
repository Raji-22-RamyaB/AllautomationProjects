package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://formy-project.herokuapp.com/buttons");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Primary']")).click();
		driver.findElement(By.xpath("//button[text()='Success']")).click();
		driver.findElement(By.xpath("//button[text()='Info']")).click();
		driver.findElement(By.xpath("//button[text()='Link']")).click();
		driver.findElement(By.xpath("//button[text()='Left']")).click();
		driver.findElement(By.xpath("//button[.='1']")).click();
		driver.findElement(By.xpath("//button[.='2']")).click();
		driver.findElement(By.xpath("//button[@id='btnGroupDrop1']")).click();
	   driver.findElement(By.xpath("//a[text()='Dropdown link 1']")).click();

		
		
	}

}
