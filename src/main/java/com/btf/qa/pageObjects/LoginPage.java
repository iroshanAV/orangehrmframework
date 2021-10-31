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
	private WebElement username;	
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement login;
	
	
	@FindBy(id="spanMessage")
	private WebElement spanMessage;
	
	
	
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
