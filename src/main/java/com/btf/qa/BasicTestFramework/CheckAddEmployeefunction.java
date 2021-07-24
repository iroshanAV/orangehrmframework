package com.btf.qa.BasicTestFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.btf.qa.pageObjects.AddEmployeePage;
import com.btf.qa.pageObjects.AssignLeavePage;
import com.btf.qa.pageObjects.DashboardPage;
import com.btf.qa.pageObjects.LoginPage;
import com.btf.qa.resources.base;

public class CheckAddEmployeefunction extends base {
	public static Logger Log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialized");
	}
	
	

	@Test(dataProvider = "getData")
	public void checkAssignLeaveWorks(String Username, String Password) throws InterruptedException {
		
		//LOGGINS
	    driver.get(prop.getProperty("url"));
        AssignLeavePage alp = new AssignLeavePage(driver); 
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getLogin().click();
		
		System.out.println("Successfully Logged in");
		Log.info("Successfully Logged in");			
		
		DashboardPage dp = new DashboardPage(driver);
		dp.getpimNavbar().click();
		dp.getaddEmployee().click();
		
		
		
		//ENTER LOGIN DETAILS
		AddEmployeePage aep = new AddEmployeePage(driver);
	    aep.getfirstNameF().sendKeys("Jasonaa");
		aep.getmiddleNameF().sendKeys("Jamesaa");
		aep.getlastNameF().sendKeys("Smithaa");
		
		aep.getphotofileF().sendKeys("F:\\Projects\\samples\\smile.jpg");
		aep.getcreateLoginCheckBox().click();
        aep.getuserNameF().sendKeys("JasonJSaa");
        aep.getpasswordF().sendKeys("password123");
        aep.getconfirmPasswordF().sendKeys("password123");
        aep.getsaveButton().click();
        
        System.out.println("User successfuly created");
		Log.info("User successfuly created");
		
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
