package com.btf.qa.BasicTestFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.btf.qa.resources.base;

public class CheckLoginSuccess extends base {
	public static Logger Log = LogManager.getLogger(base.class.getName());
    public WebDriver driver;


	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialized");
	}

	@Test
	public void loginSuccess() throws IOException {
		//Login
		login();
		Log.info("Successfully Logged in");
	}



	@AfterMethod
	public void teardown() {
		driver.quit();
		System.out.println("You have closed the broswer");
	}
}
