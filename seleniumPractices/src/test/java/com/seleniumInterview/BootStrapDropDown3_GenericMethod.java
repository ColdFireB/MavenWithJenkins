package com.seleniumInterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown3_GenericMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("URL");

		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		List<WebElement> prodTypes = driver.findElements(By.xpath("//u1[@class='dropdown1 dropdown-menu']//li"));
		System.out.println("Number of options:" + prodTypes.size());
		selectOptionFromDropDown(prodTypes, "Accounts");

		driver.findElement(By.xpath("//div[@class='dp2']//div[@class='dropdown']")).click();
		List<WebElement> products = driver
				.findElements(By.xpath("//div[@class='drp2']//div[@class='dropdown open']//li"));
		System.out.println("Number of options:" + products.size());
		selectOptionFromDropDown(products, "Salary accounts");
	}

	public static void selectOptionFromDropDown(List<WebElement> options, String value) {
		for (WebElement ele : options) {
			if (ele.getText().equals(value)) {
				ele.click();
				break;
			}
		}
	}

}
