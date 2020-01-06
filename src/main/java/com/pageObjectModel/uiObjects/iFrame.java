package com.pageObjectModel.uiObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class iFrame {
	
	WebDriver driver;
	
	@Test
	public void iFrameDemo() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Browser_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
				
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		int framesize=driver.findElements(By.xpath("iframe")).size();
		System.out.println(framesize);
		//driver.switchTo().frame(0);
		WebElement frameWebelement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameWebelement);
		String newtext = driver.findElement(By.xpath("//ol[@id='selectable']/li[4]")).getText();
		System.out.println(newtext);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@id='sidebar']/aside[@class='widget']/ul/li/a[contains(text(),'Draggable')]")).click(); 
		
	}

}
