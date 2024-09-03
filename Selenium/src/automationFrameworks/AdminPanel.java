package automationFrameworks;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class AdminPanel {
	public static <DesiredCapbilities> void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver", "F:\\New
		// folderbrowsers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "F:\\New folderbrowsers\\geckodriver.exe");

		FirefoxOptions options = new FirefoxOptions();
		options.addArguments(
				"--user-data-dir=C:\\Users\\XSC-10261\\AppData\\Local\\Mozilla\\Firefox\\Profiles\\3vmayg1l.default");
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://dev-admin.cricdost.com/admin/login");
		WebElement ele = driver.findElement(By.id("email-id"));
		ele.clear();
		ele.sendKeys("rajeshwari.b@xcelcorp.com");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));
		ele1.clear();
		ele1.sendKeys("XcelCorp");
		Thread.sleep(2000);

		driver.findElement(By.id("admin-login")).click();
		Thread.sleep(5000);

		driver.get("https://dev-admin.cricdost.com/match");
		Thread.sleep(2000);

		// driver.findElement(By.xpath("//*[@text()='Matches']")).click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/aside[1]/section[1]/ul[1]/li[4]/a[1]/span[1]")).click();
		Thread.sleep(5000);

		/*
		 * WebElement mat =
		 * driver.findElement(By.xpath("//span[contains(text(),'Matches')]"));
		 * JavascriptExecutor jse = (JavascriptExecutor) driver;
		 * jse.executeScript("arguments[0].click()", mat);
		 */

		Thread.sleep(2000);

		driver.findElement(By.id("match-advance-search")).click();
		Thread.sleep(2000);

		WebElement ele3 = driver.findElement(By.id("search-match-code"));
		ele3.click();
		ele3.sendKeys("TY7Q");
		Thread.sleep(2000);

		driver.findElement(By.id("filter")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Create Stream']")).click();
		Thread.sleep(2000);

		// executiongoogle
		driver.get(
				"https://accounts.google.com/o/oauth2/auth/identifier?response_type=code&access_type=offline&client_id=650345169845-1d8bv48a0sejjf2ce0ndntbu5o3lp7dd.apps.googleusercontent.com&redirect_uri=https%3A%2F%2Fdev-api.cricdost.com%2Fgoogleapi%2Fbroadcast.php&state&scope=https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fyoutube&approval_prompt=auto&flowName=GeneralOAuthFlow");
		// driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		// enterid
		driver.findElement(By.id("identifierId")).sendKeys("b22019478@gmail.com");
		Thread.sleep(2000);
		// nextbutton
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);

		// cdadminpanen
		driver.get(
				"https://dev-api.cricdost.com/googleapi/broadcast.php?match_id=7544&user_id=21225&date=24-Aug-2022&time=4:30%20AM&teamA=T20%20champion&teamB=new%20world\\uD83D\\uDD25&Addr=bsbs");
		Thread.sleep(2000);

		// signin

		/*
		 * WebElement ele6 = driver.findElement(By.id("identifierId"));
		 * JavascriptExecutor jse77 = (JavascriptExecutor) driver;
		 * jse77.executeScript("arguments[0].click()", ele6);
		 * ele6.sendKeys("b22019478@gmail.com"); Thread.sleep(2000);
		 */

		/*
		 * WebElement ele4=driver.findElement(By.id("identifierId")); ele4.click();
		 * Thread.sleep(2000); ele4.sendKeys("b22019478@gmail.com"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//span[text()='Next']")).click();
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath("//input[contains(@name,'password')]")).click();
		 * Thread.sleep(2000);
		 * 
		 * 
		 * 
		 * driver.findElement(By.xpath("//span[text()='Next']")).click();
		 * Thread.sleep(2000);
		 */

	}
}