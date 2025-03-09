package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class GetAllH3Links {
	WebDriver driver;

	@Test
	private void GetAllH3LinksInWebPage() {

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Amazon" + Keys.ENTER);
		List<WebElement> elements = driver.findElements(By.xpath("//h3/following::cite"));
		;
		for (WebElement list : elements) {
			System.out.println(list.getText());

		}

	}

	@AfterMethod

	public void tearDown() {
		driver.quit();
	}

}
