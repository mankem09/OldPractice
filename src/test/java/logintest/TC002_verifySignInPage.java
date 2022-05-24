package logintest;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pageObjectModel.testbase.TestBase;
import com.pageObjectModel.uiObjects.CreateAccountPageObjects;
import com.pageObjectModel.uiObjects.SigninPageObjects;

public class TC002_verifySignInPage extends TestBase {
//	public static final Logger Log = Logger.getLogBuilder(TC002_verifySignInPage.class.getName());

	@BeforeClass
	public void startTest() throws IOException {
		init();
	}

	@Test(priority = 1)
	public void verifySignIn() throws Exception {
		SigninPageObjects signinpageobjects = new SigninPageObjects(driver);
		signinpageobjects.clickOnSignIn();
		screenshot();
		Thread.sleep(5000);
		signinpageobjects.enterEmail();
		Thread.sleep(4000);

	}

	@Test(priority = 2)
	public void verifyCreateAccount() {
		CreateAccountPageObjects createaccountpageobjects = new CreateAccountPageObjects(driver);
		createaccountpageobjects.personalInformation();
		createaccountpageobjects.yourAddress();

	}

	@AfterClass
	public void eendtest() {
		closeBrowser();
	}

}
