package herokuPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDowns {
	@Test
	private void handlingDropdown() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		Select s = new Select(dropdown);
		
		
		s.selectByValue("2");
		
		List<WebElement> options = s.getOptions();
		
		for(int i = 0; i<options.size();i++)
		{
			String text = options.get(i).getText();
			System.out.println("getting all options : " + text);
			
		}
		
	

	}

}
