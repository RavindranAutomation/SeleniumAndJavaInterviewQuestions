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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Waits {
	WebDriver driver;
	
	@Test
	public void handleWebDriverWaits() throws InterruptedException {
	    driver = new ChromeDriver();
		driver.get("https://letcode.in/waits");
		driver.manage().window().maximize();
		
		WebElement simpleAlert = driver.findElement(By.id("accept"));
		simpleAlert.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String alertText = alert.getText();
		Assert.assertEquals(alertText, "Finally I'm here, just to say Hi :)");
		Thread.sleep(3000);
		alert.accept();
		
		

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
