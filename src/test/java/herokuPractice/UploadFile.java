package herokuPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
	@Test
	private void verifyFileUpload() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement uploadLocation = driver.findElement(By.id("file-upload"));
		uploadLocation.sendKeys("C:\\Users\\Ravin\\Downloads\\webdriverIO.png");
		driver.findElement(By.id("file-submit")).click();
		boolean displayed = driver.findElement(By.xpath("//h3")).isDisplayed();
		System.out.println(displayed);

	}

}
