package logintest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;



public class SampleTest {
	Properties or = new Properties();
	public void loadData() throws IOException {
		File file = new File("D:\\selenium_workspace_oxygen\\pageObjectModel\\src\\main\\java\\com\\pageObjectModel\\Config\\config.properties");
		FileInputStream fis = new FileInputStream(file);
		or.load(fis);
	}

}
