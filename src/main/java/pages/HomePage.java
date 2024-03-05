package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethod;

public class HomePage extends ProjectSpecificationMethod {
	//pagefactory for login page
	@FindBy(xpath = "//a[@id=\"login2\"]")
			WebElement login;
	//pagefactory for sign up page
	@FindBy(xpath = "//a[@id=\"signin2\"]" )
	WebElement signup;
	

	//Constructor
public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public LoginPage loginButton() {
	login.click();
	return new LoginPage(driver);
}
public Signup signupButton() {
	signup.click();
	return new Signup(driver);
	
}







}
