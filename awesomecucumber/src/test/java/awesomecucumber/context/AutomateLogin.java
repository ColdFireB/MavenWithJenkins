package awesomecucumber.context;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateLogin {

	 WebDriver driver=null;
	
	WebElement uname = 	driver.findElement(By.id("identifierId"));
	WebElement next_user = driver.findElement(By.xpath("span[text()='Next']"));
	private WebElement pass = driver.findElement(By.name("password"));
	private WebElement next_onpass = driver.findElement(By.xpath("span[text()='Next']"));
	
	public void launchApplication(WebDriver driver, String url) {
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void enterUsernameAndNext(WebDriver driver, String username) {
		uname.clear();
		uname.sendKeys(username);	
		next_user.click();
	}
	
	public void enterPasswordAndNavigate(WebDriver driver, String password) {
		pass.clear();
		pass.sendKeys(password);
		next_onpass.click();
	}
	
	public static void main(String[] args) {
		String url = "https://accounts.google.com/";
		 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		AutomateLogin auto = new AutomateLogin();
		auto.launchApplication(driver, url);
		auto.enterUsernameAndNext(driver, "balaece1991@gmail.com");
		auto.enterPasswordAndNavigate(driver, "welcome@123");
	}
}