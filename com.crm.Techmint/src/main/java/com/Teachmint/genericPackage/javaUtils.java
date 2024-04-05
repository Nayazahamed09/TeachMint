package com.Teachmint.genericPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class javaUtils  {
	
	/*
	 * this method is used to generate random Number
	 */
	
	public int getRandomNo()
	{
		Random R=new Random();
		
		int random=R.nextInt(100);
		return random;
		
				
	}
	
	/*
	 * this method is used to get the SystemDate
	 */
	
	public String getSystemDate() {
		Date D=new Date();
		
		String Date=D.toString();
		return Date;
	}
	
	/*
	 * this method is used to get the SystemDateFormat
	 */
	public String getSystemdateFormat() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-/MM/yyyy  HH-mm-ss");
		Date D=new Date();
		 
		String SystemDateFormat = dateFormat.format(D);
		return SystemDateFormat;
	}

	
	}

