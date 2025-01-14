package automationFrameworks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver","E:\\ChromeTest\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://jqueryui.com/droppable/");
	     
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions builder=new Actions(driver);
	    builder.dragAndDrop(source, target).perform();
	    
		
		
		
	}

}
