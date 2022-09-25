package com.seleniumInterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("URL");

		driver.findElement(By.xpath("\\tagname[@attribute='value']"));

		driver.findElement(By.name("q")).sendKeys("Selenium");

		List<WebElement> list = driver.findElements(By.xpath("//li[@class='test']//span"));
		System.out.println("Size of Elements:  " + list.size());

		for (WebElement item : list) {
			if (item.getText().equals("Selenium")) {
				item.click();
				break;
			}
		}

	}

}
