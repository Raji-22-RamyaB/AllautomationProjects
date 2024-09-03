package testNGFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Links {
	@Test
public void linksCount() {
		
	System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver(); 
    driver.get("https://en.wikipedia.org/wiki/Vijay_(actor)");
    driver.manage().window().maximize();
    int links=driver.findElements(By.tagName("a")).size();
    System.out.println(links);
	
	}
}


