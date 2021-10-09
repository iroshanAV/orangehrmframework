package com.btf.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="txtUsername")
    WebElement username;	
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement login;
	
	
	@FindBy(id="spanMessage")
	WebElement spanMessage;
	
	
	
	public WebElement getUsername() {
		return username;
	}
	
	
	public WebElement getPassword() {
		return password;
	}
	
	
	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getSpanMessage() {
		return spanMessage;
	}
	
}
