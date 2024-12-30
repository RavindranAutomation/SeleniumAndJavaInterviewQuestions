package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class HowToWorkWithSelectable {

	//	1. Retreive the list of WebElements
	//	2. Use Actions class and with that object use keyDown option for click the CONTROL key
	//	3. Click on each WebEelements based on the index position
	WebDriver driver;

	@BeforeMethod
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selectable.php");

	}

	@Test
	public void workingWithSelectable() {

		List<WebElement> selectableList = driver.findElements(By.xpath("//ul[@class='list-group rounded mt-4']/li"));

		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).click(selectableList.get(0)).
		click(selectableList.get(1)).
		click(selectableList.get(2)).
		click(selectableList.get(3)).build().perform();

	}

}
