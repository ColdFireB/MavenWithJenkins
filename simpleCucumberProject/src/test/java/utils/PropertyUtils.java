package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

	public static Properties propertyLoader(String filePath) {
		Properties prop = new Properties();
		BufferedReader fileio;

		try {
			fileio = new BufferedReader(new FileReader(filePath));
			try {
				prop.load(fileio);
				fileio.close();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("Failed to load properties file " + filePath);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("properties file not found yet at " + filePath);
		}

		return prop;

	}
}
