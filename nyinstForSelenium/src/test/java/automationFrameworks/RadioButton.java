package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://materializecss.com/radio-buttons.html");
	    driver.manage().window().maximize();
	//WebElement element=	driver.findElement(By.xpath("(//label[@class='form-check-label'])[3]"));
	//element.click();
		
// Select index=new Select(driver.findElement(By.xpath("(//label[@class='form-check-label'])[3]")));		
	//index.selectByIndex(2);
	
	WebElement element=driver.findElement(By.xpath("//span[text()='Green']"));
	element.click();
	

	
	
	}

}
