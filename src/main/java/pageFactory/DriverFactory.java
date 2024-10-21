package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory{
	
	 // ThreadLocal to handle parallel execution safely
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // Method to initialize WebDriver based on the browser name
    public static WebDriver createDriver(String browser) {
    	System.out.println(browser);
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup(); // Setup ChromeDriver with WebDriverManager
                driver.set(new ChromeDriver());
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup(); // Setup FirefoxDriver with WebDriverManager
                driver.set(new FirefoxDriver());
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver.set(new EdgeDriver());
                break;
            
            default:
                throw new IllegalArgumentException("Browser " + browser + " not supported.");
        }

        // Maximize the browser window
        driver.get().manage().window().maximize();

        return driver.get();
    }

    // Method to get the WebDriver instance
    public static WebDriver getDriver() {
        return driver.get();
    }

    // Method to close the WebDriver instance
    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
	
	
	
	
	
	
	
	
	
	
}