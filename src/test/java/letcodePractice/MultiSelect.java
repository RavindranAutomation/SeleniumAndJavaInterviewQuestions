package letcodePractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MultiSelect {
	WebDriver driver;
	@Test
	public void testMultiSelect() throws AWTException {
		driver = new ChromeDriver();
		driver.get("https://letcode.in/selectable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> elementsList = driver.findElements(By.xpath("//div[@class='list-container']/child::div"));
		Robot robot = new Robot();
		Actions a = new Actions(driver);
		robot.keyPress(KeyEvent.VK_CONTROL);
		for (WebElement ele : elementsList) {
		a.click(ele).perform();
			
		}
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

}
