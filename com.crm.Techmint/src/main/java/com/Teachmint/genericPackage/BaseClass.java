package com.Teachmint.genericPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebdriverUtility webUtility=new WebdriverUtility();
	public WebDriver driver;
	public JavaUtility jUti=new JavaUtility();
	
	@BeforeClass
	public void config_BC() {
		driver=new ChromeDriver();
		webUtility.maxmizetheBrowser(driver);
		webUtility.Implicitlywait(driver);
	}
	
	@BeforeMethod
	public void config_BM() throws IOException {
		webUtility.accessApplication(driver, jUti.readData("url"));
	}
}
