package com.letcode.base;

import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.xpath.operations.Equals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {

	public static WebDriver driver;
	public static Properties prop;

	public  Testbase() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("C:\\Users\\Arun_P\\eclipse-workspace\\Project1\\src\\main\\java\\com\\letcode\\config\\config.properties");
			prop.load(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}

	}

	public  void initialization()

	{
		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Arun_P\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();

		} else {
			System.out.println("Not chrome");
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);

	}

}
