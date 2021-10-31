package com.btf.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);


	}

	@FindBy(xpath="//*[@id=\\\"homepage\\\"]/header/div[1]/div/nav/ul/li[4]/a/span")
	private WebElement signin;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/h2")
	private WebElement title;
	
	@FindBy(xpath="//*[@id=\"homepage\"]/header/div[2]/div/nav")
	private WebElement NavBar;
	
		

	public WebElement getLogin() {
		return signin;
	}
	
	public WebElement getTitle() {
		return title;
	}
	
	public WebElement getNavBar() {
		return NavBar;
	}
	
	
}
