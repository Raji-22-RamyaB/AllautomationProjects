package testNGFrameworks;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class ForRecall {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","\\SeleniumPrograms\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chromedriver started successfully.....");
		driver.manage().window().maximize();

		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		// getTitle() to obtain page title
		System.out.println("Page title is : " + driver.getTitle());
		//checkthemathces expc and act
		String pageTitle = driver.getTitle();
		String expectedTitle="JPetStore Demo";
		Assert.assertEquals(pageTitle, expectedTitle, "Wrong page loaded");
		//getthe text
		String a=driver.findElement(By.xpath("//a[text()='Sign In']")).getText();
		// String b=driver.findElement(By.xpath("//title[text()='JPetStore Demo']")).getText();
		System.out.println(a);

		

		WebElement ele=driver.findElement(By.xpath("//input[@name='username']"));
		ele.click();
		ele.sendKeys("Raji");

		WebElement ele1=driver.findElement(By.xpath("//input[@name='password']"));
		ele1.click();
		ele1.sendKeys("Raji111");

		WebElement ele2=driver.findElement(By.xpath("//input[@name='repeatedPassword']"));
		ele2.click();
		ele2.sendKeys("Raji111");
		//select
		Select lang=new Select(driver.findElement(By.xpath("//select[@name='account.languagePreference']")));
		lang.selectByIndex(1);

		Select fav=new Select(driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']")));
		fav.selectByValue("CATS");

		//click action
		WebElement sel=driver.findElement(By.xpath("//input[@name='account.listOption']"));
		if(sel.isSelected())
		{
			System.out.println("The field is already selected");
		}
		else
		{
			System.out.println("The field is not Selected");
			sel.click();
		}

		WebElement box2=driver.findElement(By.xpath("//input[@name='account.bannerOption']"));
		box2.click();
		
		
		
		
		
		
	}


}

