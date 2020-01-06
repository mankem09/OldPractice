package com.pageObjectModel.uiObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pageObjectModel.testbase.TestBase;

public class SigninPageObjects extends TestBase {
	public static final Logger Log=Logger.getLogger(SigninPageObjects.class.getName());

	@FindBy(xpath = "//a[@class='login']")
	WebElement signin;

	@FindBy(xpath = "//*[@id='email_create']")
	WebElement emailAddress;

	@FindBy(xpath = "//button[@id='SubmitCreate']")
	WebElement createAcoount;

	public SigninPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnSignIn() throws Exception {
		clickOperation(signin);
		screenshot();

	}

	public void enterEmail() {
		//clickOnSignIn();
		
		sendKeysOperation(emailAddress,"ankemsfdcghyu@gmail.com");
		clickOperation(createAcoount);
		/*emailAddress.sendKeys("ankemsfdc1543@gmail.com");
		Log.info("enter eamil");
		createAcoount.click();
		Log.info("click on Create new Account");*/
	}

	
}
