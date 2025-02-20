package letcodePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtons {

	WebDriver driver;
	@Test
	private void handleRadioButtons() {
		driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//div[@class='field'])[1]/div/label/input[@id='yes']")).click();

		driver.findElement(By.xpath("(//div[@class='field'])[2]/div/label/input[@id='two']")).click();
		boolean enabled = driver.findElement(By.xpath("(//div[@class='field'])[2]/div/label/input[@id='one']")).isSelected();
		Assert.assertEquals(enabled, false);



		driver.findElement(By.xpath("(//div[@class='field'])[3]/div/label/input[@id='nobug']")).click();
		driver.findElement(By.xpath("(//div[@class='field'])[3]/div/label/input[@id='bug']")).click();

		WebElement radio1 = driver.findElement(By.xpath("(//div[@class='field'])[4]/div/label/input[@id='foo']"));
		WebElement radio2 = driver.findElement(By.xpath("(//div[@class='field'])[4]/div/label/input[@id='notfoo']"));

		if (radio2.isSelected()) {
			Assert.assertTrue(radio2.isSelected());
		}else {
			Assert.assertTrue(radio1.isSelected());
		}
		
	}
}
