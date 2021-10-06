package com.btf.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignLeavePage {
public WebDriver driver;
	
	public AssignLeavePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="assignleave_txtEmployee_empName")
	WebElement empNameF;
	
	@FindBy(id="assignleave_txtLeaveType")
	WebElement leaveTypeF;
	
	@FindBy(id="assignleave_txtFromDate")
	WebElement fromDateF;
	
	@FindBy(id="assignleave_txtToDate")
	WebElement toDateF;
	
	@FindBy(id="assignleave_txtComment")
	WebElement commentF;
	
	@FindBy(id="assignleave_duration_duration")
	WebElement durationF;
	
	@FindBy(xpath="//*[@id=\\\"frmLeaveApply\\\"]/fieldset/ol/li[4]/img")
	WebElement calendarF;
	
	@FindBy(id="//*[@id=\\\"frmLeaveApply\\\"]/fieldset/ol/li[5]/img")
	WebElement calendarF1;
	
	@FindBy(id="assignBtn")
	WebElement assignB;
	

	
	public WebElement getempNameF() {
		return empNameF;
	}
	
	public WebElement leaveTypeF() {
		return leaveTypeF;
	}
	
	public WebElement getfromDateF() {
		return fromDateF;
	}
	
	public WebElement gettoDateF() {
		return toDateF;
	}
	
	public WebElement getcommentF() {
		return commentF;
	}
	
	public WebElement getassignB() {
		return assignB;
	}
	
	public WebElement getDurationF() {
		return durationF;
	}
	
	public WebElement getCalendarF() {
		return calendarF;
	}
	
	public WebElement getCalendarF1() {
		return calendarF1;
	}
}
