package com.btf.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {
	public WebDriver driver;
	
	public PIMPage(WebDriver driver) {
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
	
	
	
	 //  Page Object Model pattern 	
	  //	By firstNameF = By.id("firstName");

	  //	public WebElement getfirstNameF() {
	  //		return driver.findElement(firstNameF);
	  //	}
		
		

	    //  Page Factory Model Pattern	
	
	    // AddEmployee page related objects
		@FindBy(xpath = "//form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")
	    private WebElement txtFirstName;
		
		@FindBy(xpath = "//form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")
		private WebElement txtMiddleName;
		
		@FindBy(xpath = "//form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")
		private WebElement txtLastName;
		
		@FindBy(xpath = "//form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
		private WebElement txtEmpID;
		
		@FindBy(xpath = "//form/div[1]/div[1]/div/div[2]/div/button")
		private WebElement btnProfilePicture;
		
		@FindBy(xpath = "//form/div[1]/div[2]/div[2]/div/label/span")
		private WebElement chkCreateLogin;
		
		@FindBy(xpath = "//form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")
		private WebElement txtUserName;
		
		@FindBy(xpath = "//form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")
		private WebElement txtPassword;
		
		@FindBy(xpath = "//form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")
		private WebElement txtConfirmPassword;
		
		@FindBy(xpath = "//form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div/label/span")
		private WebElement rdBtnStatus;
		
		@FindBy(xpath = "//form/div[2]/button[2]")
		private WebElement btnSave;
		
		@FindBy(xpath = "p[text()='Successfully Saved']")
		private WebElement lblSavePopup;
		
		@FindBy(xpath ="//div[@id='profile-pic']/h1")
		private WebElement profileName;
		
		@FindBy(xpath = "//span[text()='Required']")
		private WebElement lblRequiredSpanTag;
	    	
		@FindBy(xpath = "//li/a[text()='Add Employee']")
		private WebElement btnAddEmployee; 


		public WebElement gettxtFirstName() {
			return txtFirstName;
		}
		
		public WebElement gettxtMiddleName() {
			return txtMiddleName;
		}

		public WebElement gettxtLastName() {
			return txtLastName;
		}

		public WebElement gettxtEmpId() {
			return txtEmpID;
		}

		public WebElement getbtnProfilePicture() {
			return btnProfilePicture;
		}

		public WebElement getchkCreateLogin() {
			return chkCreateLogin;
		}

		public WebElement gettxtUserName() {
			return txtUserName;
		}

		public WebElement gettxtPassword() {
			return txtPassword;
		}

		public WebElement gettxtConfirmPassword() {
			return txtConfirmPassword;
		}

		public WebElement getrdBtnstatus() {
			return rdBtnStatus;
		}

		public WebElement getbtnSave() {
			return btnSave;
		}
		
		public WebElement getprofileName() {
			return profileName;
		}
		
		public WebElement getlblRequiredTag() {
			return lblRequiredSpanTag;
		}
	
	public WebElement getbtnAddEmployee() {
		return btnAddEmployee;
	}

}
