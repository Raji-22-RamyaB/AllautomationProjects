package testNGFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Uploadfile {

	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\XSC-10261\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		driver.get("https://formy-project.herokuapp.com/fileupload");
		//driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		//WebElement element=driver.findElement(By.xpath("(//a[text()='File Upload'])[2]"));

		//element.click();
		driver.findElement(By.id("file-upload-field")).sendKeys("C:\\Users\\XSC-10261\\Downloads\\DAR\\rajeshwari - Copy.xlsx");
		//driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\XSC-10261\\Downloads\\folder");
		// driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\XSC-10261\\Downloads\\DAR\\rajeshwari - Copy.xlsx");
	}
}