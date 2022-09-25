package com.seleniumInterview;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("URL");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are : " + links.size());

		int brokenlinks = 0;

		for (WebElement element : links) {

			String url = element.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("URL is empty");
				continue;
			}
			URL link = new URL(url);

			try {
				HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
				httpconn.connect();

				if (httpconn.getResponseCode() >= 400) {
					System.out.println(httpconn.getResponseCode() + ":" + url + "->" + "is Broken link");
					brokenlinks++;
				} else {
					System.out.println(httpconn.getResponseCode() + ":" + url + "->" + "is valid link");
				}

			} catch (Exception e) {

			}
			System.out.println("Number of broken links:  " + brokenlinks);
			driver.quit();
		}

	}
}
