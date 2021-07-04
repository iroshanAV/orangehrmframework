package com.btf.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By email = By.id("txtUsername");
	By password = By.id("txtPassword");
	By login = By.id("btnLogin");
	
	By spanMessage = By.id("spanMessage");
	
	
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	public WebElement getSpanMessage() {
		return driver.findElement(spanMessage);
	}
	
}
