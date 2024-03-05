package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
public static ExtentReports getReport() {
	//create physical report
	String path = "C:\\Users\\Anbu Rose\\eclipse-workspace\\demo\\report\\DemoProjectReport.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("DemoProject Report");
	
	//add automation data to physical report
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(reporter);
	
return extent;

}
}
