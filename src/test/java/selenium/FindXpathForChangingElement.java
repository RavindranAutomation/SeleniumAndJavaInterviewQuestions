package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindXpathForChangingElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kapruka.com/online/samedaydelivery");
		driver.findElement(By.xpath("//li[@class='deskMenu']/following::li[4]/child::a")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//h2[starts-with(text(),'LI')]"));
		for (WebElement webElement : elements) {
			System.out.println(webElement.getText());
		}

	}

}
