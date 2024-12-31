package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DifferentWaysToRefreshAWindow {

	// 1. Using navigate().refresh()
	// 2. using JavascriptExecutor ("location.reload()")
	// 3. Using driver.get(driver.currentUrl))

	WebDriver driver;

	@BeforeMethod
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");

	}

	@Ignore
	@Test
	public void usingRefresh() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().refresh();
	}

	@Ignore
	@Test
	public void usingJSExecutor() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("location.reload()");

	}

	@Test
	public void usingDrivergetURL() throws InterruptedException {
		Thread.sleep(3000);
		driver.get(driver.getCurrentUrl());
	}

}
