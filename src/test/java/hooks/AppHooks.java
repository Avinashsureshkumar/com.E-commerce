package hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageFactory.DriverFactory;
import utils.PropertiesReader;

public class AppHooks {

	private WebDriver driver;
	private PropertiesReader p;
	private Properties prop;

	@Before(order = 0)
	public void getproperty() throws IOException {
		p = new PropertiesReader();
		prop = p.init_p(); // Ensure this loads the properties properly
		if (prop == null) {
			throw new IllegalStateException("Properties file could not be loaded.");
		}
		String browser = prop.getProperty("browser");
		System.out.println("Browser from properties: " + browser);
	}

	@Before(order = 1)
	public void launchBrowser() {
		if (prop == null) {
			throw new IllegalStateException(
					"Properties are not initialized. Ensure the properties are loaded correctly.");
		}
		String browser = prop.getProperty("browser");
		if (browser == null) {
			throw new IllegalArgumentException("Browser property not specified in properties file.");
		}
		driver = DriverFactory.createDriver(browser);
	}

	@After(order = 0)
	public void quit() {
		DriverFactory.quitDriver();

	}

	// Screenshot for failed TC
	@After(order = 1)
	public void teardown(Scenario scenario) {
		if (scenario.isFailed()) {
			String name = scenario.getName().replaceAll("", "_");
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", name);

		}

	}

}
