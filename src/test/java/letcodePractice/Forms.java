package letcodePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Forms {
	WebDriver driver;

	@Test
	private void submitForm() {
		driver = new ChromeDriver();
		driver.get("https://letcode.in/forms");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("firstname")).sendKeys("Leo");
		driver.findElement(By.id("lasttname")).sendKeys("Messi");
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("ravikn@yopmail.com");
		WebElement dropDown1 = driver.findElement(By.xpath("(//div[@class='select']//select)[1]"));

		Select s = new Select(dropDown1);
		s.selectByVisibleText("Argentina (+54)");

		driver.findElement(By.id("Phno")).sendKeys("9876543210");

		driver.findElement(By.id("Addl1")).sendKeys("Rosario Street");
		driver.findElement(By.id("Addl2")).sendKeys("Argentina");
		driver.findElement(By.id("state")).sendKeys("Aires");
		driver.findElement(By.id("postalcode")).sendKeys("900047");

		WebElement dropDown2 = driver.findElement(By.xpath("(//div[@class='select']//select)[2]"));

		Select s1 = new Select(dropDown2);

		s1.selectByVisibleText("Argentina");
		driver.findElement(By.id("Date")).sendKeys("10-08-1987");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
