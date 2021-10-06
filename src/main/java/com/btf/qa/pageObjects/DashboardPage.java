package com.btf.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	public WebDriver driver;
	
	public DashboardPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	
	@FindBy(xpath="//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[1]/div/a")
	WebElement assignLeaveNavigation;
	
	@FindBy(xpath="//*[@id=\'dashboard-quick-launch-panel-menu_holder\']/table/tbody/tr/td[2]/div/a")
	WebElement leaveListNavigation;
	
	@FindBy(xpath="//*[@id=\\'dashboard-quick-launch-panel-menu_holder\\']/table/tbody/tr/td[3]/div/a")
	WebElement timeSheetsNavigation;
	
	@FindBy(xpath="//*[@id=\\'dashboard-quick-launch-panel-menu_holder\\']/table/tbody/tr/td[4]/div/a")
	WebElement applyLeaveNavigation;
	
	@FindBy(xpath="//*[@id=\'dashboard-quick-launch-panel-menu_holder\']/table/tbody/tr/td[5]/div/a")
	WebElement myLeaveNavigation;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pimNavbar;
	
	@FindBy(id="menu_pim_addEmployee")
	WebElement addEmployee;
	
	@FindBy(xpath="//*[@id=\"assign-leave\"]/div[1]/h1")
	WebElement assignLavePageName;
	
		
	
	
	public WebElement getassignLeaveNavigation() {
		return assignLeaveNavigation;
	}
	
	public WebElement getleaveListNavigation() {
		return leaveListNavigation;
	}
	
	public WebElement gettimeSheetNavigation() {
		return timeSheetsNavigation;
	}
	
	public WebElement getapplyLeaveNavigation() {
		return applyLeaveNavigation;
	}
	
	public WebElement getmyLeaveNavigation() {
		return myLeaveNavigation;
	}
	
	
	public WebElement getassignPageLeaveName() {
		return assignLavePageName;
	}
	
	public WebElement getpimNavbar() {
		return pimNavbar;
	}
	
	public WebElement getaddEmployee() {
		return addEmployee;
	}
	
	
}
