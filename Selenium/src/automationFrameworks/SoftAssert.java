package automationFrameworks;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SoftAssert {

	// Author: Chaitanya Pujari

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromefortesting\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.get("https://www.google.co.in/");
	driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");

	//Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform");
	//assertNotNull(verifyTitle);
	}
	}

