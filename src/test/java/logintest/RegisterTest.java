package logintest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageObjectModel.testbase.TestBase;

public class RegisterTest extends TestBase {

	// WebDriver driver;

	@BeforeMethod
	public void testStart() throws IOException {
		init();

	}

	@Test
	public void registerTest() {
		driver.findElement(By.xpath("//input[@id='u_0_p']")).sendKeys("Mallikharjun");
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("arjun");
		driver.findElement(By.xpath("//input[@id='u_0_u']")).sendKeys("8074212355");
		driver.findElement(By.xpath("//input[@id='u_0_11']")).sendKeys("Padma#143a");

	}

	@AfterMethod
	public void testEnd() {
		closeBrowser();

	}

}
