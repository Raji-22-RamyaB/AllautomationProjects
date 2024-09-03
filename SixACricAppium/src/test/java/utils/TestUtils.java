package utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseClass;


public class TestUtils extends BaseClass {
	
	public void getScreenShot() throws IOException {
		Date currentDate = new Date();
		String screenShotFilename = currentDate.toString().replace(" ", "-").replace(":", "-");
		File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File(".//screenshot//"+screenShotFilename+".png"));
		System.out.println(screenShotFilename);
	}

}
