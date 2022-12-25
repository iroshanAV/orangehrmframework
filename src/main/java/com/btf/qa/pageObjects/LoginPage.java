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
	
	
	@FindBy(xpath = "//form/div[1]/div/div[2]/input")
	private WebElement txtUsername;	
	
	@FindBy(xpath = "//form/div[2]/div/div[2]/input")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//form/div[3]/button")
	private WebElement btnLogin;
	
	
	@FindBy(xpath = "//p[text()='Invalid credentials']")
	private WebElement lblSpanMsg;
	
	
	
	public WebElement gettxtUsername() {
		return txtUsername;
	}
	
	
	public WebElement gettxtPassword() {
		return txtPassword;
	}
	
	
	public WebElement getbtnLogin() {
		return btnLogin;
	}
	
	public WebElement getlblSpanMsg() {
		return lblSpanMsg;
	}
	
}
