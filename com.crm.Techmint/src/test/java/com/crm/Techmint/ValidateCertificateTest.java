package com.crm.Techmint;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Teachmint.ObjectRepository.CertificatesAndDocumentspage;
import com.Teachmint.ObjectRepository.DashBoardPage;
import com.Teachmint.ObjectRepository.GenerateSchoolCertificatePage;
import com.Teachmint.ObjectRepository.LoginPage;
import com.Teachmint.genericPackage.BaseClass;
import com.Teachmint.genericPackage.ExcelClass;

public class ValidateCertificateTest extends BaseClass {
	
	@Test
	public void getIntoApplication() throws IOException, InterruptedException
	{
		LoginPage LP= new LoginPage(driver);
		LP.loginApplication(webUtility, jUti, driver);
		driver.findElement(By.xpath("//div[@class='profile-data-cont']")).click();
		
		Thread.sleep(4000);
		
		Actions A = new Actions(driver);
		A.click().build().perform();
		
		DashBoardPage DP = new DashBoardPage(driver);
		DP.clickOnGenerateCerificateLink();
		CertificatesAndDocumentspage Cp= new CertificatesAndDocumentspage(driver);
		Cp.ClickOnSchoolLeavingCertificate();
		
		driver.findElement(By.xpath("//div[.='Generate']")).click();
		
		GenerateSchoolCertificatePage Gp= new GenerateSchoolCertificatePage(driver);
				Gp.clickOnGenerateLink();
				
			ExcelClass EC= new ExcelClass();
			
		EC.hashMapData("Sheet1", 1, driver);
		
		
	}
	
	

}
