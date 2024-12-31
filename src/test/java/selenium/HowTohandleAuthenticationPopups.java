package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HowTohandleAuthenticationPopups {

	//	1. Syntax --> https://username:password@actualurl.com

	WebDriver driver;

	@Test
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		boolean successmsg = driver.findElement(By.xpath("//*[contains(text(),'Congratulations!')]")).isDisplayed();
		Assert.assertTrue(successmsg);

	}

}
