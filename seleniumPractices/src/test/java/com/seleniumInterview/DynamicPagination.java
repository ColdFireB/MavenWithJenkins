package com.seleniumInterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicPagination {

	public static void main(String[] args) {

		DesiredCapabilities des = new DesiredCapabilities();
		des.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		FirefoxOptions chop = new FirefoxOptions();
		chop.merge(des);

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(chop);

		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");

		WebElement password = driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");

		driver.findElement(By.xpath("//button[text()='Login']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();

		// Total pages
		String text = driver.findElement(By.xpath("//div[@class='col -sm-6 text-right']")).getText();
		System.out.println(text);

		int total_pages = Integer.valueOf(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));
		System.out.println(total_pages);

		for (int i = 1; i <= 3; i++) {
			WebElement active_page = driver.findElement(By.xpath("//u1[@class='pagination']//li/span"));
			System.out.println("Active page   " + active_page.getText());
			active_page.click();

		}

	}
}
