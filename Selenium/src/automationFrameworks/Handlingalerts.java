package automationFrameworks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\XSC-10261\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	     
		driver.manage().window().maximize();
		
    driver.findElement(By.xpath("//div[@id='OKTab']")).click();
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println("simple alert text" + text);
	    alert.accept();
	    

		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Alert cancel= driver.switchTo().alert();
		String text1=cancel.getText();
		System.out.println("ok and cancle" + text1);
		cancel.accept();
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		Alert prompt=driver.switchTo().alert();
		String text2=prompt.getText();

	
		prompt.sendKeys("raji");
		prompt.accept();
		String name=driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		System.out.println(name);
		
	}

}

