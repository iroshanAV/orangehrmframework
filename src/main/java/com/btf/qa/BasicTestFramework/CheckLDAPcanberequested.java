package com.btf.qa.BasicTestFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.btf.qa.pageObjects.DashboardPage;
import com.btf.qa.pageObjects.LoginPage;
import com.btf.qa.pageObjects.MarketPlace;
import com.btf.qa.resources.base;

public class CheckLDAPcanberequested extends base {
	public static Logger Log = LogManager.getLogger(base.class.getName());
    public WebDriver driver;

	@BeforeClass
	public void settingUpProperties() throws IOException {
		prop1 = getPropertyFromTCLevel(
				"C:\\\\Users\\\\irosh\\\\eclipse-workspace\\\\orangehrmframework\\\\src\\\\main\\\\java\\\\com\\\\btf\\\\qa\\\\BasicTestFramework\\\\basics.properties");
	}
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialized");
	}
	
	
	@Test
	public void CheckLDAPCanbeclicked() throws IOException {
       
		
		driver.get(prop.getProperty("url"));

		LoginPage lp = new LoginPage(driver);
		// Data Driven implemented here
		lp.getUsername().sendKeys(prop1.getProperty("username"));
		lp.getPassword().sendKeys(prop1.getProperty("password"));
		lp.getLogin().click();

		Log.info("Successfully Logged in");
		
		DashboardPage dp = new DashboardPage(driver);
		dp.getMarketPlaceButton().click();
		
		MarketPlace mp = new MarketPlace(driver); 
		mp.getldapButton().click();
		
		//Switching to the alert
		mp.getAlertEmail().sendKeys("aaa@gmail.com");	
		mp.getAlertContactNumber().sendKeys("0111111111");
		mp.getAlertOrganization().sendKeys("AAA");
		mp.getAlertContactNumber().click();
		
		String successM = mp.getSuccessMessage().getText();
		String exSuccessM2 = "OrangeHRM Addons";
		String exSuccessM = "MMMM";
		
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(successM,exSuccessM);
		
		//Assert.assertEquals(successM,exSuccessM);
        Log.info("LDAP Plugin added successfully");
        System.out.println("LDAP Plugin added successfully");
        
        driver.navigate().refresh();

        dp.getMarketPlaceButton().click();
        mp.getTogglButton().click();
        mp.getConFirmModalInstall().click();
        sf.assertEquals(successM,exSuccessM2);
        Log.info("Intergraion with Toggl button cikced");
        System.out.println("Intergraion with Toggl button");
        
      sf.assertAll();

        
        
	}



	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("You have closed the broswer");
	}
	
	
	
}
