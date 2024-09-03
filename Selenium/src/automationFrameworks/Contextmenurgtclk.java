package automationFrameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contextmenurgtclk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    
	    
	    driver.get("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();

	}

}
