package testLeafPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Checkbox {
	WebDriver driver;

	@Test
	public void handleCheckboxes() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node0jj7po9xopcaq1764u8pucbgl18695327.node0");

		WebElement basicCheckbox = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']"));

		// 1. Basic Checkbox - Select
		if (basicCheckbox.isSelected()) {
			System.out.println("Check box is already selected");
		} else {
			basicCheckbox.click();
			System.out.println("Check box is selected");
		}

		basicCheckbox.click();

		// 2. Select all check boxes

		List<WebElement> checkboxList = driver.findElements(
				By.xpath("//h5[contains(text(),'Choose your favorite language(s)')]/following::table/tbody/tr/td/div"));

		for (WebElement checkBox : checkboxList) {
			checkBox.click();
		}

		WebElement disabledCheckbox = driver.findElement(By.id("j_idt87:j_idt102"));

		// 3. Verify if check box is disabled
		if (disabledCheckbox.isEnabled()) {
			System.out.println("Check box is disabled");
		} else {
			disabledCheckbox.click();
		}

	}

}
