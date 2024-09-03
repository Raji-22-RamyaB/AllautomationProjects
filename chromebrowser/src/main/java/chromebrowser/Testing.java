package chromebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
   System.setProperty("webdriver.chrome.driver","F:\\SeleniumPrograms\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   Thread.sleep(2000);

	}

}
