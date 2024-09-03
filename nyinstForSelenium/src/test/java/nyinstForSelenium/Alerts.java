package nyinstForSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\ChromeTest\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get url
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//maximize screen
		driver.manage().window().maximize();
		
		//simpleALert
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();

		Alert myalert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(myalert.getText());
		myalert.accept();

		//confirmation Alert OK & Cancel'
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();

		//ok
		Alert myalert1=driver.switchTo().alert();
		System.out.println(myalert1.getText());
		myalert1.accept();
		Thread.sleep(2000);

		//cancel
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Alert myalert2=driver.switchTo().alert();
		System.out.println(myalert2.getText());
		myalert1.dismiss();
		Thread.sleep(2000);

		//ok and cancel
		/*driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();*/


		//Confirmation Alert
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		WebElement ele=driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		ele.click();
		Thread.sleep(3000);
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("raji qa automation");
		Thread.sleep(2000);
		prompt.accept();
		Thread.sleep(2000);
		

	}
}