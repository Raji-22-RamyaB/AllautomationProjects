package chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuideJuniorLogin {

	public static void main(String[] args) throws InterruptedException {

		//set chromepath	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		Thread.sleep(2000);

		//get url
		driver.get("https://portal.guidejuniors.com/sign-up");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@class='mobile_width_signup'])[1]")).sendKeys("rajii222@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("raji222");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(@class,'btn')]")).click();
		Thread.sleep(2000);




	}
}
