package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.Utility;

public class ProjectSpecificationMethod extends Utility{
@BeforeMethod
	public void launchbrowser() {
browserlaunch("Chrome","https://www.demoblaze.com");

}
@AfterMethod
public void browserclose() {
	closebrowser();
}
@DataProvider
public String[][] excelData() throws IOException {
	
	String[][] data =readexcel(excelfile);
return data;
}
}
	
