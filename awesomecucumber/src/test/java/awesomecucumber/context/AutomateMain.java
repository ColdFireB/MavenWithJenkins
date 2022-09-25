package awesomecucumber.context;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateMain {
	public static void main(String[] args) {

		String url = "https://accounts.google.com/";
//Creating an object of ChromeDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		WebElement uname = driver.findElement(By.id("identifierId"));
		uname.clear();
		uname.sendKeys("bala");
		
		WebElement next_user = driver.findElement(By.xpath("//span[text(),'Next']"));
		next_user.click();

		WebElement pass = driver.findElement(By.name("password"));
		pass.clear();
		pass.sendKeys("bala");
		
		WebElement next_onpass = driver.findElement(By.xpath("//span[text(),'Next']"));
		next_onpass.click();

	}
}