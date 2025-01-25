package herokuPractice;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileDownload {
	@Test
	private void verifyFileDownload() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//a[@href='download/webdriverIO.png']")).click();

		Thread.sleep(5000);

		File file = new File("C:\\Users\\Ravin\\Downloads");
		File[] listFiles = file.listFiles();

		for (int i = 0; i < listFiles.length; i++) {

			if (listFiles[i].getName().equals("webdriverIO.png")) {

				System.out.println("File is found in the directory");
				break;
			}
		}

	}

}
