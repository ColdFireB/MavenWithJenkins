package com.seleniumInterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleProxy {

	public static void main(String[] args) throws InterruptedException {

		Proxy p = new Proxy();
		p.setHttpProxy("192.168.5.28:80");

		ChromeOptions options = new ChromeOptions();
		options.setProxy(p);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://demo.nopcommerce.com/");
		System.out.println(driver.getCurrentUrl());
	}
}
