package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectAllCheckBoxes {
	WebDriver driver;

	@BeforeMethod
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node016kcbie0qu9ic1579g0au7c1mg8122242.node0");

	}

	@Test
	private void checkAllCheckboxes() {
		List<WebElement> checkBoxList = driver
				.findElements(By.xpath("//*[contains(text(),'Choose your favorite language(s)')]//following::td"));
		for (WebElement webElement : checkBoxList) {
			if (webElement.isEnabled()) {
				webElement.click();
			}
		}

	}

}
