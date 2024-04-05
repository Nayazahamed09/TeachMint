package com.Teachmint.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertificatesAndDocumentspage {
	
	@FindBy(xpath = ("//h6[.='School leaving certificate']/parent::div[@class='Cards_cardDetails__WsZ-E']"))
	private WebElement SchoolLeavingCertificate;
	
	
	public CertificatesAndDocumentspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}


	public WebElement getSchoolLeavingCertificate() {
		return SchoolLeavingCertificate;
	}
	
	
	public void ClickOnSchoolLeavingCertificate()
	{
		SchoolLeavingCertificate.click();
	}

}
