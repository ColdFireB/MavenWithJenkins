package com.seleniumInterview;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitEx1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("URL");

		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(23))
				.pollingEvery(Duration.ofSeconds(32)).ignoring(NoSuchElementException.class);

		WebElement s = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver input) {
				// TODO Auto-generated method stub
				return null;
			}

		});

		s.click();

	}

}
