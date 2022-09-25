package com.team.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFactory {
	
	private static String value;
	
	private static Properties prop;
	
	private static String readFilePath = "";
	
	private static String writeFilePath = "";
	
	private static File fileRead;
	
	private static File fileWrite;
	
	
	static {
		prop = new Properties();
		fileRead = new File(readFilePath);
		fileWrite = new File(writeFilePath);
	}
	
	public static String readProperties(String key) {
		
		try {
			FileInputStream fileInput = new FileInputStream(fileRead);
			prop.load(fileInput);
			value = prop.getProperty(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	
	public static void writeProperties(String key, String value) {
		try {
			FileOutputStream fileOutput = new FileOutputStream(fileWrite);
			prop.setProperty(key, value);
			prop.store(fileOutput, "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
