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

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("URL");

		WebElement dropdown = driver.findElement(By.id("countryDropDown"));
		Select drpcountry = new Select(dropdown);

		drpcountry.selectByVisibleText("United States");

		drpcountry.selectByValue("222");

		drpcountry.selectByIndex(10);

		int size = drpcountry.getOptions().size();
		System.out.println("Number pf cpuntry options:  " + size);

		List<WebElement> alloptions = drpcountry.getOptions();

		for (WebElement option : alloptions) {
			if (option.getText().equals("Canada")) {
				option.click();
				break;
			}
		}

	}
}
