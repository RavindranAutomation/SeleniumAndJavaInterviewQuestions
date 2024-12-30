package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HowToHandleToolTip {

	// 1. Find the WebElement and mouse hover to it
	// 2. Get the title attribute from the founded webelement.

	WebDriver driver;

	@BeforeMethod
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");

	}

	@Test
	public void toolTipHandling() {

		WebElement firstNametextBox = driver.findElement(By.id("firstname"));
		Actions a = new Actions(driver);
		a.moveToElement(firstNametextBox).perform();
		String attribute = firstNametextBox.getAttribute("title");
		System.out.println(attribute);

	}

}
