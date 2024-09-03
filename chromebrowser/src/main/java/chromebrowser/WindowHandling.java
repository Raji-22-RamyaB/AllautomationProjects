package chromebrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	WebDriver driver;
	@Test(priority=0)
	public void handling() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\XSC-10261\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void open() throws InterruptedException
	{
		String OldWindow=driver.getWindowHandle();

		 
		WebElement ele=driver.findElement(By.xpath("//span[text()='Open']"));
		/* JavascriptExecutor jse=(javaScriptExecutor) driver;
		 jse.executescript

		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);*/

		Set<String>handles=driver.getWindowHandles();
		for (String newWindow: handles) 
		{
           driver.switchTo().window(newWindow);
		}
	}
	private void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
}
