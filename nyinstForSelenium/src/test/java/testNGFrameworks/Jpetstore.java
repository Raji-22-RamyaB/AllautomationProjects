package testNGFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Jpetstore {
@Test
	public void jpet() throws InterruptedException {
 		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		 
		 driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		
		 driver.findElement(By.xpath("//td[text()='User ID:']//following::input[1]")).sendKeys("Rajeshwari");
		 driver.findElement(By.xpath("//td[contains(text(),'New password:')]//following::input[1]")).sendKeys("Raji223!");	
		 driver.findElement(By.xpath("//td[contains(text(),'New password:')]//following::input[2]")).sendKeys("Raji223!");
		 
		 String a= driver.findElement(By.xpath("//h3[contains(text(),'Account Information')]")).getText();
			System.out.println(a);
		 
		 Select index=new Select(driver.findElement(By.xpath("//select[@name='account.languagePreference']")));
		 index.selectByIndex(1);
		 Thread.sleep(2000);
		 
		// WebElement element=driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']"));
		 // value=new Select(element);
		//selectByValue("2");
		 
		 Select index1=new Select(driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']")));
		 index1.selectByIndex(3);
		 
	    
		   
		 
	   // boolean element=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		// System.out.println(element);
         
		 
		 WebElement element1=driver.findElement(By.xpath("//td[text()='Enable MyList']//following::input[1]"));
		 if(element1.isSelected())
		 {
		  System.out.println("The field is already selected");
	   	 }
		 else
		 {
		 System.out.println("The field was not slected");
		 element1.click();
		 }

		 
		 WebElement element11=driver.findElement(By.xpath("//td[text()='Enable MyBanner']//following::input[1]"));
		 if(element11.isSelected())
		 {
		  System.out.println("The field is already selected");
	   	 }
		 else
		 {
		 System.out.println("The field was not slected");
		 element11.click();
		 }
 
	}
}