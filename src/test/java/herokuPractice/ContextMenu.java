package herokuPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContextMenu {
	@Test
	private void verfyContextmenu() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		WebElement spot = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(spot);
		a.contextClick();
		a.build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		
		
	}

}
