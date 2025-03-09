package letcodePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webtables {

	WebDriver driver;

	@Test
	public void webtables() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> headersList = driver.findElements(By.xpath("(//table[@id='product'])[2]/thead/tr/th"));

		
		for (WebElement header : headersList) {
			System.out.println(header.getText());
		}
		
		
		List<WebElement> amountList = driver.findElements(By.xpath("(//table[@id='product'])[2]/tbody/tr/td[4]"));
		int total = 0;
		for (WebElement amount : amountList) {
			
			String text = amount.getText();
			int actualAmount = Integer.parseInt(text);
			total=total+actualAmount;
		}
		
		System.out.println(total);
		
		
		String expectedTotal = driver.findElement(By.xpath("(//div[@class='right-align']//div)[2]")).getText();
		System.out.println(expectedTotal.length());
		String substring = expectedTotal.substring(24);
		System.out.println(substring);
	}

}
