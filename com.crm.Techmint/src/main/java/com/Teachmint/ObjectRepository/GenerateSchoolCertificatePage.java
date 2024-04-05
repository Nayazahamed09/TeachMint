package com.Teachmint.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class GenerateSchoolCertificatePage {
	
	@FindBy(xpath = ("//div[.='Generate']"))
	private WebElement GenerateLink;
	
	public GenerateSchoolCertificatePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getGenerateLink() {
		return GenerateLink;
	}
	
	
	public void clickOnGenerateLink()
	{
		GenerateLink.click();
	}

}
