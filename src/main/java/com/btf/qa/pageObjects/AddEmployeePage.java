package com.btf.qa.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {
	public WebDriver driver;

	public AddEmployeePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

		
	}
	
	@FindBy(id="firstName")
    WebElement firstNameF;
	
	@FindBy(id="middleName")
	WebElement middleNameF;
	
	@FindBy(id="lastName")
	WebElement lastNameF;
	
	@FindBy(id="employeeId")
	WebElement empIdF;
	
	@FindBy(id="photofile")
	WebElement photofileF;
	
	@FindBy(id="chkLogin")
	WebElement createLoginCheckBox;
	
	@FindBy(id="user_name")
	WebElement userNameF;
	
	@FindBy(id="user_password")
	WebElement passwordF;
	
	@FindBy(id="re_password")
	WebElement confirmPasswordF;
	
	@FindBy(id="status")
	WebElement statusF;
	
	@FindBy(id="btnSave")
	WebElement saveButton;
	
//	By firstNameF = By.id("firstName");


//	public WebElement getfirstNameF() {
//		return driver.findElement(firstNameF);
//	}

	public WebElement getfirstNameF() {
		return firstNameF;
	}
	
	public WebElement getmiddleNameF() {
		return middleNameF;
	}

	public WebElement getlastNameF() {
		return lastNameF;
	}

	public WebElement getempIdF() {
		return empIdF;
	}

	public WebElement getphotofileF() {
		return photofileF;
	}

	public WebElement getcreateLoginCheckBox() {
		return createLoginCheckBox;
	}

	public WebElement getuserNameF() {
		return userNameF;
	}

	public WebElement getpasswordF() {
		return passwordF;
	}

	public WebElement getconfirmPasswordF() {
		return confirmPasswordF;
	}

	public WebElement getstatusF() {
		return statusF;
	}

	public WebElement getsaveButton() {
		return saveButton;
	}

}
