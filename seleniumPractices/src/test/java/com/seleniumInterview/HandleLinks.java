package com.seleniumInterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("URL");

		// click on the link click
		driver.findElement(By.linkText("Today's deals")).click();
		driver.findElement(By.partialLinkText("Deals")).click();

		// Find Number of links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		// Capture all links
		for (WebElement l : links) {
			System.out.println(l.getText() + "====>" + " " + l.getAttribute("href"));
		}

		for (int i = 0; i < links.size(); i++) {
			WebElement link = links.get(i);
			System.out.println(link.getText() + "====>" + "  " + link.getAttribute("href"));
		}

		// total images on webpage

		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		driver.close();

	}
}
