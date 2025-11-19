//package com.qt.sid.bdd.utils;
//
//import java.time.Duration;
//
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class DriverManager {
//
//	private WebDriver driver;
//	private String browserName;
//
//	public DriverManager() {
//		browserName = FileReaderManager.getInstance().getConfigReader().getBrowserName();
//	}
//
//	public WebDriver getDriver() {
//		if (driver == null)
//			driver = createDriver();
//		return driver;
//	}
//
//	private WebDriver createDriver() {
//		switch (browserName) {
//		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			break;
//		case "chrome":
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("---remote-allow-origins=*");
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver(options);
//			break;
//		case "ie":
//			WebDriverManager.iedriver().setup();
//			driver = new InternetExplorerDriver();
//			break;
//		case "edge":
//			WebDriverManager.iedriver().setup();
//			driver = new EdgeDriver();
//			break;
//		}
//
//		if (FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize())
//		  driver.manage().window().maximize();
//
//		  driver.manage().timeouts().implicitlyWait(
//				Duration.ofSeconds(FileReaderManager.getInstance().getConfigReader().getImplicitWaitTime()));
//		return driver;
//	}
//
//	public void quitDriver() {
//		driver.quit();
//	}
//
//}

package com.qt.sid.bdd.utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private WebDriver driver;
	private final String browserName;

	public DriverManager() {
		browserName = FileReaderManager.getInstance().getConfigReader().getBrowserName();
	}

	public WebDriver getDriver() {
		if (driver == null) {
			driver = createDriver();
		}
		return driver;
	}

	private boolean isCI() {
		// GitHub Actions and many CI systems set CI=true in environment
		String ci = System.getenv("CI");
		return ci != null && (ci.equalsIgnoreCase("true") || ci.equalsIgnoreCase("1"));
	}

	private WebDriver createDriver() {
		switch (browserName.toLowerCase()) {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;

			case "chrome":
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = createChromeOptions();
				driver = new ChromeDriver(options);
				break;

			case "ie":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;

			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			default:
				// fallback to chrome if unspecified
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(createChromeOptions());
				break;
		}

		// window size / maximize only if requested and not running headless
		boolean wantMax = FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize();
		if (wantMax && !(isCI())) {
			try {
				driver.manage().window().maximize();
			} catch (Exception ignored) {
				// Some headless/container environments may not support maximize
			}
		}

		driver.manage().timeouts().implicitlyWait(
				Duration.ofSeconds(FileReaderManager.getInstance().getConfigReader().getImplicitWaitTime()));

		return driver;
	}

	private ChromeOptions createChromeOptions() {
		ChromeOptions options = new ChromeOptions();

		// Standard CI-friendly flags
		List<String> args = new ArrayList<>();
		// NOTE: correct argument is two dashes
		args.add("--remote-allow-origins=*");
		args.add("--no-sandbox");
		args.add("--disable-dev-shm-usage");
		args.add("--disable-gpu");
		args.add("--window-size=1920,1080");
		args.add("--disable-extensions");
		args.add("--disable-infobars");

		// Use modern headless when available; fall back to legacy if needed
		if (isCI()) {
			// use "new" headless if available in the environment
			args.add("--headless=new");
		}

		options.addArguments(args);

		// Optional: prevent automation extension if you see warnings
		options.setExperimentalOption("useAutomationExtension", false);

		return options;
	}

	public void quitDriver() {
		if (driver != null) {
			try {
				driver.quit();
			} catch (Exception ignored) {
				// ignore errors during quit
			} finally {
				driver = null;
			}
		}
	}
}
