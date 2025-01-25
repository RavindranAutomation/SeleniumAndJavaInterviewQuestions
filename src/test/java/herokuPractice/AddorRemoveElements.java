package herokuPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddorRemoveElements {
	@Test

	public void addorremoveElements() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		driver.findElement(By.xpath("//div[@class='example']/button")).click();
		
		WebElement deleteBtn = driver.findElement(By.xpath("//div[@id='elements']/button"));

		try {
			if (deleteBtn.isDisplayed()) {
				deleteBtn.click();
			}else {
				System.out.println("Button is not dispalyed");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
