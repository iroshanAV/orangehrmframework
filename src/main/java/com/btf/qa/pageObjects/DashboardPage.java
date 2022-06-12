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
    private WebElement assignLeaveNavigation;
	
	@FindBy(xpath="//*[@id=\'dashboard-quick-launch-panel-menu_holder\']/table/tbody/tr/td[2]/div/a")
	private WebElement leaveListNavigation;
	
	@FindBy(xpath="//*[@id=\\'dashboard-quick-launch-panel-menu_holder\\']/table/tbody/tr/td[3]/div/a")
	private WebElement timeSheetsNavigation;
	
	@FindBy(xpath="//*[@id=\\'dashboard-quick-launch-panel-menu_holder\\']/table/tbody/tr/td[4]/div/a")
	private WebElement applyLeaveNavigation;
	
	@FindBy(xpath="//*[@id=\'dashboard-quick-launch-panel-menu_holder\']/table/tbody/tr/td[5]/div/a")
	private WebElement myLeaveNavigation;
	
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pimNavbar;
	
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmployee;
	
	@FindBy(xpath="//*[@id=\"assign-leave\"]/div[1]/h1")
	private WebElement assignLavePageName;
	
	@FindBy(id="MP_link" )
	private WebElement marketPageButton;
	
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	private WebElement adminNav;
	
	@FindBy(xpath="//*[@id=\"menu_admin_Qualifications\"]")
	private WebElement qualificationsNav;
	
	@FindBy(xpath="//*[@id=\"recordsListTable\"]/tbody/tr[1]/td[2]")
	private WebElement firstElement;
	
	@FindBy(id="skill_name")
	private WebElement skillName;
	
	@FindBy(id="skill_description")
	private WebElement skillDescription;
	
	@FindBy(id="btnSave")
	private WebElement buttonSave;
	
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
	
	public WebElement getMarketPlaceButton() {
		return marketPageButton;
	}
	
	public WebElement getAdminNav() {
		return adminNav;
	}
	
	public WebElement getQualificationsNav() {
		return qualificationsNav;
	}
	
	public WebElement getFirstElementOfQualificationsNav() {
		return firstElement;
	}
	
	public WebElement getSkillName() {
		return skillName;
	}
	
	public WebElement getSkillDescription() {
		return skillDescription;
	}
	
	public WebElement getButtonSave() {
		return buttonSave;
	}
	
}
