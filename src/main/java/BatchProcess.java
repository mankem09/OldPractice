import java.util.ArrayList;

import org.testng.TestNG;

public class BatchProcess {
	
	public static void main(String[] args) {
		
		TestNG testNG=new TestNG();
		ArrayList<String> al= new ArrayList<String>();
		al.add(System.getProperty("user.dir")+"\\testnggroups.xml");
		al.add(System.getProperty("user.dir")+"\\testngParameters.xml");
		al.add(System.getProperty("user.dir")+"\\testngSmoke.xml");
		testNG.setTestSuites(al);
		testNG.run();
		
	}

}
