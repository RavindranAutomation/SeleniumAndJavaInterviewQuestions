package herokuPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyBrokenImgs {
	
	
	@Test(priority = 1)
	private void verfyImg1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		WebElement image1 = driver.findElement(By.xpath("//div[@class='example']//img[1]"));
		
		if(image1.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image is broken");
		}else {
			System.out.println("Image is not a broken image.");
		}
	}
	
	@Test(priority = 2)
	private void verfyImg2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		WebElement image1 = driver.findElement(By.xpath("(//div[@class='example']//img)[2]"));
		
		if(image1.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image is broken");
		}else {
			System.out.println("Image is not a broken image.");
		}
	}
	
	@Test(priority = 3)
	private void verfyImg3() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		WebElement image1 = driver.findElement(By.xpath("(//div[@class='example']//img)[3]"));
		
		if(image1.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image is broken");
		}else {
			System.out.println("Image is not a broken image.");
		}
	}
	
	

}
