package logintest;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.pageObjectModel.testbase.TestBase;
import com.pageObjectModel.uiObjects.LoginPageObjects;
import com.pageObjectModel.uiObjects.ScreenShotBase;
import com.pageObjectModel.uiObjects.SigninPageObjects;

public class TC003_VerifyLoingOperation extends TestBase {
	
	@BeforeClass
	public void startTest() throws IOException {
		init();
	}
	
	@Test(priority=1)
	public void clickonsignin() throws Exception {
			SigninPageObjects signinpageobjects=new SigninPageObjects(driver);
	signinpageobjects.clickOnSignIn(); 
	screenshot();
	Thread.sleep(5000);
	}
	@Test(priority=2)
	public void verifyLogin() throws Exception {
		LoginPageObjects loginpageobjects=new LoginPageObjects(driver);
		
		loginpageobjects.loginOperation();
	}
	
	@AfterClass
	public void endtest() {
		closeBrowser();
	}

}
