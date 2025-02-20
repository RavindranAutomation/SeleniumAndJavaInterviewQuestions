package testLeafPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Waits {
	WebDriver driver;

	@Test
	public void handleWaits() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// 1. Wait for Visibility (1 - 10 Sec)
		WebElement clickBtn = driver.findElement(By.id("j_idt87:j_idt89"));
		clickBtn.click();

		WebElement expectedElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt87:j_idt90']")));

		if (expectedElement.isDisplayed()) {
			System.out.println("Element is displayed after waiting period");
		} else {
			System.out.println("Element is not displayed after waiting period");
		}
		// 2. Wait for Invisibility (1 - 10 Sec)

		WebElement clickBtn1 = driver.findElement(By.id("j_idt87:j_idt92"));
		clickBtn1.click();

		Boolean invisilbeBtn = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("j_idt87:j_idt93")));

		if (invisilbeBtn == true) {
			System.out.println("Element is became invisible");
		} else {
			System.out.println("Element is became visible");
		}

		// 3. Wait for Text Change (1 - 10 Sec)
		WebElement clickBtn3 = driver.findElement(By.id("j_idt87:j_idt98"));
		clickBtn3.click();

		Boolean actualResult = wait.until(ExpectedConditions
				.textToBePresentInElementLocated(By.xpath("//button[@id='j_idt87:j_idt99']/span"), "Did you notice?"));

		if (actualResult == true) {
			System.out.println("Text is changed");
		} else {
			System.out.println("Text is not changed");
		}

	}

}
