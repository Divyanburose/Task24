package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class Signup extends ProjectSpecificationMethod {

	public Signup (WebDriver driver) {
		this.driver = driver;
	}
	
	public Signup Usernamesignup(String username) {
	driver.findElement(By.xpath("//input[@id=\"sign-username\"]")).sendKeys(username);
	return this;
	}
	public Signup Passwordsignup(String Password) {
	driver.findElement(By.xpath("//input[@id=\"sign-password\"]")).sendKeys(Password);
	return this;
	}
	
	public Signup signup() {
		driver.findElement(By.xpath("//button[text()=\"Sign up\"]")).click();
		return this;
	}

	
	
	
	
	
	
	
	
}
