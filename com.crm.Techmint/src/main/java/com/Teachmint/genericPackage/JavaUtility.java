package com.Teachmint.genericPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaUtility {
	
	public String readData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		 Properties OBJ = new Properties();
		 OBJ.load(fis);
		 String value=OBJ.getProperty(key);
		 return value;
	}
	
	public void refresh() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_R);
	}
}
