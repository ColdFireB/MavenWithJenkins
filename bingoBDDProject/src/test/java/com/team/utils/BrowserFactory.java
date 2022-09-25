package com.team.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory implements Browsers{
	
	private WebDriver driver;
	
	public BrowserFactory() {
		initializeDriver();
	}
	
	public void initializeDriver() {
		String driverName = PropertiesFactory.readProperties("browser");
		if(driver == null) {
			switch(driverName) {
			case "Firefox":
				initializeFirefoxDriver();
				break;
			case "Chrome":
				initializeChromeDriver();
				break;
			case "Edge":
				initializeEdgeDriver();
				break;
			default:
				initializeChromeDriver();
				break;
			}
		}
	}

	@Override
	public void initializeChromeDriver() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities desirecap = new DesiredCapabilities();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.merge(desirecap);
		this.driver = new ChromeDriver(chromeOptions);
	}

	@Override
	public void initializeFirefoxDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initializeEdgeDriver() {
		// TODO Auto-generated method stub
		
	}

}
