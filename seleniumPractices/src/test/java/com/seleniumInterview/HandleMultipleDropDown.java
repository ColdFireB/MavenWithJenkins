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

public class HandleMultipleDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("URL");
		driver.getPageSource();

		WebElement noOfEmpDrop = driver.findElement(By.xpath("//select[@id=Form_submitForm_NoOfEmployees]"));
		WebElement industryDrop = driver.findElement(By.xpath("//select[@id='Form_submitform_Industry']"));
		WebElement countryDrop = driver.findElement(By.xpath("//select[@id='Form_submitform_Industry']"));

		WebElement s = null;

		Select selectDrop = new Select(s);

		List<WebElement> options = selectDrop.getOptions();

		for (WebElement ele : options) {
			if (ele.getText().equals("test")) {
				ele.click();
			}
		}

	}

}
