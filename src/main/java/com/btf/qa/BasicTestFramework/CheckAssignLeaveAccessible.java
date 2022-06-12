package com.btf.qa.BasicTestFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.btf.qa.pageObjects.AssignLeavePage;
import com.btf.qa.pageObjects.DashboardPage;
import com.btf.qa.pageObjects.LoginPage;
import com.btf.qa.resources.base;

public class CheckAssignLeaveAccessible extends base {

	public static Logger Log = LogManager.getLogger(base.class.getName());
    public WebDriver driver;



	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialized");
	}

	@Test
	public void checkAssignLeaveWorks() throws InterruptedException {

		login();

		AssignLeavePage alp = new AssignLeavePage(driver);
		// PAGE NAME VERIFICATION
		DashboardPage dp = new DashboardPage(driver);
		dp.getassignLeaveNavigation().click();

		String expectedM = "Assign Leave";
		WebElement currentM = dp.getassignPageLeaveName();

		if (currentM.equals(expectedM)) {
			System.out.println("Navigated to AssignLave page");
		} else {
			System.out.println("Something went wrong");
		}

		Log.info("Started filling the form");

		// FIND ASSIGN LEAVES ELEMENTS
		Log.info("Entered name");
		alp.getempNameF().sendKeys("Lisa Andrews");
		Thread.sleep(40);

		// STATIC DROPDOWN
		Log.info("Entered leave type");
		WebElement sleaveType = alp.leaveTypeF();
		Select sleaveTypeDrop = new Select(sleaveType);
		sleaveTypeDrop.selectByIndex(3);
		Thread.sleep(40);

		// FROM DATE PICKER
		Log.info("Entered from date");
		alp.getfromDateF().clear();
		alp.getfromDateF().sendKeys("2021-08-12");
		alp.getCalendarF().click();
		Thread.sleep(8000);

		// TO DATE PICKER
		Log.info("Entered to date");
		alp.gettoDateF().clear();
		alp.gettoDateF().sendKeys("2021-08-12");
		alp.getCalendarF1().click();
		Thread.sleep(8000);

		// DURATION DROPDOWN
		Log.info("Entered duration");
		WebElement durationType = alp.getDurationF();
		Select durationTypeS = new Select(durationType);
		durationTypeS.selectByIndex(0);
		Thread.sleep(8000);

		// COMMENT
		Log.info("Entered comment");
		alp.getcommentF().sendKeys("Give her a break");
		Thread.sleep(40);

		// ASSIGN BUTTON CLICK
		Log.info("Entered Assign Button");
		alp.getassignB().click();
		System.out.println("Leave Assigned");
		Thread.sleep(8000);

	}

	

	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("You have closed the broswer");
	}

}
