package com.healthec.provider.generic.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class getData {

	
	public static String fromProperties(String fileName,String key){
		
		String data=null;
		try{
		File f = new File("./appconfig/"+fileName+".properties");
		FileInputStream fis = new FileInputStream(f);
		Properties pro = new Properties();
		pro.load(fis);
		data = pro.getProperty(key);
		}
		catch(Exception e){
			
		}
	   return data;
	}
}
