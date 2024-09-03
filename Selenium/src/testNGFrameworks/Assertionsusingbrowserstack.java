package testNGFrameworks;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assertionsusingbrowserstack {
	
	
@Test
	public void testAssertFunctions() {
		
	System.setProperty("webdriver.chrome.driver", "\\SeleniumPrograms\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.browserstack.com/");
	String verifyAssertNull = null;
	assertNull(verifyAssertNull);
	
	
	}
	}


