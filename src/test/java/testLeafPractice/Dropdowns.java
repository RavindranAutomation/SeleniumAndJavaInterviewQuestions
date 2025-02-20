package testLeafPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import lombok.val;

public class Dropdowns {
	WebDriver driver;

	@Test
	public void handleDropdowns() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");

		// 1. Which is your favorite UI Automation tool? - Select
		WebElement dropdown1 = driver.findElement(By.xpath("//Select[@class='ui-selectonemenu']"));
		Select select = new Select(dropdown1);
		select.selectByVisibleText("Selenium");

		// 2. Choose your preferred country. - div
		WebElement countryDropdown = driver.findElement(By.xpath("//div[@id='j_idt87:country']"));

		Actions a = new Actions(driver);
		a.moveToElement(countryDropdown).click().build().perform();

		List<WebElement> countriesList = driver.findElements(By.xpath("//ul[@id='j_idt87:country_items']/li"));
		Thread.sleep(Duration.ofSeconds(2));

		for (WebElement country : countriesList) {

			if (country.getText().contains("India")) {
				a.click(country).perform();
			}

		}

		// 3. Confirm Cities belongs to Country is loaded
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		WebElement cityDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt87:city")));

		a.moveToElement(cityDropdown).click().perform();

		List<WebElement> citiesList = wait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='j_idt87:city_items']/li")));

		a.click(citiesList.get(2)).perform();

		// 4. Choose the Course
		WebElement autoCompletetextbox = driver.findElement(By.id("j_idt87:auto-complete_input"));
		autoCompletetextbox.click();
		autoCompletetextbox.sendKeys("Sel");

		List<WebElement> courseList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
				"//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li")));

		for (WebElement course : courseList) {

			if (course.getText().contains("Selenium")) {
				course.click();
			}

		}
		// 5. Choose language randomly

		WebElement langDropdown = driver.findElement(By.id("j_idt87:lang"));
		langDropdown.click();

		List<WebElement> languageList = wait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='j_idt87:lang_items']/li")));

		for (WebElement lang : languageList) {

			if (lang.getText().contains("English")) {
				lang.click();
			}

		}
		// 6. Select 'Two' irrespective of the language chosen
		WebElement valueDropdown = driver.findElement(By.id("j_idt87:value"));
		valueDropdown.click();

		List<WebElement> valuesList = wait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='j_idt87:value_items']/li")));

		for (WebElement value : valuesList) {

			if (value.getText().equals("Two")) {
				value.click();
			}

		}

	}

}
