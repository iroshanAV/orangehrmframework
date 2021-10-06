package com.btf.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignLeavePage {
public WebDriver driver;
	
	public AssignLeavePage (WebDriver driver) {
		this.driver = driver;
	}
	
	By empNameF = By.id("assignleave_txtEmployee_empName");
	By leaveTypeF = By.id("assignleave_txtLeaveType");
	By fromDateF = By.id("assignleave_txtFromDate");
	By toDateF   = By.id("assignleave_txtToDate");
	By commentF = By.id("assignleave_txtComment");
	By durationF = By.id("assignleave_duration_duration");	
	By calendarF = By.xpath("//*[@id=\"frmLeaveApply\"]/fieldset/ol/li[4]/img");
	By calendarF1 = By.xpath("//*[@id=\"frmLeaveApply\"]/fieldset/ol/li[5]/img"); 
	
	
	
	By assignB = By.id("assignBtn");
	
	public WebElement getempNameF() {
		return driver.findElement(empNameF);
	}
	
	public WebElement leaveTypeF() {
		return driver.findElement(leaveTypeF);
	}
	
	public WebElement getfromDateF() {
		return driver.findElement(fromDateF);
	}
	
	public WebElement gettoDateF() {
		return driver.findElement(toDateF);
	}
	
	public WebElement getcommentF() {
		return driver.findElement(commentF);
	}
	
	public WebElement getassignB() {
		return driver.findElement(assignB);
	}
	
	public WebElement getDurationF() {
		return driver.findElement(durationF);
	}
	
	public WebElement getCalendarF() {
		return driver.findElement(calendarF);
	}
	
	public WebElement getCalendarF1() {
		return driver.findElement(calendarF1);
	}
}
