package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://formy-project.herokuapp.com/checkbox");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='checkbox-2']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@id='checkbox-3']"));
		element.click();
	
		
		
	}

}
