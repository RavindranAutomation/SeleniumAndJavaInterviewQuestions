package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrintAllLinksFromSearchResults {
	WebDriver driver;

	@BeforeMethod
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

	}

	@Test
	public void getAllLinksFromSearchresults() throws InterruptedException {
		driver.findElement(By.id("APjFqb")).sendKeys("The Green Mile" + Keys.ENTER);

		Thread.sleep(6000);
		List<WebElement> totalLinks = driver.findElements(By.xpath("//a"));

		for (WebElement links : totalLinks) {
			String attribute = links.getAttribute("href");
			System.out.println(attribute);
		}

	}
	
}
