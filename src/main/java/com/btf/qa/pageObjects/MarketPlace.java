package com.btf.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketPlace {
	public WebDriver driver;

	public MarketPlace(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="buyBtn1")
	private WebElement ldapButton;
	
	
	public WebElement getldapButton() {
		return ldapButton;
	}
	
	
	
}
