package automationFrameworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swtichtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		System.out.println("Application started");
		
		
		//driver.get("https://formy-project.herokuapp.com/");
		
		//driver.get("https://formy-project.herokuapp.com/switch-window");
		
		
		//driver.findElement(By.xpath("(//a[text()='Switch Window'])[1]")).click();
		
		
	  /*  driver.findElement(By.id("new-tab-button")).click();  
	     Set<String>windowHandles=driver.getWindowHandles();
	    List<String>list=new ArrayList <String>(windowHandles);
	    driver.switchTo().window(list.get(1));*/
	    
	}
	

}
