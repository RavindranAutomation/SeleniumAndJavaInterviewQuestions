package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HowToVerifyFileDownload {

	//	1. Click on the download button
	//	2. Put wait for file downloads
	//	3. Selenium is not having inbuilt methods to verify the file downloads
	//	4. Hence we are using Java to check the file
	//	5. Create a object for file and pass the download location
	//	6. Retreive the list of files from our downloads location and store it in File[]
	//	7. Iterate the list of files using foreach loop
	//	8. Then put a if condition then match the file name is equals with actual filename
	//	9. Use break statement to stop the iteration.

	WebDriver driver;

//	@BeforeMethod
//	public void launchApplication() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
//
//	}

	@Test
	public void verifyFileDownload() throws InterruptedException {
//		driver.findElement(By.cssSelector("a#downloadButton")).click();
//		Thread.sleep(4000);

		File fileLocation = new File("C:\\Users\\Ravin\\Downloads");

		File[] filesList = fileLocation.listFiles();

		for (File file : filesList) {
			if (file.getName().equals("sampleFile98924548.jpeg")) {
				System.out.println("File is downloaded");
				break;

			}else {
				System.out.println("File is NOT PRESENT");
				break;
			}
		}

	}

}
