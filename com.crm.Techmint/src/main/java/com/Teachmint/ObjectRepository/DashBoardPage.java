package com.Teachmint.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DashBoardPage {
	
	@ FindBy(xpath = ("//span[@data-qa='icon-cardMembership']"))
	private WebElement GenerateCerificate;
	
	public DashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
		
	}

	public WebElement getGenerateCerificate() {
		return GenerateCerificate;
	}
	
	
	public void clickOnGenerateCerificateLink()
	{
		GenerateCerificate.click();
	}

}
