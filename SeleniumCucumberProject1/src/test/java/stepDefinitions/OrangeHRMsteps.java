package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class OrangeHRMsteps {
  
	WebDriver driver;
	private boolean expected;
	

  @Given("I launch chrome browser")
  public void i_launch_chrome_browser() {
	  //System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver.exe");
	  driver = new ChromeDriver(); 
  
  }

  @When("I open orange hrm homepage")
  public void i_open_orange_hrm_homepage() {
	 driver.get("https://opensource-demo.orangehrmlive.com/");;
	  
   
  }
 
  @Then("I verify that th logo present on pgae")
  public void i_verify_that_th_logo_present_on_pgae() {
  boolean status= driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
   Assert.assertEquals(true,status);
  }  

  @And("close browser")
  public void close_browser() {
  // driver.quit();
  }

}
