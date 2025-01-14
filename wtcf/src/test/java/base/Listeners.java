package base;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utils.TestUtils;

public class Listeners extends TestUtils implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name - "+result.getName());
		System.out.println("Test case is starting : "+result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status of execution - "+result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Skipped Test - "+result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed - screenshot captured : "+result.getName());
		Reporter.log("Test Failed - "+result.getName());
		try {
			getScreenShot();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
