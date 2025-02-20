package letcodePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class iFrame {
	WebDriver driver;

	@Test
	private void testiFrames() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame("firstFr");
		WebElement fname = driver.findElement(By.xpath("//input[@name='fname']"));
		fname.sendKeys("Lionel");
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Messi");

		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));

		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("LionelMessi@gmail.com");
		
		driver.switchTo().parentFrame();
		fname.clear();
		
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.xpath("//p[contains(text(),'Insight')]")).getText();
		System.out.println(text);
		Thread.sleep(4000);

	}

	@AfterMethod
	private void quitBrowser() {
		driver.quit();

	}

}
