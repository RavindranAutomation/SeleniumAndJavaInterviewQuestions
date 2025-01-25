package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class NOPCOMMERCE {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.id("Email")).sendKeys("ravindrann10898@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		boolean displayed = driver.findElement(By.xpath("//div[@class='header-links']/ul/li[1]/a")).isDisplayed();
		Assert.assertEquals(false, displayed);
	}

}
