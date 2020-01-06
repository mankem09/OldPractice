package com.pageObjectModel.uiObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsHandling {

	public WebDriver driver;

	@BeforeMethod
	public void browserLaunch() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Browser_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&_ga=2.166126908.364485594.1534777428-1724130708.1534777428");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("wait");
		String currentUrl = driver.getCurrentUrl();
		//String pageSource = driver.getPageSource();
		String pageTitle = driver.getTitle();
		String windowHandle = driver.getWindowHandle();
		System.out.println(currentUrl);
		//System.out.println(pageSource);
		System.out.println(pageTitle);
		System.out.println(windowHandle);
	}

	@Test
	public void alertHandling() throws Exception {

		driver.findElement(By.xpath("//input[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@type='Submit'][@class='login_button']")).click();
		getAlertText();
		Thread.sleep(9000);
		alertDismiss();
	}

	@AfterMethod
	public void browserClose() {
		driver.close();
		System.out.println("driver closed");
	}

	public void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("alert accepted");
	}

	public void getAlertText() {
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		System.out.println(alerttext);
	}

	public void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		System.out.println("alert dismiss");
	}

	public void alertSendKeys() {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("kjjfjfgjk");
		System.out.println("alert dismiss");
	}

}
