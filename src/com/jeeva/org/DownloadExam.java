package com.jeeva.org;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExam {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/download.html");

		WebElement download = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[3]/div[2]/a[1]"));

		download.click();

		Thread.sleep(5000);

		File fileLoc = new File("C:\\Users\\ELCOT\\Downloads");

		File[] listFiles = fileLoc.listFiles();

		for (File file : listFiles) {

			if (file.getName().equals("testleaf.xlsx")) {

				System.out.println("File Present");

				break;
			}

		}

	}

}
