package one;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateMain {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/");
		driver.manage().window().maximize();
		List<WebElement> eles = driver.findElements(By.id("*"));
		
		for(WebElement s : eles)
		{
			System.out.println("Only ID elements" + s.getTagName());
		}
		
		List<WebElement> allele = driver.findElements(By.xpath("//*"));
		
		for(WebElement r: allele)
		{
			
			System.out.println("All the Webelements in page" + r.getTagName());
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElements(By.id("*")));
		driver.quit();
		
		
		js.executeScript("window.scrollBy(0, document.body.ScrollHeight)");
		js.executeScript("window.scrollBy(0,260)");
		
		
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		File rs = sc.getScreenshotAs(OutputType.FILE);
		
		File ds = new File("");
		
		FileUtils.copyFile(rs, ds);
		
		WebElement ele = driver.findElement(By.id("test"));
		
		driver.switchTo().frame(ele);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		
		js.executeScript("arguments[0].scrollIntoView", ele);
		
	}
}