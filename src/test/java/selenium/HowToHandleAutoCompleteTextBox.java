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

public class HowToHandleAutoCompleteTextBox {

	//	1. Peform sendKeys with any letter
	//	2. Put wait for sugestionList visibility
	//	3. Find WebElements of suggested list
	//	4. iterate iy by using foreach loop
	//	5. Put a condition if a given option is equals with retreived WebElement text, 
	//	   then click on the WebElement

	WebDriver driver;

	@BeforeMethod
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/auto-complete.php");

	}

	@Test
	public void handlingAutoCompleteTextBox() {
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("A");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ui-id-1")));

		List<WebElement> listOfSuggestions = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

		for (WebElement webElement : listOfSuggestions) {

			if (webElement.getText().equals("Erlang")) {
				webElement.click();

			}

		}

	}

}
