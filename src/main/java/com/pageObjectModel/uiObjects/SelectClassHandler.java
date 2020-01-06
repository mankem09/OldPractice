package com.pageObjectModel.uiObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectClassHandler {

	public WebDriver driver;
	/*
	//@FindBy (xpath="driver.findElement(By.xpath(\"//select[@id='day']\")")
	WebElement selectListvalues;*/
	

	@BeforeMethod
	public void browserLaunch() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + ("\\\\Browser_Drivers\\\\chromedriver.exe"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@Test
	public void selectList() throws Exception {

		//selectByValue();
	selectByIndex();
		//selectByVisibletext();
	//deSelectByIndex();
	firstSelectedValue();
	}

	public void selectByValue() {
		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
		Select Days = new Select(element);
		Days.selectByValue("31");
		System.out.println();
	}
		
	public void selectByVisibletext() throws Exception {
		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
		Select Days = new Select(element);
		Days.selectByVisibleText("6");
		Thread.sleep(3000);
	}

	public void selectByIndex() throws Exception {
		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
		Select Days = new Select(element);
		Days.selectByIndex(4);
		Thread.sleep(3000);
	}

	public void getAllOptions() {
		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
		Select Days= new Select(element);
		List<WebElement> alldays = Days.getOptions();
		for (WebElement Element : alldays) {
			
			System.out.println(Element.getText());
	}
	}

	public void deSelectByIndex() throws Exception {
		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
		Select Days = new Select(element);
		Days.deselectByIndex(4);
		Thread.sleep(3000);
	}
	
	public void firstSelectedValue() {
		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
		Select Days = new Select(element);
		WebElement selectedvalue = Days.getFirstSelectedOption();
		System.out.println(selectedvalue.getText());
	}
	
	
	
	@AfterMethod
	public void browserClosed() {
		driver.close();
	}

}
