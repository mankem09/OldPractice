package com.pageObjectModel.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBase {
	public static final Logger Log = Logger.getLogger(TestBase.class.getName());
	public WebDriver driver;
	Properties properties = new Properties();

	public void loadData() throws IOException {
		File file = new File(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\pageObjectModel\\Config\\config.properties");
		Log.info("To read the config Property file");
		FileInputStream fis = new FileInputStream(file);
		Log.info("To read fis ");
		properties.load(fis);
		Log.info("load the Properties");
	} 
	
	public void screenshot() throws Exception {
		TakesScreenshot TS=(TakesScreenshot)driver;
		File source= TS.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./com.pageObjectModel.Screenshots/1.png"));
		
	}
@Test
	public void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Browser_Drivers//chromedriver.exe");
			driver = new ChromeDriver();
			Log.info("To Launch the Chrome Browser");
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//Browser_Drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			Log.info("To Launch the Firefox Browser");
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "//Browser_Drivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			Log.info("To Launch the IE Browser");
		}

	}

	public void enterURL(String url) {
		driver.get(url);
		Log.info("To enter the URL" +" _"+ url);
		driver.manage().window().maximize();
		Log.info("Maximize the windo");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Log.info("implicitwait 20 second ");
	}

	public void init() throws IOException {
		String configpath = "Log4j.Properties";
		PropertyConfigurator.configure(configpath);
		loadData();
		launchBrowser(properties.getProperty("browser"));
		enterURL(properties.getProperty("url"));
	}
	
	public void sendKeysOperation(WebElement element, String text) {
		try{
			element.sendKeys(text);
			Log.info("text  enter into the Text Box" +element);
			}catch (Exception e) {
				Log.info("sendkeys action not performed");
			}
	}
	public void clickOperation(WebElement element) {
		try{
			element.click();
			Log.info("Click Operation performed"+element.getText());
		}catch (Exception e) {
			Log.info("Click Operation NOt performed");
		}
		
	}

	
	public void closeBrowser() {
		driver.close();
		Log.info("close the browser");
	}

	public void selectDropDownByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
		Log.info("To selcet the dropdown By using Index"+ element + index);
	}
	
}
