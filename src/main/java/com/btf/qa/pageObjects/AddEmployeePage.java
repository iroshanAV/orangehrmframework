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
	By createLoginCheckBox = By.id("chkLogin");
	By userNameF = By.id("user_name");
	By passwordF = By.id("user_password");
	By confirmPasswordF = By.id("re_password");
	By statusF  = By.id("status");
	
	
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
	
	public WebElement getcreateLoginCheckBox() {
		return driver.findElement(createLoginCheckBox);
	}
	
	public WebElement getuserNameF() {
		return driver.findElement(userNameF);
	}
	
	public WebElement getpasswordF() {
		return driver.findElement(passwordF);
	}
	
	public WebElement getconfirmPasswordF() {
		return driver.findElement(confirmPasswordF);
	}
	
	public WebElement getstatusF() {
		return driver.findElement(statusF);
	}
	
	
	
	
}
