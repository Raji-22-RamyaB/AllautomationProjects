package chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GjWebsite {

	public static void main(String[] args) throws InterruptedException {

		//set chromepath	
		System.setProperty("webdriver.chrome.driver","E:\\ChromeTest\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.guidejuniors.com/blogs");
		Thread.sleep(2000);

		// scroll down
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,450)");
		Thread.sleep(2000);

		//click button 
		WebElement element= driver.findElement(By.xpath("//button[text()='Write Now']"));
		Thread.sleep(2000);
		/*((JavascriptExecutor) driver).executeScript("argument[0].scrollIntoview(true);",element);
		Thread.sleep(2000);

		//perfrom click action for handling element not located exception
		/*JavascriptExecutor hld= (JavascriptExecutor) driver;
		hld.executeScript("arguments[0].click()", evt);  
		Thread.sleep(2000);*/

		//perfrom click action using wait concept
		/*WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Write Now']"))).click();
		Thread.sleep(2000);
		 */








	}
}
