    package testNGFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RediffMail {
	@Test
	public void Rediff() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\New folderbrowsers\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver","\\SeleniumPrograms\\chromedriver.exe");
    WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	driver.findElement(By.xpath("//td[text()='Full Name']//following::input[1]")).sendKeys("Rajeshwari b");
	driver.findElement(By.xpath("//td[text()='Choose a Rediffmail ID']//following::input[1]")).sendKeys("Rajeshwari.bb");
	driver.findElement(By.xpath("//td[text()='Password']//following::input[1]")).sendKeys("Raji283!");
    driver.findElement(By.xpath("//td[text()='Retype password']//following::input[1]")).sendKeys("Raji283!");


 /*   WebElement element=driver.findElement(By.xpath("//input[@type='checkbox']"));
    if(element.isSelected())
    {
      System.out.println("The field is already selected");
	}
    else
    {
      System.out.println("The field was not slected");
      element.click();
    }
  */
  driver.findElement(By.xpath("//td[text()='Alternate Email Address']//following::input[1]")).sendKeys("Raji28@rediffmail.com");
  driver.findElement(By.id("mobno")).sendKeys("9080626289");
  Select day=new Select(driver.findElement(By.xpath("//td[text()='Date of Birth']//following::select[1]")));
  day.selectByIndex(15);
  
  Select month=new Select(driver.findElement(By.xpath("//td[text()='Date of Birth']//following::select[2]")));
  month.selectByIndex(10);
  
  Select year=new Select(driver.findElement(By.xpath("//td[text()='Date of Birth']//following::select[3]")));
  year.selectByIndex(15);
  	
	driver.findElement(By.xpath("//td[text()='Gender']//following::input[2]")).click();
	
	Select country=new Select(driver.findElement(By.xpath("//select[@id='country']")));
	country.selectByIndex(5);	
	 
	
	Select city=new Select(driver.findElement(By.xpath("//td[text()='Enter the text shown above']//preceding::select[1]")));
	city.selectByIndex(3);
	Thread.sleep(20000);
	
	//.findElement(By.xpath("//td[text()='Enter the text shown above']//following::input[1]")).sendKeys("4LPh");
	
	WebElement element= driver.findElement(By.id("Register"));
	element.click();
	
		 
		 
		 
		 
		 

		 
		 
 
 
	}
	
}
