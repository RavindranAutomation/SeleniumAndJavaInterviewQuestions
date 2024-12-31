package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DifferetWaysToMaximizeBrowserWindow {

	// 1. Using maximize method
	// 2. Use of Dimension(Selenium) and driver.manage().window.setSize(dimension);
	// 3. Using ChromeOptions -> ("--start-maximized")

	WebDriver driver;

	@Test
	public void launchApplication() {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://letcode.in/");

	}

	@Test
	@Ignore
	public void usingMaximizemethod() {
		driver.manage().window().maximize();

	}

	@Ignore
	@Test
	public void useOfDimension() {
		Dimension d = new Dimension(1920, 1080);
		driver.manage().window().setSize(d);
	}

}
