package automationFrameworks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
public static  WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
	     driver = new ChromeDriver(); 
	    driver.get("https://formy-project.herokuapp.com/dragdrop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		//driver.switchTo().frame(0);
		Actions builder=new Actions(driver);
		WebElement source=driver.findElement(By.id("image"));
		WebElement ata=driver.findElement(By.id("box"));
		builder.dragAndDrop(source, ata).perform();
		}

}
