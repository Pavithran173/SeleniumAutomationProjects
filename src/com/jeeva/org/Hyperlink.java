package com.jeeva.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Link.html");

		WebElement text1 = driver
				.findElement(By.xpath("//*[contains(text(),'Find where am supposed to go without clicking me?')]"));

		String typelink = text1.getAttribute("href");

		System.out.println(typelink);

		WebElement broke = driver.findElement(By.xpath("//*[text()='Verify am I broken?']"));

		broke.click();

		String title = driver.getTitle();

		if (title.contains("404")) {

			System.out.println("link is broken");

		}

		driver.navigate().back();

		WebElement txt45 = driver.findElement(By.linkText("Go to Home Page"));

		txt45.click();

		driver.navigate().back();

		List<WebElement> anchortag = driver.findElements(By.tagName("a"));

		int intsize2345 = anchortag.size();

		System.out.println(intsize2345);

	}

}
