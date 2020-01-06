package com.pageObjectModel.uiObjects;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FindtheAllElements {

	WebDriver driver;

	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Browser_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*List<WebElement> items = driver.findElements(By.cssSelector("*"));

		System.out.println(items.size());

		List<WebElement> allElements = driver.findElements(By.xpath("//*"));

		System.out.println(allElements.size());

		TreeSet<String> element = new TreeSet<String>();

		for (WebElement ele : items) {

			// System.out.println(ele.getText());
			//element.add(ele.getText());
			element.add(ele.getTagName());
		}
System.out.println(element);*/
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
