package com.btf.qa.BasicTestFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.btf.qa.pageObjects.LoginPage;
import com.btf.qa.resources.base;

import junit.framework.Assert;

public class CheckLoginUnsuccessfulMessage extends base {
	public static Logger Log = LogManager.getLogger(base.class.getName());
    public WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialized");
	}

	@Test
	public void loginUnsuccessful() throws IOException {

		driver.get(prop.getProperty("url"));

		LoginPage lp = new LoginPage(driver);
		// Data Driven implemented here
		lp.getUsername().sendKeys("test");
		lp.getPassword().sendKeys("test");
		lp.getLogin().click();

		String expectedM = "Invalid credentialsss";
		String currentM = lp.getSpanMessage().getText();		
		
		Assert.assertEquals(expectedM, currentM);
//		if (!currentM.equals(expectedM)) {
//			Log.info("Login failed" + currentM);
//		}
//
//		Log.info("Login attempt failed");
	}

	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("You have closed the broswer");
	}
}
