package chromebrowser;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UsingLocators {
	public static void main(String[] args) throws InterruptedException {

		//set chromepath	
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\foropenchbrowser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		Thread.sleep(2000);

		//get url
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		Thread.sleep(2000);

		//ENTER USER REGISTRATION
		//find id
		driver.findElement(By.xpath("//td[text()='User ID:']//following::input[1]")).sendKeys("Rajeshwari");
		//new password
		driver.findElement(By.xpath("//td[contains(text(),'New password:')]//following::input[1]")).sendKeys("Raji223!");	
		//repeat password
		driver.findElement(By.xpath("//td[contains(text(),'New password:')]//following::input[2]")).sendKeys("Raji223!");


		//ACCOUNT INFORMATION

		String account = driver.findElement(By.xpath("//h3[contains(text(),'Account Information')]")).getText();
		System.out.println(account);
		Thread.sleep(2000);
		driver.findElement(By.name("account.firstName")).sendKeys("Durga");
		Thread.sleep(2000);
		driver.findElement(By.name("account.lastName")).sendKeys("Devi");
		driver.findElement(By.name("account.email")).sendKeys("dd22@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("account.phone")).sendKeys("985632454");
		driver.findElement(By.name("account.address1")).sendKeys("T.nagar");
		Thread.sleep(2000);
		driver.findElement(By.name("account.address2")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.name("account.city")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.name("account.state")).sendKeys("Tamilnadu");
		driver.findElement(By.name("account.zip")).sendKeys("78878");
		driver.findElement(By.name("account.country")).sendKeys("India");




		//ENTER PROFILE INFORMATION
		//get text
		String profile=driver.findElement(By.xpath("//h3[contains(text(),'Profile Information')]")).getText();
		Thread.sleep(2000);

		//language preference
		Select index=new Select(driver.findElement(By.xpath("//select[@name='account.languagePreference']")));
		index.selectByIndex(1);
		Thread.sleep(2000);

		/*WebElement element=driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']"));
	      value=new Select(element);
	      selectByValue("2");*/

		//favourite category
		Select index1=new Select(driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']")));
		index1.selectByIndex(3);


		//Enable MyList
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

		//Enable MyBanner
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

		boolean status=driver.findElement(By.xpath("//td[text()='Enable MyBanner']//following::input[1]")).isDisplayed();
		Assert.assertEquals(true, status);


	}
}

