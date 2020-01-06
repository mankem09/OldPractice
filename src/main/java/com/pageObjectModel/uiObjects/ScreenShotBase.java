package com.pageObjectModel.uiObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class ScreenShotBase {

	//WebDriver driver;

	public static void screenshotcapture(WebDriver driver, String methodname) throws Exception {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\pageObjectModel\\Screenshots\\"+methodname+".png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("screenshot not taken");
		}

	}

}
