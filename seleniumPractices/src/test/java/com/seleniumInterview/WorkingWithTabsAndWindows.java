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
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithTabsAndWindows {

	public static void main(String[] args) {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		Proxy p = new Proxy();
		p.setHttpProxy("https://");

		ChromeOptions chop = new ChromeOptions();
		chop.setProxy(p);
		chop.merge(cap);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chop);

		driver.get("url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().window().maximize();

		// Opening new tab using selenium 4 feature
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://facebook.com");

		// Opening new window using selenium 4 feature
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().refresh();
		driver.navigate().to("new url");

		// open link in new tab
		String clickLink = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.linkText("register")).sendKeys(clickLink);

	}
}
