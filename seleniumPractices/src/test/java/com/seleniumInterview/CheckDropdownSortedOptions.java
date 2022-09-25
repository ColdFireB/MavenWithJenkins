package com.seleniumInterview;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropdownSortedOptions {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("URL");

		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();

		WebElement drpElement = driver.findElement(By.name("Category_id"));
		Select drpSelect = new Select(drpElement);

		List<WebElement> options = drpSelect.getOptions();

		ArrayList<String> originalList = new ArrayList<String>();
		ArrayList<String> tempList = new ArrayList<String>();

		for (WebElement option : options) {
			originalList.add(option.getText());
			tempList.add(option.getText());
		}

		System.out.println("this is originalList before Sorting:  " + originalList);
		System.out.println("this is originalList before Sorting:  " + tempList);

		Collections.sort(tempList);

		System.out.println("this is originalList after Sorting:  " + originalList);
		System.out.println("this is templist after Sorting:  " + tempList);

		if (originalList.equals(tempList)) {
			System.out.println("Drop down sorted");
		}

		else {
			System.out.println("Dropdown not sorted");
		}
		driver.close();
	}
}
