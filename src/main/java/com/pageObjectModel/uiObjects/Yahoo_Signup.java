package com.pageObjectModel.uiObjects;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Yahoo_Signup {

	WebDriver driver;
	
	public void selectDropDownByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
		System.out.println("To selcet the dropdown By using Index"+ element + value);
	}

	@BeforeMethod
	public void browserLaunch() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Browser_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://login.yahoo.com/account/create?src=fpctx&intl=in&lang=en-IN&done=https%3A%2F%2Fin.yahoo.com&specId=yidReg%5C");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void verifySignup() {
		System.out.println("***Verify the Signup ***********");
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Mallikharjuna");
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Ankem");
		driver.findElement(By.xpath("//*[@id=\'usernamereg-yid\']")).sendKeys("mankem09");
		driver.findElement(By.id("usernamereg-password")).sendKeys("mallik123$");
		WebElement countrycode = driver.findElement(By.xpath("//*[@id=\"regform\"]/div[3]/div[2]/div/select"));
		selectDropDownByValue(countrycode, "IN");
		driver.findElement(By.id("usernamereg-phone")).sendKeys("9640462258");
		WebElement birthMonth = driver.findElement(By.xpath("//*[@id=\'usernamereg-month\']"));
		selectDropDownByValue(birthMonth, "March");
		 driver.findElement(By.xpath("//*[@id=\'usernamereg-day\']")).sendKeys("22");
		 driver.findElement(By.xpath("//*[@id='usernamereg-year']")).sendKeys("1991");
		driver.findElement(By.xpath("//*[@id='usernamereg-freeformGender']")).sendKeys("Male");
		driver.findElement(By.xpath("//*[@id=\'reg-submit-button\']")).click();		
	}
	
	@Test
	public void verifyTheTermsPage() {		
		driver.findElement(By.xpath("//*[@id='regform']/p/a[1]")).click();
		String terms = driver.findElement(By.xpath("//*[@id=\'menu-secondary-navigation\']/li[1]/a")).getText();
		Assert.assertEquals(terms,"Terms");
	}
	
	
	@Test
	public void verifyThePrivacyPage() {		
		driver.findElement(By.xpath("//*[@id='regform']/p/a[2]")).click();
		String Privacy = driver.findElement(By.xpath("//*[@id=\"menu-secondary-navigation\"]/li[2]/a")).getText();
		Assert.assertEquals(Privacy,"Privacy Centre");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();

	}
}
