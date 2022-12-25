package com.btf.qa.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.btf.qa.pageObjects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
  
	public WebDriver driver;
	public Properties prop,prop1;
	
	public WebDriver initializeDriver() throws IOException {
	prop = new Properties();
	FileInputStream fis = new FileInputStream("/Users/iroshanvithanage/eclipse-workspace/orangehrmframework/src/main/java/com/btf/qa/resources/data.properties");
		
	prop.load(fis);
	String browserName = prop.getProperty("browser");
	System.out.println("You are executing in "+ browserName);
	
	if(browserName.equals("chrome")) {
		//EXECUTE IN CHROME
		//System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();		
		driver = new ChromeDriver();
	}
	
	else if(browserName.equals("firefox")) {
		//EXECUTE IN FIREFOX	
	}
	
	else if(browserName.equals("IE")) {
		//EXECUTE IN IE
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	}
	
	
	
	//screenshot setting up
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}
	
	
	

	//common login function
     public void login() {  	 	 
 		driver.get(prop.getProperty("url"));
		LoginPage lp = new LoginPage(driver);
		lp.gettxtUsername().sendKeys(prop.getProperty("username"));
		lp.gettxtPassword().sendKeys(prop.getProperty("password"));
		lp.getbtnLogin().click();
		
				
		
	}
	
	
}
