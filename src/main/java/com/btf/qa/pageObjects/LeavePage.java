package com.btf.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {

	public WebDriver driver;

	public LeavePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//header/div[2]/nav/ul/li[6]/a")
	private WebElement btnLeavList;

	@FindBy(xpath = "//header/div[2]/nav/ul/li[1]/a")
	private WebElement btnApply;

	@FindBy(xpath = "//header/div[2]/nav/ul/li[2]/a")
	private WebElement btnMyLeave;

	@FindBy(xpath = "//header/div[2]/nav/ul/li[7]/a")
	private WebElement btnAssignLeave;

	@FindBy(id = "spanMessage")
	private WebElement spanMessage;

	public WebElement getbtnLeavList() {
		return btnLeavList;
	}

	public WebElement getbtnApply() {
		return btnApply;
	}

	public WebElement getbtnMyLeave() {
		return btnMyLeave;
	}

	public WebElement getbtnAssignLeave() {
		return btnAssignLeave;
	}

//	public WebElement getUsername() {
//		return username;
//	}
//
//	public WebElement getPassword() {
//		return password;
//	}
//
//	public WebElement getLogin() {
//		return login;
//	}

	public WebElement getSpanMessage() {
		return spanMessage;
	}

}
