package nyinstForSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\ChromeTest\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    
	    driver.get("https://jqueryui.com/droppable/");
	     
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement target=driver.findElement(By.id("droppable"));
		Actions builder=new Actions(driver);
		Thread.sleep(2000);
	    builder.dragAndDrop(source, target).perform();
	    Thread.sleep(2000);      

	}

}
