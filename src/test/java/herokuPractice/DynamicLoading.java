package herokuPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DynamicLoading {
	@Test
	private void getDynamicLoadingElements() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		driver.findElement(By.xpath("//div[@class='example']//a[1]")).click();
		driver.findElement(By.xpath("//div[@id='start']//button[1]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement dynamicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4[1]")));
		System.out.println(dynamicElement.getText());

	}

}
