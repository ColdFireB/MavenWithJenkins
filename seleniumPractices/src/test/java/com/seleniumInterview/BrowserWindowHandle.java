package com.seleniumInterview;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("URL");

		String windowID = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));

		Set<String> windowIDs = driver.getWindowHandles();

		// First method - Iterator

		Iterator<String> it = windowIDs.iterator();

		String parentwindowID = it.next();
		System.out.println("Parent window id is:  " + parentwindowID);

		String childwinowID = it.next();
		System.out.println("Child window id is:   " + childwinowID);

		// Second method - Using List
		List<String> windowIDList = new ArrayList(windowIDs);
		String parentWindowID = windowIDList.get(0);
		String childWindowID = windowIDList.get(1);

		System.out.println(parentwindowID);
		System.out.println(childWindowID);

		// switching and get titles of them

		for (String handle : windowIDs) {
			System.out.println(handle);
			driver.switchTo().window(handle).getTitle();
		}

		// close specific browser window
		for (String handle : windowIDs) {
			String title = driver.switchTo().window(handle).getTitle();
			if (title.equals("OrangeW")) {
				driver.close();
			}
		}

	}
}
