package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DatePicker {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

	@Test(invocationTimeOut = 3000)
	public void datepickethandling() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();

		String date = "27";

		String month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[1]")).getText();
		String year = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']//span)[2]")).getText();

		while (!(month.equals("February") && year.equals("2025"))) {
			driver.findElement(By.xpath("//a[@title='Next']//span[1]")).click();
			month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[1]")).getText();
			year = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']//span)[2]")).getText();

		}

		driver.findElement(By.xpath("//a[@data-date='" + date + "']")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
