package com.btf.qa.BasicTestFramework;

import java.io.IOException;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.btf.qa.pageObjects.DashboardPage;
import com.btf.qa.pageObjects.PIMPage;
import com.btf.qa.resources.base;

public class CheckAddEmployeefunction extends base {
	public static Logger Log = LogManager.getLogger(base.class.getName());
	public WebDriver driver;

	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialized");
	}

	// Check whether empty user details gives an error
	@Test(priority = 0)
	public void checkEmptyAssignLeaveErrors() {
		// LOGGINS

		Log.info("Successfully Logged in");
		login();
		DashboardPage dp = new DashboardPage(driver);
		PIMPage pp = new PIMPage(driver);
		
		dp.getlnkPIMNavigation().click();
		pp.getbtnAddEmployee().click();

		// ENTER LOGIN DETAILS
		pp.getbtnSave().click();

		// Check required message
		String requiredSpan = pp.getlblRequiredTag().getText();

		if (requiredSpan.equals("Required")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	// Check whether correct user details helps to log in
	@Test(priority = 1)
	public void checkAddEmployeeWorks() throws InterruptedException {

		// LOGGINS
		login();
		DashboardPage dp = new DashboardPage(driver);
		PIMPage pp = new PIMPage(driver);
		
		dp.getlnkPIMNavigation().click();
		pp.getbtnAddEmployee().click();

		// ENTER LOGIN DETAILS
		pp.gettxtFirstName().sendKeys("JasonJSa");
		pp.gettxtMiddleName().sendKeys("Jamesaa");
		pp.gettxtLastName().sendKeys("Smithaa");

		pp.getbtnProfilePicture().sendKeys("F:\\Projects\\samples\\smile.jpg");
		pp.getchkCreateLogin().click();

		// CREATE USIQUE USERNAME BASED ON DATE AND TIME
		Date d = new Date(System.currentTimeMillis());
		pp.gettxtUserName().sendKeys("JasonJSa " + d);
		pp.gettxtPassword().sendKeys("123456789Abc?");
		pp.gettxtConfirmPassword().sendKeys("123456789Abc?");
		pp.getrdBtnstatus().click();

		System.out.println("User successfuly created");
		Log.info("User successfuly created");

		String currentProfileName = pp.getprofileName().getText();
		String expectedProfileName = "JasonJSa " + d;
		System.out.println(currentProfileName);
		System.out.println(expectedProfileName);

		if (currentProfileName.contains(expectedProfileName)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
		System.out.println("You have closed the broswer");
	}

}
