package stepDefinitions;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class Steps {

	public WebDriver driver;
	public LoginPage lp;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		//System.getProperty(" F://SeleniumPrograms//nopCommerceV001_Cucumber//Drivers//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver.exe");
		driver=new ChromeDriver();
	    lp=new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url); 
	}

	@When("User  enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		lp.setUserName(email);
	    lp.setPassword(password);
	}

	@When("click on Log in")
	public void click_on_log_in() throws InterruptedException {
		lp.clickLogin();
		Thread.sleep(3000);
        
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			AssertJUnit.assertTrue(false);
		}
		else {
			AssertJUnit.assertEquals(title, driver.getTitle());

		}
		Thread.sleep(3000);
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		lp.clickLogout();
		Thread.sleep(3000);



	}

	/*@Then("Page Tile should be {string}")
	public void page_tile_should_be(String string) {

	}*/

	@Then("close browser")
	public void close_browser() {
		driver.close();

	}

}
