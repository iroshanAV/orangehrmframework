package com.btf.qa.BasicTestFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.btf.qa.pageObjects.AssignLeavePage;
import com.btf.qa.pageObjects.DashboardPage;
import com.btf.qa.pageObjects.LoginPage;
import com.btf.qa.resources.base;

public class CheckAssignLeaveAccessible extends base {
	
public static Logger Log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialized");
	}

	

	
	@Test(dataProvider = "getData")
	public void checkAssignLeaveWorks(String Username, String Password) throws InterruptedException {
		
	   driver.get(prop.getProperty("url"));
        AssignLeavePage alp = new AssignLeavePage(driver); 
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getLogin().click();
		
		Log.info("Successfully Logged in");			
		
		
		DashboardPage dp = new DashboardPage(driver);
		dp.getassignLeaveNavigation().click();
		
		String expectedM ="Assign Leave";
		WebElement currentM = dp.getassignPageLeaveName();
		
		if(currentM.equals(expectedM)) {
			System.out.println("Navigated to AssignLave page");
		}else {
			System.out.println("Something went wrong");
		}
		
		
		
		
		
		//FIND ASSIGN LEAVES ELEMENTS
		alp.getempNameF().sendKeys("Lisa Adams");
		
		
		//STATIC DROPDOWN
		WebElement sleaveType = alp.leaveTypeF();
		Select sleaveTypeDrop = new Select(sleaveType); 
		sleaveTypeDrop.selectByIndex(3);
		
		
		
		
	}
	
	

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2];

		// 1st set of data
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		return data;
	}
	
	
	

	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("You have closed the broswer");
	}
	
}
