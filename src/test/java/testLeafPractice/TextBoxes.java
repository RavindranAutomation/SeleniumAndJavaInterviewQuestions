package testLeafPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TextBoxes {
	WebDriver driver;

	@Test
	public void handlingTextBoxes() throws IOException, InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		// 1. Type your name
		WebElement name = driver.findElement(By.xpath("//input[@id='j_idt88:name']"));
		name.sendKeys("Lionel Messi");
		
		WebElement element = driver.findElement(By.xpath("(//h5[contains(text(),'Type your name')])[1]"));
		String visibleText = element.getText();
		
//		SoftAssert soft = new SoftAssert();
//		soft.assertEquals(visibleText, "Type your name ");
		
		Assert.assertEquals(visibleText, "Type your name  ");


		// 2. Append Country to this City.
		WebElement country = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']"));
		country.sendKeys(" India");

		// 3. Verify if text box is disabled
		boolean disabledTextbox = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled();
		assertEquals(disabledTextbox, false);

		// 4. Clear the typed text.
		WebElement clearTextbox = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']"));
		clearTextbox.clear();

		// 5. Retrieve the typed text.
		WebElement retriveTextBox = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']"));
		String retrivedtext = retriveTextBox.getAttribute("value");
		System.out.println(retrivedtext);
		assertEquals(retrivedtext, "My learning is superb so far.");

		// 6. Type email and Tab. Confirm control moved to next element.
		WebElement emailTextbox = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']"));
		emailTextbox.sendKeys("Lionelmessi@gmail.com" + Keys.TAB);

		WebElement infoTextbox = driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']"));
		infoTextbox.sendKeys("I'm a footballer form Argentina");

		// 7. Just Press Enter and confirm error message*
		WebElement confirmErrormsgTextBox = driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']"));
		confirmErrormsgTextBox.sendKeys(Keys.ENTER);

		WebElement warningInfo = driver.findElement(By.xpath("//span[@id='j_idt106:thisform:j_idt110_error-detail']"));
		Boolean warningMessage = wait
				.until(ExpectedConditions.textToBePresentInElement(warningInfo, "Age is mandatory"));
		assertEquals(warningMessage, true);

		// 8. Click and Confirm Label Position Changes
		WebElement labeltextBox = driver.findElement(By.xpath("//input[@id='j_idt106:float-input']"));
		labeltextBox.click();

		WebElement labelText = driver.findElement(By.xpath("//label[@id='j_idt106:j_idt113']"));
		boolean displayed = labelText.isDisplayed();
		assertEquals(displayed, true);

		WebElement nametextbox = driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']"));
		nametextbox.sendKeys("Ravindran");

		Thread.sleep(3000);
		List<WebElement> elements = driver.findElements(By.xpath("//span[@id='j_idt106:auto-complete_panel']/ul/li"));

		for (WebElement webElement : elements) {

			if (webElement.getAttribute("data-item-value").equals("Ravindran2")) {
				webElement.click();
			}

		}
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,
				new File("C:\\Users\\Ravin\\git\\SeleniumAndJavaInterviewQuestions\\target\\success.png"));
//		soft.assertAll();
	}

	@AfterMethod
	private void quitBrowser() {
		driver.quit();
	}

}
