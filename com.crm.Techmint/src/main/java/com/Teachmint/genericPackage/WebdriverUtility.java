package com.Teachmint.genericPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
	public void maxmizetheBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void minimizetheBrowser(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	public void accessApplication(WebDriver driver,String url) {
		driver.get(url);
	}

	public void Implicitlywait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void waitForExplicity(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void waitForExplicity(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
