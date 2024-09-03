package automationFrameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testingchrome {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/chrome/next-steps.html?installdataindex=empty&statcb=1&defaultbrowser=0&brand=JJTC");
	}

}
