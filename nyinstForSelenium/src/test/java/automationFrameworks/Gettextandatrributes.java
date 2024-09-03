package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gettextandatrributes {

	@Test 
	public void gettext(){
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\ChromeTest\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		//get text
	/*	String a =driver.findElement(By.tagName("h1")).getText();
		System.out.println(a);
		String c=driver.findElement(By.linkText("Sign up")).getText();
		System.out.println(c);
		String b=driver.findElement(By.className("card-content")).getText();
		System.out.println(b);
		*/

	//get attribute
		String attribute=driver.findElement(By.id("join")).getAttribute("value");
		System.out.println(attribute);
		
	String a=driver.findElement(By.id("join")).getAttribute("id");
	System.out.println(a);
	String b=driver.findElement(By.id("fullName")).getAttribute("placeholder");
	System.out.println(b);
		
	
	}
}

