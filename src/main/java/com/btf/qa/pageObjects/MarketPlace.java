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
	
	//LDAP Button
	@FindBy(id="buyBtn1")
	private WebElement ldapButton;
	
	
	//Intergration with Toggl
	@FindBy(id="installButton2")
	private WebElement installBtn2;
	
	
	@FindBy(id="email")
	private WebElement alertEmail;
	
	@FindBy(id="contactNumber")
	private WebElement alertContactNumber;
	
	@FindBy(id="organization")
	private WebElement alertOrganization;
	
	@FindBy(id="modal_confirm_buy")
	private WebElement alertConfirmBuyBtn;
	
	@FindBy(id="menu")
	private WebElement successMessage;
	
	
	public WebElement getldapButton() {
		return ldapButton;
	}
	
	public WebElement getAlertEmail() {
		return alertEmail;
	}
	
	public WebElement getAlertContactNumber() {
		return alertContactNumber;
	}
	
	public WebElement getAlertOrganization() {
		return alertOrganization;
	}
	
	public WebElement getAlertConfirmBuyBtn() {
		return alertConfirmBuyBtn;
	}
	
	public WebElement getSuccessMessage() {
		return successMessage;
	}
	
	
	
}
