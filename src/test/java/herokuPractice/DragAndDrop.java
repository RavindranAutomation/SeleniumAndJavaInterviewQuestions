package herokuPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	@Test
	private void verifyDragAndDrop() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");

		WebElement draggable = driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='column-b']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(draggable, droppable).perform();




	}

}
