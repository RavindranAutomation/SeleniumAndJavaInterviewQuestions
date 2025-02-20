package testLeafPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
	
	
	// 1. Get all anchor tags from the Webpage
	// 2. Iterate to each a tags and get the attribute value of href tag
	// 3. Put a if condition, if a href value is null then continue the loop
	// 4. Create object for URL class and pass the hrefLinks
	// 5. With the URL option use openConnection method and type cast to HttpURLConnection abstract class
	// 6. Start the connection
	// 7. If the connection response code is greater than or equal to 400 then print the link is a broken.
	// 8. Else print the url is not a broken link.
	// 9. To check the count of total broken links intialize a class level int variabl and increament it in a broken link 
	//    checking condition.
	@Test
	public void validateBrokenLinks() throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/status_codes");
		driver.manage().window().maximize();

		int noOfBrokenLinks = 0;

		List<WebElement> anchorTagsList = driver.findElements(By.tagName("a"));

		for (WebElement anchorTag : anchorTagsList) {

			String hrefLinks = anchorTag.getAttribute("href");

			if (hrefLinks == null) {
				System.out.println("URL is null hence no need to check");
				continue;
			}

			URL urls = new URL(hrefLinks);
			HttpURLConnection connection = (HttpURLConnection) urls.openConnection();
			connection.connect();

			if (connection.getResponseCode() >= 400) {
				System.out.println(urls + " is a broken link - " + connection.getResponseCode());
				noOfBrokenLinks++;
			} else {
				System.out.println(urls + " is not a broken link - " + connection.getResponseCode());
			}

		}

		System.out.println(noOfBrokenLinks);

	}

}
