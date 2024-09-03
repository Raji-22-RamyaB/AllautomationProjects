package testNGFrameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Paralleltesting {
	@Test
	public void yahoo()
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\XSC-10261\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
		//driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/");
		long startTime = System.currentTimeMillis();
		long endTime= System.currentTimeMillis();
        driver.quit();
	}
    @Test
	public void google()
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\XSC-10261\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
		//driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		driver.quit();

	}

}
