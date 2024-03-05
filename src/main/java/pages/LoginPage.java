package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class LoginPage extends ProjectSpecificationMethod {

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}	
	public LoginPage email(String email) {
		driver.findElement(By.xpath("//input[@id=\"loginusername\"]")).sendKeys(email);
		return this;
	}
	
	public LoginPage password(String password) {
		driver.findElement(By.xpath("//input[@id=\"loginpassword\"]")).sendKeys(password);
		return this;
	}
	public LoginPage submit() {
		driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[3]")).click();
		//return new Signup(driver);
		return this;
	}
	
}
