package com.jeeva.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSelenium {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");

		List<WebElement> col = driver.findElements(By.tagName("th"));
		int cols = col.size();
		System.out.println("The number of column is " + cols);
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int rows = row.size();
		System.out.println("The number of row is "+rows);
		WebElement nom = driver.findElement(By.xpath("//*[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		
	}

}
