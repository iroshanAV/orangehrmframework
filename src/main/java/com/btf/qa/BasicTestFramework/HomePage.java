package com.btf.qa.BasicTestFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.btf.qa.pageObjects.LandingPage;
import com.btf.qa.resources.base;

public class HomePage extends base {
	public static Logger Log = LogManager.getLogger(base.class.getName());
	public WebDriver driver;

	
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialized");

		driver.get(prop.getProperty("url"));
	}

	@Test
	public void basePageNavigation() throws IOException {
		
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		Log.info("Featured courses validated");

	}

	@AfterTest
	public void teardown() {
		
		driver.close();
		System.out.println("You have closed the broswer");
	}

}
