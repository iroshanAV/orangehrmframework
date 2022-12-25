package com.btf.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	public WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Leave']")
	private WebElement lnkLeaveNavigation;

	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement lnkAdminNavigation;

	@FindBy(xpath = "//span[text()='Time']")
	private WebElement lnkTimeNavigation;

	@FindBy(xpath = "//span[text()='Recruitment']")
	private WebElement lnkRecruitmentNavigation;

	@FindBy(xpath = "//span[text()='My Info']")
	private WebElement lnkMyInfoNavigation;

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement lnkPIMNavigation;

	@FindBy(xpath = "//span[text()='Performance']")
	private WebElement lnkPerformanceNavigation;

	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement lnkDashboardNavigation;

	@FindBy(xpath = "//span[text()='Directory']")
	private WebElement lnkDirectoryNavigation;

	@FindBy(xpath = "//span[text()='Maintanance']")
	private WebElement lnkMaintenanceNavigation;

	@FindBy(xpath = "//span[text()='Buzz']")
	private WebElement lnkBuzzNavigation;
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/span/h6")
	private WebElement lblLeaveHeader;



	public WebElement getlnkLeaveNavigation() {
		return lnkLeaveNavigation;
	}

	public WebElement getlnkAdminNavigation() {
		return lnkAdminNavigation;
	}

	public WebElement getlnkTimeNavigation() {
		return lnkTimeNavigation;
	}

	public WebElement getlnkRecruitmentNavigation() {
		return lnkRecruitmentNavigation;
	}

	public WebElement getlnkMyInfoNavigation() {
		return lnkMyInfoNavigation;
	}

	public WebElement getlnkPIMNavigation() {
		return lnkPIMNavigation;
	}

	public WebElement getlnkPerformanceNavigation() {
		return lnkPerformanceNavigation;
	}

	public WebElement getlnkDashboardNavigation() {
		return lnkDashboardNavigation;
	}

	public WebElement getlnkDirectoryNavigation() {
		return lnkDirectoryNavigation;
	}

	public WebElement getlnkMaintenanceNavigation() {
		return lnkMaintenanceNavigation;
	}

	public WebElement getlnkBuzzNavigation() {
		return lnkBuzzNavigation;
	}
	
	public WebElement getlblLeaveHeader() {
		return lblLeaveHeader;
	}

	
}
