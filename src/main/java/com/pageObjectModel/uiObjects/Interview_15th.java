package com.pageObjectModel.uiObjects;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Interview_15th {
	
	WebDriver driver;
	
	@Test
	public void ascendingOrder() {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//Browser_Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		/*HashSet<String> set1= new HashSet<String>();
		TreeSet<String> set2=new TreeSet<String>();*/
		
		 List<WebElement> newele = driver.findElements(By.xpath("//ul[@id='sortable']//li"));
		System.out.println(newele.size());
		String text;
		for(WebElement ele:newele) {
			
			
		}
		
		//Collections.sort(newele);
		
		
		
		/*for (int i=1;i<=7;i++) {
			
			String s1="//*[@id=\"sortable\"]/li[";
			String s2= "]";
			String xpath1=s1+i+s2;
			
	text = driver.findElement(By.xpath(xpath1)).getText();
	System.out.println(text);
	set1.add(text);
	set2.add(text);
	
	}
		if(set2.containsAll(set1)) {
			
			System.out.println("Ascending order");
			
		}
				*/
	}

	
	/*@Test
	public void verifyTheHeader() {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//Browser_Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.lipsum.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String text1=driver.findElement(By.xpath("//h1[contains(.,'Lorem Ipsum')]")).getText();
		String expected="Lorem Ipsum";
		if(text1.equalsIgnoreCase(expected)) {
			
			System.out.println("header dispayed as"+ text1);
		}else {
			System.out.println("headers not displayed");
		}	
			}
	
		@Test
		public void waitingElementLoad() {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Browser_Drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.lipsum.com/");
			driver.manage().window().maximize();
			 WebDriverWait wait= new WebDriverWait(driver, 20);
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("labelCheck")));
			System.out.println("lable 1 displayed");	
			WebDriverWait wait1= new WebDriverWait(driver, 20);
			 wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\'newButtonArea\']/h1")));
			  System.out.println("lable 1 displayed");
		}
		*/
		@AfterMethod
		public void browserClose() {
			driver.close();
		}
}
