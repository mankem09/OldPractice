package com.pageObjectModel.uiObjects;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DEMOForSC {
	public static final Logger Log = Logger.getLogger(DEMOForSC.class.getName());
	public WebDriver driver;
	String configpath = "Log4j.Properties";
	public static ExtentReports extentReport;

	public static ExtentTest extentTest;
	
	static {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		extentReport = new ExtentReports(System.getProperty("user.dir") + "\\src\\main\\java\\com\\SampleProject\\Reports\\"
				+ formater.format(calendar.getTime()) + "_Sample_Report.html", false);
	}
@Test
	public void launchBrowserDemo() throws Exception {
		//extentReport = new ExtentReports(System.getProperty("user.dir") + "\\src\\main\\java\\reports\\report56.html", false);

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Browser_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		PropertyConfigurator.configure(configpath);
		driver.get("https://www.facebook.com/");
		Log.info("enter the URL");
		extentTest.log(LogStatus.INFO, "enter Url");
		// ScreenShotBase.screenshotcapture(driver,"login");

		driver.manage().window().maximize();
		Log.info("maximize the window");
		extentTest.log(LogStatus.INFO, "Maximize thew indow");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extentTest.log(LogStatus.INFO, "implicit wait");
	}

	/*public void closeBrowser() {
		driver.close();
		System.out.println("driver closed");
		extentTest.log(LogStatus.INFO, "close the browser");
	}*/
@Test
	public void signIn() throws Exception {
		try {
			driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("mallikharjunaankem@ymail.com");
			Log.info("enter the user name");
			extentTest.log(LogStatus.INFO, "enter user name");
			// ScreenShotBase.screenshotcapture(driver, "passed");
			driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Padma#143a");
			extentTest.log(LogStatus.INFO, "enter password");
			Log.info("eneter the password");
			driver.findElement(By.id("u_0_2")).click();
			Log.info("clicl on sign in");
			extentTest.log(LogStatus.INFO, "click on sign in");
		} catch (Exception e) {

			System.out.println("Screen shot taken");
			ScreenShotBase.screenshotcapture(driver, "failed6");

		}
	}
/*
	@Test
	public void excecution() throws Exception {

		DEMOForSC td = new DEMOForSC();
		td.launchBrowserDemo();
		td.signIn();
		td.closeBrowser();
	}*/

	
	public void getResult(ITestResult result) throws Exception {

		if (result.getStatus() == ITestResult.SUCCESS) {

			extentTest.log(LogStatus.PASS, result.getName(), "testpassed");

			ScreenShotBase.screenshotcapture(driver, result.getName());
		} else if (result.getStatus() == ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "test failed");
		}
	
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception {
		getResult(result);
	}
	@BeforeMethod()
	public void beforeMethod(Method result) {
		extentTest = extentReport.startTest(result.getName());
		extentTest.log(LogStatus.INFO, result.getName() + " test Started");
	}

	@AfterClass(alwaysRun = true)
	public void endTest() {
		closeBrowser();
	}

	/*
	 * To Perform Browser close Operation
	 * 
	 */
	public void closeBrowser() {
		driver.quit();
		//log.info("browser closed");
		extentReport.endTest(extentTest);
		extentReport.flush();
	}
                                                              

}
