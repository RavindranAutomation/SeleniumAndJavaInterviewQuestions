package letcodePractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Elements {
	WebDriver driver;

	@Test
	private void elemenetshandler() {
		driver = new ChromeDriver();
		driver.get("https://letcode.in/elements");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement textBox = driver
				.findElement(By.xpath("//input[@placeholder='Enter your git user name eg., ortonikc']"));
		textBox.sendKeys("naveenanimation20");
		driver.findElement(By.id("search")).click();
		boolean actualImg = driver.findElement(By.xpath("//img[@alt='Placeholder image']")).isDisplayed();
		Assert.assertEquals(actualImg, true);

		WebElement repos = driver.findElement(
				By.xpath("//div[@class='tags has-addons']/span[contains(text(),'Repos')]/following::span[1]"));
		String text = repos.getText();
		int repoCount = Integer.parseInt(text);

		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='content']/ol/li/a"));
		int repoSize = 0;

		for (WebElement webElement : elements) {
			System.out.println(webElement.getText());
			repoSize = repoSize + 1;
		}

		System.out.println(repoSize);

		Assert.assertEquals(repoCount, repoCount);

	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
