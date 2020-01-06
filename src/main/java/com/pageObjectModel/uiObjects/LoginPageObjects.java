package com.pageObjectModel.uiObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pageObjectModel.testbase.TestBase;

public class LoginPageObjects extends TestBase {

	public static final Logger Log=Logger.getLogger(LoginPageObjects.class.getName());
	@FindBy(xpath="//.[@id='login_form']/div/div[1]/input[@id='email']")
	WebElement emailAddress;
	@FindBy(xpath="//.[@id='login_form']/div/div[2]/span/input[@id='passwd']")
	WebElement password;
	@FindBy(xpath=".//*[@id='login_form']/div/p[1]/a")
	WebElement forgetPassword;
	@FindBy(xpath="//.[@id='login_form']/div/p[2]/button[@id='SubmitLogin']")
	WebElement signin;
	
	
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginOperation() throws Exception {
		sendKeysOperation(emailAddress, "ankemsfdcghyu@gmail.com");
		//ScreenShotBase.screenshotcapture(driver);
		sendKeysOperation(password, "12345868");
		//ScreenShotBase.screenshotcapture(driver);
		clickOperation(signin);
	}
}
