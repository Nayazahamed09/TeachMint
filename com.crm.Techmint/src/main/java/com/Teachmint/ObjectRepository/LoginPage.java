package com.Teachmint.ObjectRepository;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Teachmint.genericPackage.JavaUtility;
import com.Teachmint.genericPackage.WebdriverUtility;

public class LoginPage {
	@FindBy(id = ("user-input"))
	private WebElement MobileNumber;
	
	@FindBy(id = ("send-otp-btn-id"))
	private WebElement NextButton;
	
	@FindBy (xpath = "//input[@class='otp-digit-input']")
	private List<WebElement> otpField;
	
	@FindBy(id = "submit-otp-btn-id")
	private WebElement submitOtpButt;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginApplication(WebdriverUtility webUtility, JavaUtility jUtility,WebDriver driver) throws IOException {
		webUtility.waitForExplicity(driver, By.id("user-input"));
		MobileNumber.clear();
		MobileNumber.sendKeys(jUtility.readData("MobileNumber"));
		webUtility.waitForExplicity(driver, NextButton);
		NextButton.click();
		
		driver.findElement(By.xpath("//input[@class='otp-digit-input']")).sendKeys("120992");
//		String otp=jUtility.readData("otp");
//		for(int i=0;i<otpField.size();i++) {
//			otpField.get(i).sendKeys(Character.toString(otp.charAt(i)));
//		}
		webUtility.waitForExplicity(driver, By.id("submit-otp-btn-id"));
		submitOtpButt.click();
		
	}

}
