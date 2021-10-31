package com.btf.qa.pageObjects;

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
	private WebElement empNameF;
	
	@FindBy(id="assignleave_txtLeaveType")
	private WebElement leaveTypeF;
	
	@FindBy(id="assignleave_txtFromDate")
	private WebElement fromDateF;
	
	@FindBy(id="assignleave_txtToDate")
	private WebElement toDateF;
	
	@FindBy(id="assignleave_txtComment")
	private WebElement commentF;
	
	@FindBy(id="assignleave_duration_duration")
	private WebElement durationF;
	
	@FindBy(id="assignleave_txtFromDate")
	private WebElement calendarF;
	
	@FindBy(id="assignleave_txtToDate")
	private WebElement calendarF1;
	
	@FindBy(id="assignBtn")
	private WebElement assignB;
	

	
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
