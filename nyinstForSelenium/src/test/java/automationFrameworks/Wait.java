package automationFrameworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {


	//private static final TimeUnit TimeUnit = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("emails")).sendKeys("test");
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emails")));
		

	}

}
