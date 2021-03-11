package com.jeeva.org;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExam {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File ts2 = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(ts2, new File("C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\Screeen\\ts2.png"));

		driver.close();

	}

}