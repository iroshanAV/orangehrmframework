package com.btf.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEmployeePage {
	public WebDriver driver;

	public AddEmployeePage(WebDriver driver) {
      this.driver = driver;
	}
	
	
	By firstNameF = By.id("firstName");
	By middleNameF = By.id("middleName");
	By lastNameF = By.id("lastName");
	By empIdF = By.id("employeeId");
	By photofileF = By.id("photofile");
	
	
	public WebElement getfirstNameF() {
		return driver.findElement(firstNameF);
	}
	
	public WebElement getmiddleNameF() {
		return driver.findElement(middleNameF);
	}
	
	public WebElement getlastNameF() {
		return driver.findElement(lastNameF);
	}
	
	public WebElement getempIdF() {
		return driver.findElement(empIdF);
	}
	
	public WebElement getphotofileF() {
		return driver.findElement(photofileF);
	}
	
	
	
	
	
	
}
