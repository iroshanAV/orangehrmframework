package com.btf.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

	public WebDriver driver;
	
	public DashboardPage (WebDriver driver) {
		this.driver = driver;
	}
	
	By assignLeaveNavigation = By.xpath("//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[1]/div/a");
	By leaveListNavigation = By.xpath("//*[@id=\'dashboard-quick-launch-panel-menu_holder\']/table/tbody/tr/td[2]/div/a");
	By timeSheetsNavigation = By.xpath("//*[@id=\'dashboard-quick-launch-panel-menu_holder\']/table/tbody/tr/td[3]/div/a");
	By applyLeaveNavigation = By.xpath("//*[@id=\'dashboard-quick-launch-panel-menu_holder\']/table/tbody/tr/td[4]/div/a");
	By myLeaveNavigation = By.xpath("//*[@id=\'dashboard-quick-launch-panel-menu_holder\']/table/tbody/tr/td[5]/div/a");
	
	
	By assignLavePageName = By.xpath("//*[@id=\"assign-leave\"]/div[1]/h1");
	
	
	
	public WebElement getassignLeaveNavigation() {
		return driver.findElement(assignLeaveNavigation);
	}
	
	public WebElement getleaveListNavigation() {
		return driver.findElement(leaveListNavigation);
	}
	
	public WebElement gettimeSheetNavigation() {
		return driver.findElement(timeSheetsNavigation);
	}
	
	public WebElement getapplyLeaveNavigation() {
		return driver.findElement(applyLeaveNavigation);
	}
	
	public WebElement getmyLeaveNavigation() {
		return driver.findElement(myLeaveNavigation);
	}
	
	
	public WebElement getassignPageLeaveName() {
		return driver.findElement(assignLavePageName);
	}
	
}
