package automationFrameworks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit {
	private static final TimeUnit TimeUnit = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		// driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
        driver.get("https://www.facebook.com/"); 
		 
		//driver.findElement(By.id("emails"));
	    //driver.manage().timeouts().implicitlyWait.(10,TimeUnit.SECONDS);
	    WebDriverWait varname=new WebDriverWait(driver,30);
	    varname.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	    
	    // WebDriverWait wait= new WebDriverWait(driver,60);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	    
		
		

}
}