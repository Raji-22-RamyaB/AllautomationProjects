package loginTestCases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BothInCorrect {
 @BeforeTest
	@Parameters({"username","password"})

	public void loginWithBothInCorrectUserName(String uName, String pWord) throws InterruptedException
	{
		Thread.sleep(3000);
		System.setProperty("webdriver.chrome.driver","E:\\ChromeTest\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		WebElement userName = driver.findElement(By.name("username"));
		userName.click();
		Thread.sleep(2000);
		userName.sendKeys("uName");

		WebElement password = driver.findElement(By.name("password"));
		password.click();
		Thread.sleep(2000);

		password.sendKeys("pWord");
		Thread.sleep(2000);


		WebElement loginButton = driver.findElement(By.xpath("//button[text()=' Login ']"));
		loginButton.click();
		Thread.sleep(2000);
		//driver.quit();


	}
}
