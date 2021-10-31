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
    private WebElement firstNameF;
	
	@FindBy(id="middleName")
	private WebElement middleNameF;
	
	@FindBy(id="lastName")
	private WebElement lastNameF;
	
	@FindBy(id="employeeId")
	private WebElement empIdF;
	
	@FindBy(id="photofile")
	private WebElement photofileF;
	
	@FindBy(id="chkLogin")
	private WebElement createLoginCheckBox;
	
	@FindBy(id="user_name")
	private WebElement userNameF;
	
	@FindBy(id="user_password")
	private WebElement passwordF;
	
	@FindBy(id="re_password")
	private WebElement confirmPasswordF;
	
	@FindBy(id="status")
	private WebElement statusF;
	
	@FindBy(id="btnSave")
	private WebElement saveButton;
	
	
	@FindBy(xpath ="//div[@id='profile-pic']/h1")
	private WebElement profileName;
	
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
	
	public WebElement getprofileName() {
		return profileName;
	}

}
