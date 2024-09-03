package automationFrameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

}
 