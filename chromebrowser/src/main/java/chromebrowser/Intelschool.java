package chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

 
  public class Intelschool {
		public WebDriver driver;

	@Test(priority = 0)
	public void systemSet() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\XSC-10261\\Downloads\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize();
	Thread.sleep(2000);

	//get url
	driver.get("https://portal.intelschool.in/");
	Thread.sleep(2000);
	
	}
/*	@Test(priority = 0)
	public void teacherLoginTest  () {
				driver.findElement(By.id("username")).sendKeys("rajkamal");
				driver.findElement(By.id("password")).sendKeys("Guruom@5");
				driver.findElement(By.id("user-login")).click();
			}
		  @Test(priority=1)
		  public void salary()
		  {
			
			 WebElement ele1 = driver.findElement(By.xpath("//p[text()='SALARY']"));
		     JavascriptExecutor jse = (JavascriptExecutor) driver;
		     jse.executeScript("arguments[0].click()", ele1);
		  }
		  
		 @Test(priority=2)
		 public void salaryoption()
		 {

			 WebElement ele1 = driver.findElement(By.xpath("//p[text()='SALARY']"));
		     JavascriptExecutor jse = (JavascriptExecutor) driver;
			 jse.executeScript("arguments[0].click()", ele1);
			 
			driver.findElement(By.xpath("//a[text()='Pay Date']")).click();
			 
			driver.findElement(By.xpath("//a[text()='Start Period']")).click();
			 
			driver.findElement(By.xpath("//a[text()='End Period']")).click();

			driver.findElement(By.xpath("//a[text()='Net Amount']")).click();

			driver.findElement(By.xpath("//a[text()='Pay Slip']")).click();
		 
		 
}*/
  }