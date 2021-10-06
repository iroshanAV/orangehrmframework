package com.btf.qa.BasicTestFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.btf.qa.pageObjects.LoginPage;
import com.btf.qa.resources.base;

public class CheckLoginUnsuccessfulMessage extends base{
public static Logger Log = LogManager.getLogger(base.class.getName());
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialized");
	}

	
	@Test(dataProvider = "getData")
	public void loginUnsuccessful(String Username, String Password) throws IOException {
		
		driver.get(prop.getProperty("url"));
        
		LoginPage lp = new LoginPage(driver);
		lp.getUsername().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getLogin().click();
		
		
		String expectedM = "Invalid credentials";
		WebElement currentM = lp.getSpanMessage();
		
		if(!currentM.equals(expectedM)) {
		 Log.info("Login failed"+currentM);
		}
		
		Log.info("Login attempt failed");
	}
	
	
	

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2];

		// 1st set of data
		data[0][0] = "Admin";
		data[0][1] = "admin1";
		return data;
	}
	
	
	

	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("You have closed the broswer");
	}
}
