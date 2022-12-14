package com.seleniumInterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrame_inner {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("URL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame(0);
		driver.switchTo().frame("FrameName");

		System.out.println(driver.findElement(By.xpath("//h1")).getText());

		driver.switchTo().parentFrame();

		// 2nd class
		WebElement outerFrame = driver.findElement(By.xpath("//*[@id='Multiple']/iFrame"));
		driver.switchTo().frame(outerFrame);

		WebElement innerFrame = driver.findElement(By.xpath("some xpath"));
		driver.switchTo().frame(innerFrame);

		driver.switchTo().defaultContent();

		// How to switch between the frames
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium"));
		driver.switchTo().defaultContent();

		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("2nd frame link"));
		driver.switchTo().defaultContent();

		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//a[text()='Index']"));

	}
}
