package com.btf.qa.BasicTestFramework;

import java.io.IOException;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.btf.qa.pageObjects.AddEmployeePage;
import com.btf.qa.pageObjects.AssignLeavePage;
import com.btf.qa.pageObjects.DashboardPage;
import com.btf.qa.pageObjects.LoginPage;
import com.btf.qa.resources.base;



public class CheckAddEmployeefunction extends base {
	public static Logger Log = LogManager.getLogger(base.class.getName());
	public WebDriver driver;


	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialized");
	}

	// Check whether empty user details gives an error
	@Test(priority = 1)
	public void checkEmptyAssignLeaveErrors() {
		// LOGGINS

		Log.info("Successfully Logged in");
		login();
		DashboardPage dp = new DashboardPage(driver);
		dp.getpimNavbar().click();
		dp.getaddEmployee().click();

		// ENTER LOGIN DETAILS
		AddEmployeePage aep = new AddEmployeePage(driver);
		aep.getsaveButton().click();
		
		//Check required message
		String requiredSpan = aep.getSpanRequiredMessage().getText();
		
		if(requiredSpan.equals("Required")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
	}

	
	
	
	// Check whether correct user details helps to log in
	@Test(priority = 2)
	public void checkAddEmployeeWorks() throws InterruptedException {

//		// LOGGINS
		login();
		DashboardPage dp = new DashboardPage(driver);
		dp.getpimNavbar().click();
		dp.getaddEmployee().click();

		// ENTER LOGIN DETAILS
		AddEmployeePage aep = new AddEmployeePage(driver);
		aep.getfirstNameF().sendKeys("JasonJSa");
		aep.getmiddleNameF().sendKeys("Jamesaa");
		aep.getlastNameF().sendKeys("Smithaa");

		aep.getphotofileF().sendKeys("F:\\Projects\\samples\\smile.jpg");
		aep.getcreateLoginCheckBox().click();

		// CREATE USIQUE USERNAME BASED ON DATE AND TIME
		Date d = new Date(System.currentTimeMillis());
		aep.getuserNameF().sendKeys("JasonJSa " + d);
		aep.getpasswordF().sendKeys("password123");
		aep.getconfirmPasswordF().sendKeys("password123");
		aep.getsaveButton().click();

		System.out.println("User successfuly created");
		Log.info("User successfuly created");

		String currentProfileName = aep.getprofileName().getText();
		String expectedProfileName = "JasonJSa " + d;
		System.out.println(currentProfileName);
		System.out.println(expectedProfileName);

		if (currentProfileName.contains(expectedProfileName)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}

	}



	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("You have closed the broswer");
	}

}
