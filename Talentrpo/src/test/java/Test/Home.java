/**
 * 
 */
package Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author XSC-10261
 *
 */
public class Home {
	
	
		WebDriver driver;
		@Test(priority=0)
		public void homePage() {
			
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumPrograms\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://talentrpo.ai/");
			driver.manage().window().maximize();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
		      jse.executeScript("window.scrollBy(0,5000)", "");
			
			}
		
		@Test(priority=1)
		public void customer() throws InterruptedException {
			Thread.sleep(2000);
		
		}

	}

		
	


