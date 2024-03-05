package test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.HomePage;

public class TC002_Signup extends ProjectSpecificationMethod{
@Test
	public  void signupTest() throws IOException {
		// TODO Auto-generated method stub
		//read the property file
		FileReader reader = new FileReader("C:\\Users\\Anbu Rose\\eclipse-workspace\\demo\\src\\main\\resources\\Testdata.properties");
			
	//read the properties
		Properties prop =new Properties();
		prop.load(reader);
		
	HomePage obj = new HomePage(driver);
	//obj.browserlaunch(prop.getProperty("browser"));
	//obj.loadurl(prop.getProperty("Url"));
	obj.signupButton().Usernamesignup("Divya").Passwordsignup("divya123").signup();	
		
	}

}
