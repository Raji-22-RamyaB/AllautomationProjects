package automationFrameworks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver(); 
		    
			driver.manage().window().maximize();
			//get("https://www.google.com/");
		 
			//driver.get("https://support.google.com/");
            driver.get("https://www.google.com/account/about/");
			
			Set<String>maintab = driver.getWindowHandles();
			System.out.println(maintab);
			WebElement help=driver.findElement(By.xpath("//a[@aria-label='Help']"));
			help.click();
			Thread.sleep(2000);
			
			Set<String>tabs=driver.getWindowHandles();
			driver.getWindowHandles();
			
			System.out.println(tabs);
	
			for(String tab:tabs)
			{
				driver.switchTo().window(tab);
				String title=driver.getTitle();
				System.out.print("title");
				
				if(title.equals("Google Account Help"))
				{
			     WebElement element=driver.findElement(By.xpath("//a[text()='Create a Google Account']"));
			     element.click();
		    
	
				}
				
			}
	}
}
