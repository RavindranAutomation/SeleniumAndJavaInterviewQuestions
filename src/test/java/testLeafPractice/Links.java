package testLeafPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Links {
	WebDriver driver;
	@Test
	private void handleLinks() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/link.xhtml");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//h5[contains(text(),'Take')]/following::div[2]/a")).click();
		
		String currentUrl = driver.getCurrentUrl();
		
		if (currentUrl.contains("dashboard")) {
			System.out.println("Dashboad is navigated");
		}else {
			System.out.println("Dashboad is not navigated");
		}
		
		driver.navigate().back();
		
		WebElement destination = driver.findElement(By.xpath("//h5[contains(text(),'destination')]/following::div[2]/a"));
		
		String attribute = destination.getAttribute("href");
		System.out.println(attribute);
	}

}
