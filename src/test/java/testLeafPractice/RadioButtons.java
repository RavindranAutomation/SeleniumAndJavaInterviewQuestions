package testLeafPractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtons {
	WebDriver driver;

	@Test
	public void handleRadioButtons() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		// 1. Your most favorite browser
		WebElement chromeRadio = driver
				.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody/tr/td[1]/div/div[2]"));

		if (chromeRadio.isEnabled()) {
			chromeRadio.click();
		}

	}

}
