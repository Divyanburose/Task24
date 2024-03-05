package utils;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility {
public static WebDriver driver;
public String excelfile;
	
	public void browserlaunch(String browser,String url) {
		//cross browser testing
if(browser.equals("chrome")) {
		driver = new ChromeDriver();
}else if (browser.equals("Edge")) {
	driver = new EdgeDriver();
}else if (browser.equals("firefox")) {
	driver = new FirefoxDriver();
} else  {
	driver = new ChromeDriver();	
}

	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
}
public void closebrowser() {
	driver.close();
}
public String[][] readexcel(String excelfile) throws IOException {
	XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\Anbu Rose\\eclipse-workspace\\demo\\data\\"+excelfile+".xlsx");
	XSSFSheet sheet1 = book.getSheetAt(0);
	
	
	int rowCount = sheet1.getLastRowNum();
	int columnCount = sheet1.getRow(0).getLastCellNum();
	
	String[][] data = new String[rowCount][columnCount] ;
	
	//Get into row
	for(int i =1;i<=rowCount;i++) {
		XSSFRow row = sheet1.getRow(i);
	
	//Get into column
	for(int j =0;j<columnCount;j++) {
		XSSFCell cell = row.getCell(j);
	
	//read the data from excel
		data[i-1][j] = cell.getStringCellValue();
	
	}

	}
book.close();
return data;
}}
