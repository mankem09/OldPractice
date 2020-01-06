package com.pageObjectModel.uiObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pageObjectModel.testbase.TestBase;

public class CreateAccountPageObjects extends TestBase {
	public static final Logger Log=Logger.getLogger(CreateAccountPageObjects.class.getName());
	

	@FindBy(xpath = "(//*[@class='top'])[1]")
	WebElement title;

	@FindBy(id = "customer_firstname")
	WebElement firstName;

	@FindBy(id = "customer_lastname")
	WebElement lastNamne;

	@FindBy(id = "passwd")
	WebElement registerPassword;

	@FindBy(id = "days")
	WebElement dobDay;

	@FindBy(id = "months")
	WebElement dobMonth;

	@FindBy(id = "years")
	WebElement dobYear;

	@FindBy(id = "newsletter")
	WebElement checkBoxNewsletter;

	@FindBy(id = "optin")
	WebElement checkBoxOffers;
	
	@FindBy(id="firstname")
	WebElement addressFirstName;
	
	@FindBy(id="lastname")
	WebElement addressLastName;
	
	@FindBy(id="company")
	WebElement addressCompany;
	
	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(id="address2")
	WebElement address2;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="id_state")
	WebElement state;
	
	@FindBy(id="postcode")
	WebElement postalcode;
	
	/*@FindBy(id="id_country")
	WebElement Country;*/

	@FindBy(id="other")
	WebElement additional_Information;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(id="phone_mobile")
	WebElement mobile;
	
	@FindBy(id="alias")
	WebElement Address_Alias;
	
	@FindBy(id="submitAccount")
	WebElement Register;
	
	public CreateAccountPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void personalInformation() {
		clickOperation(title);
		sendKeysOperation(firstName, "mallikharjuna");
		sendKeysOperation(lastNamne, "Ankem");
		sendKeysOperation(registerPassword, "12345868");
		/*title.click();
		firstName.sendKeys("Mallikharjuna");
		lastNamne.sendKeys("Ankem");
		registerPassword.sendKeys("123456789");
		*/
		selectDropDownByIndex(dobDay, 5);
		selectDropDownByIndex(dobMonth, 3);
		selectDropDownByIndex(dobYear, 25);
		clickOperation(checkBoxNewsletter);
		clickOperation(checkBoxOffers);
		/*checkBoxNewsletter.click();
		checkBoxOffers.click();*/
	}

	public void yourAddress() {
		sendKeysOperation(addressFirstName, "Mallikharjuna");
		sendKeysOperation(addressLastName, "ankem");
		sendKeysOperation(addressCompany, "techm");
		sendKeysOperation(address1, "hyderabad,nizampet");
		sendKeysOperation(address2, "hyderabad");
		sendKeysOperation(city, "Hyderabad");
		selectDropDownByIndex(state,1);
		sendKeysOperation(postalcode, "12345");
		sendKeysOperation(additional_Information, "jklkj");
		sendKeysOperation(phone, "9985758590");
		sendKeysOperation(mobile, "2564785236");
		sendKeysOperation(Address_Alias, "kingroad");
		clickOperation(Register);
		/*addressFirstName.sendKeys("Mallikharjun");
		addressLastName.sendKeys("Ankem");
		addressCompany.sendKeys("Techm");
		address1.sendKeys("nizampet");
		address2.sendKeys("hyderabad");
		city.sendKeys("nizampet");
		selectDropDownByIndex(state,1);
		postalcode.sendKeys("01234");
		additional_Information.sendKeys("hello");
		phone.sendKeys("015655556565");
		mobile.sendKeys("9158658698");
		Address_Alias.sendKeys("kingkong road");
		Register.click();*/
	}
}
