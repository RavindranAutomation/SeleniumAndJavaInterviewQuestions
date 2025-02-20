package letcodePractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Windows {
	WebDriver driver;

	@Test(enabled = false)
	private void windowsHandlingOpenHomepage() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("home")).click();

		List<String> windows = new ArrayList<String>(driver.getWindowHandles());
		WebDriver childWindow = driver.switchTo().window(windows.get(1));
		String title = childWindow.getTitle();
		Assert.assertEquals(title, "LetCode - Testing Hub");
		System.out.println(title);
		childWindow.close();
		Thread.sleep(3000);
		WebDriver parentWindow = driver.switchTo().window(windows.get(0));
		parentWindow.close();

	}

	@Test(priority = 1)
	private void windowsHandlingMultipleWindows() {
		driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("multi")).click();
		List<String> windowsList = new ArrayList<String>(driver.getWindowHandles());
		WebDriver childwindow1 = driver.switchTo().window(windowsList.get(1));
		String childwindow1URL = childwindow1.getCurrentUrl();
		Assert.assertEquals(childwindow1URL.contains("alert"), true);
		System.out.println(childwindow1URL);
		childwindow1.close();

		WebDriver childwindow2 = driver.switchTo().window(windowsList.get(2));
		String childwindow2URL = childwindow2.getCurrentUrl();
		Assert.assertEquals(childwindow2URL.contains("dropdowns"), true);
		System.out.println(childwindow2URL);
		childwindow2.close();

	}

}
