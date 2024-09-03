package automationFrameworks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Assert {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement ele=driver.findElement(By.id("email"));
	ele.click();
	ele.sendKeys("raji");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Log In']")).click();
	driver.findElement(By.xpath("")).click();
	
	//String expected=error=("The email address or mobile number you entered isn't connected to an account. ");

	
	
}
	

} 