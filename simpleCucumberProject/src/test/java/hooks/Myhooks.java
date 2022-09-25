package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import context.TestContext;
import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Myhooks {
	private WebDriver driver;
	private final TestContext context;

	public Myhooks(TestContext context) {
		this.context = new TestContext();
	}

	@Before
	public void before(Scenario scenario) {
		System.out.println(
				"Before: Thread ID: " + Thread.currentThread().getId() + ", " + "Scenario Name: " + scenario.getName());
		driver = DriverFactory.initializeDriver(System.getProperty("browser", "chrome"));
		context.driver = driver;
	}

	@After
	public void after(Scenario scenario) {
		System.out.println(
				"After: Thread ID:" + Thread.currentThread().getId() + ", " + "Scenario Name:  " + scenario.getName());
		if (scenario.isFailed()) {
			attachScreenshot(scenario, scenario.getName());
		}

		driver.quit();
	}

	public void attachScreenshot(Scenario scenario, String scenarioname) {
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenarioname);
	}
}