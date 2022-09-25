package seleniumPractices;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.netty.util.Timeout;

public class SeleniumFirst {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver");
		WebDriver driver = new ChromeDriver();

		WebElement se = driver.findElement(By.linkText("test"));
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Explicitly wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'test')]")));

		// Fluent wait
		FluentWait<WebDriver> wa = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(10)).ignoring(Exception.class);

		WebElement web = wa.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver dr) {
				WebElement element = dr.findElement(By.xpath("//*[@id='softwareTestingMaterial']"));
				String getTextOnPage = element.getText();
				if (getTextOnPage.equals("Software Testing Material - DEMO PAGE")) {
					System.out.println(getTextOnPage);
					return element;
				} else {
					System.out.println("FluentWait Failed");
					return null;
				}
			}
		});

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(44));

		// explicit wait
		WebDriverWait st_wait = new WebDriverWait(driver, Duration.ofSeconds(4));

		WebElement drs = st_wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("test")));

		drs.sendKeys(Keys.SPACE);

		// Fluent wait

		FluentWait<WebDriver> drs_wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(77))
				.pollingEvery(Duration.ofSeconds(34)).ignoring(FileNotFoundException.class);

		WebElement rte = drs_wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				WebElement drt = driver.findElement(By.id(""));
				return drt;
			}
		});

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("//test.xlsx");

		// Files.copy(src, des);

		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(34));

		// explicit wait
		WebDriverWait dest = new WebDriverWait(driver, Duration.ofSeconds(34));

		WebElement drty = dest.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" ")));

		// Fluent wait
		FluentWait<WebDriver> frst = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(34))
				.pollingEvery(Duration.ofSeconds(0)).ignoring(NoSuchElementException.class);

		WebElement frgt = frst.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver t) {
				WebElement fgy = t.findElement(By.id("test"));
				return fgy;
			}
		});

		TakesScreenshot dr = (TakesScreenshot) driver;
		File st = dr.getScreenshotAs(OutputType.FILE);
		File drsf = new File("test");
		FileUtils.copyFile(src, des);

		// byte[] screenshot =
		// ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		// Scenario.attach(screenshot, image/png, filename);

		// move to element
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down
		js.executeScript("window.scrollBy(0, 340)");

		// Scroll into view until element is visible
		js.executeScript("arguments[0].scrollIntoView(true);", By.id(""));

		// Scroll to the bottom
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

		js.executeScript("arguments[0].click();", By.id(" "));

		// move to element using actions class

		Actions tr = new Actions(driver);
		tr.moveToElement(frgt);
		tr.perform();

		// double click on element
		Actions te = new Actions(driver);
		te.doubleClick(frgt).build().perform();

		// Shift+letters
		Actions tr3 = new Actions(driver);
		tr3.keyDown(frgt, Keys.SHIFT);
		tr3.sendKeys("Testing is method");
		tr3.keyUp(Keys.SHIFT);

		Action ac = tr3.build();
		ac.perform();

		driver.switchTo().alert().accept();

		driver.switchTo().alert().dismiss();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(32));

		// Explicit wait

		WebDriverWait dr1 = new WebDriverWait(driver, Duration.ofSeconds(23));

		WebElement dt = dr1.until(ExpectedConditions.visibilityOfElementLocated(By.id("test")));

		// Fluent wait
		FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(23))
				.pollingEvery(Duration.ofSeconds(34)).ignoring(NoSuchElementException.class);

		WebElement fgh = fw.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver t) {
				WebElement tsd = t.findElement(By.id("test"));
				String s = tsd.getText();
				if (s.equals("test")) {
					return tsd;
				}
				return tsd;
			}

		});

		Select desf = new Select(fgh);
		desf.selectByIndex(0);
		fgh.click();

		Actions drfgh = new Actions(driver).moveToElement(fgh).clickAndHold().dragAndDrop(dt, fgh);

		Action ghhj = drfgh.build();

		ghhj.perform();

	}
}
