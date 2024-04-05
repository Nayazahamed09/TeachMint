package com.Teachmint.genericPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcelClass {
	
	public HashMap<String, String> hashMapData(String Sheetname,int cell,WebDriver driver) throws EncryptedDocumentException, IOException
	{
		FileInputStream Fis=new FileInputStream(IpathConstants.ExcelData);
		Workbook wb=WorkbookFactory.create(Fis);
		org.apache.poi.ss.usermodel.Sheet S=wb.getSheet(Sheetname);
		int Lastrow=S.getLastRowNum();
		
		HashMap<String, String>map=new HashMap<String, String>(); //empty map
		
		for(int i=0;i<=Lastrow;i++)
		{
			String key=S.getRow(i).getCell(cell).getStringCellValue();
			String Value=S.getRow(i).getCell(cell+1).toString();
			map.put(key, Value);
		}
		for(Entry<String, String> set:map.entrySet())
		{
			javaUtils javapac=new javaUtils();
			driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue()+javapac.getRandomNo());
				}
			return map;
	}
}
