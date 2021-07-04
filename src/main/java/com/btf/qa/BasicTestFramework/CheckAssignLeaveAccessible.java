package com.btf.qa.BasicTestFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
	public void loginSuccess(String Username, String Password) throws IOException {
		
		driver.get(prop.getProperty("url"));
        
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getLogin().click();
		
		Log.info("Successfully Logged in");
	}
	
	
	@Test
	public void checkAssignLeaveWorks() {
		DashboardPage dp = new DashboardPage(driver);
		dp.getassignLeaveNavigation();
		System.out.println("Navigated to AssignLave page");
		
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
