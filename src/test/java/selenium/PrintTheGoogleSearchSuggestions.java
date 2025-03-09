package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrintTheGoogleSearchSuggestions {

	WebDriver driver;

	@BeforeMethod
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

	}
	@Test
	private void getGoogleSuggestion() {
		driver.findElement(By.id("APjFqb")).sendKeys("Amazon");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@role='listbox']/li")));

		List<WebElement> listOfSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		for (WebElement webElement : listOfSuggestions) {
			System.out.println(webElement.getText());
		}

	}
}