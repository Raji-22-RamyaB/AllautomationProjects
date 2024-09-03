package testNGFrameworks;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

	public class SwagLabs {	
		@Test
		
		public void userLogin() {
			System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver(); 
		    
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			 driver.findElement(By.id("user-name")).sendKeys("standard_user");
			 driver.findElement(By.name("password")).sendKeys("secret_sauce");
			 
			 
			 
			 
			 
		}

	}

	
	
	
	

