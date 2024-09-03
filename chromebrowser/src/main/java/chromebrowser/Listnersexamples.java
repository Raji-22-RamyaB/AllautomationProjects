package chromebrowser;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listnersexamples implements ITestListener{

	
		@Override
		public void onTestStart(ITestResult result)
		{
			System.out.println("Test Case is going to execute");
		}
		
		@Override
		public void onTestFailure(ITestResult result1)
		{
			System.out.println("Test Case is failed");

		}
		@Override
		public void onTestSkipped(ITestResult result11)
		{
			System.out.println("TestCase is skipped");

		}
		
	}
	


	