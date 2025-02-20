package letcodePractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerts {
	WebDriver driver; 
	@Test(priority = 1)
	public void handleSimpleAlert() {
		driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		driver.findElement(By.id("accept")).click();
		Alert simpleAlert = driver.switchTo().alert();
		String text = simpleAlert.getText();
		System.out.println(text);
		Assert.assertEquals(text, "Hey! Welcome to LetCode");
		simpleAlert.accept();
		
	}
	@Test(priority = 2)
	public void handleConfirmAlert() {
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert = driver.switchTo().alert();
		String text = confirmAlert.getText();
		System.out.println(text);
		confirmAlert.accept();

	}
	@Test(priority = 3)
	private void handlePromptAlert() {
		
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Automation");
		promptAlert.accept();
		
		WebElement promptedText = driver.findElement(By.id("myName"));
		String text = promptedText.getText();
		
		Assert.assertTrue(text.contains("Automation"));
		
	}

}
