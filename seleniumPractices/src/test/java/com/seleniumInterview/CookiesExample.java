package com.seleniumInterview;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("URL");
		// how to capture cookies from browser?
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of cookies  " + cookies.size());

		// how to print cookies from browser
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + "   " + cookie.getValue());
		}

		// how to add cookies
		Cookie cookiobj = new Cookie("firstCookie1", "1234");
		driver.manage().addCookie(cookiobj);

		cookies = driver.manage().getCookies();
		System.out.println("Size of cookies after adding new cookie" + cookies.size());

		// How to delete all cookies from the browser
		driver.manage().deleteAllCookies();

		// get the cookies size after deleted
		cookies = driver.manage().getCookies();
		System.out.println("Size of cookies after deleting : " + cookies.size());

	}
}
