package testversion;
    import org.junit.AfterClass;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import com.relevantcodes.extentreports.ExtentReports;
	import com.relevantcodes.extentreports.ExtentTest;
	import com.relevantcodes.extentreports.LogStatus;
	
	/*static ExtentTest test;
	static ExtentReports report;
	public class ExtentReport {
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
	test = report.startTest("ExtentReport");
	}
	@Test
	public void extentReportsDemo()
	{
	System.setProperty("webdriver.chrome.driver", "E:\\ChromeTest\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	if(driver.getTitle().equals("Google"))
	{
	test.log(LogStatus.PASS, "Navigated to the specified URL");
	}
	else
	{
	test.log(LogStatus.FAIL, "Test Failed");
	}
	}
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
	
}
*/
