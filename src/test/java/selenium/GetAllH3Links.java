package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetAllH3Links {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new
		String[]{"enable-automation"});
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Amazon" + Keys.ENTER);
		List<WebElement> elements = driver.findElements(By.xpath("//h3/following::cite"));;
        for(WebElement list : elements) {
        	System.out.println(list.getText());
        }
	}

}
