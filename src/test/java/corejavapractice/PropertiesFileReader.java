package corejavapractice;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

	public static void main(String[] args) throws IOException {

		// 1. Created an object for File reader class and passed file location
//  2. To handle properties file, we should create a object for Properties class
// 3. With the help of properties object, we have to load our actual file.

		FileReader file = new FileReader("C:\\Users\\Ravin\\git\\SeleniumAndJavaInterviewQuestions\\config.properties");

		Properties properties = new Properties();

		properties.load(file);

		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		System.out.println(properties.getProperty("Email"));
		System.out.println(properties.getProperty("Password"));

	}

}
