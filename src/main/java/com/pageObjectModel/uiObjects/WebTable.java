package com.pageObjectModel.uiObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable {
	public WebDriver driver;

	public void launchBrowserDemo()  {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Browser_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/losers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// //table[@class="dataTable"]/tbody/tr[1]/td[]
		int rowCount=driver.findElements(By.xpath( "//table[@class=\"dataTable\"]/tbody/tr")).size();
		int colCount=driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[1]/td")).size();
		System.out.println(rowCount);
		System.out.println(colCount);
		
		String firstPath="//table[@class=\"dataTable\"]/tbody/tr[";
		String secondPath="]/td[";
		String thirdPath="]";
						
		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
				String xPath=firstPath+i+secondPath+j+thirdPath;
				String text=driver.findElement(By.xpath(xPath)).getText();
				System.out.print(text +"|");
			}
			System.out.println();
		}
		
		driver.close();
	}
	
	public void WebTable2() {
		
		// //table[@class="dataTable"]/tbody/tr[]/td[4]
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Browser_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/losers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String firstPath="//table[@class=\"dataTable\"]/tbody/tr[";
		String secondPath="]/td[4]";
		int rowCount=driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr")).size();
		for(int i=1;i<=rowCount;i++) {
			String xPath=firstPath+i+secondPath;
			String coldata=driver.findElement(By.xpath(xPath)).getText();
			//System.out.println(coldata);
			
			Double doubledata= Double.parseDouble(coldata);
			System.out.println(doubledata);
			
			
		}
		driver.close();
	}
	
	public static void main(String[] args)  {
		WebTable wt=new WebTable();
		//wt.launchBrowserDemo();
		wt.WebTable2();
		
	}

}

