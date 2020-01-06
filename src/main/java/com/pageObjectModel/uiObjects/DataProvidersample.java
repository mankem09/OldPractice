package com.pageObjectModel.uiObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvidersample {
	WebDriver driver;

	@DataProvider
	public Object[][] sampleData() {
		Object[][] data = new Object[2][2];

		data[0][0] = "sample00";
		data[0][1] = "sample01";

		data[1][0] = "sample10";
		data[1][1] = "sample11";

		return data;

	}

	@Test(dataProvider="sampleData")
	public void dataProvider(String name, String Password) {

		System.out.println(name);
		System.out.println(Password);
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Browser_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(name);
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(Password);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();

	}
	
	
	@Test
	@Parameters({"Data1","Data2"})
	public void login(@Optional ("Default") String Data1, @Optional("Default") String Data2) {
	
		System.out.println(Data1);
		System.out.println(Data2);
	}
	/*@AfterMethod
	public void closeBrowser() {
		driver.close();
	}*/
}






