package testLeafPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Frames {
	WebDriver driver;
	@Test
	public void handlingiFrames() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/iframe/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://vinothqaacademy.com/webtable/']")));
		driver.findElement(By.xpath("//input[@id='nameInput']")).sendKeys("LEO");
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='popuppage']")));
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		
	}
	
	

}
