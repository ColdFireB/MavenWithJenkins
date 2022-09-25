package com.seleniumInterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("URL");

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));

		System.out.println("Checkbox size : " + checkboxes.size());

		// for loop
		for (int i = 0; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
			System.out.println("clicked on:" + i);
		}

		// for loop
		for (WebElement ele : checkboxes) {
			ele.click();
		}

		// multiple checkbox size
		for (WebElement ele : checkboxes) {
			String checkName = ele.getAttribute("id");
			System.out.println(checkName);

			if (checkName.equals("Monday") || checkName.equals("Sunday")) {
				ele.click();
			}
		}

		// Select last 2 check boxes
		for (int i = checkboxes.size() - 2; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}

		// select first 2 check boxes
		for (int i = 0; i < checkboxes.size(); i++) {
			if (i < 2) {
				checkboxes.get(i).click();
			}
		}

	}
}
