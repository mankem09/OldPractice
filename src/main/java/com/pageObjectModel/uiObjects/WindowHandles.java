package com.pageObjectModel.uiObjects;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {
	
	WebDriver driver;
	
	@Test
	public void windowHandles() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Browser_Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.popuptest.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String Parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@href='popuptest1.html']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		
		/*ArrayList<String> Al=new ArrayList<String>(allWindows);
		
		driver.switchTo().window(Al.get(2));
		System.out.println(driver.getTitle());
		driver.close();*/
		
		for(String childWindow: allWindows) {
			
			if(!Parent.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				System.out.println("child window"+ driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(Parent);
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
