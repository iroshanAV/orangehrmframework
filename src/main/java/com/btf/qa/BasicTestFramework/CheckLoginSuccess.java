package com.btf.qa.BasicTestFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.btf.qa.pageObjects.LoginPage;
import com.btf.qa.resources.base;

public class CheckLoginSuccess extends base {
	public static Logger Log = LogManager.getLogger(base.class.getName());
    public WebDriver driver;


	@BeforeTest
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



	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("You have closed the broswer");
	}
}
