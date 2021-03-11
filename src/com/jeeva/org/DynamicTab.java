package com.jeeva.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTab {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/table.html");

		List<WebElement> columns = driver.findElements(By.tagName("th"));

		int noOfColumn = columns.size();

		System.out.println(noOfColumn);

		List<WebElement> numofrows = driver.findElements(By.tagName("tr"));

		int rows = numofrows.size();

		System.out.println(rows);

		WebElement tx1 = driver
				.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));

		String value = tx1.getText();

		System.out.println(value);

		List<WebElement> setofvalue = driver.findElements(By.xpath("//td[2]"));

		List<Integer> int1set = new ArrayList<Integer>();

		for (WebElement sperate : setofvalue) {

			String speratetext = sperate.getText().replace("%", "");

			int1set.add(Integer.parseInt(speratetext));

		}
		System.out.println(int1set);

		Integer min = Collections.min(int1set);
		System.out.println(min);
		String minstring = Integer.toString(min) + "%";

		String finalxpath = "//td[normalize-space()=" + "\"" + minstring + "\"" + "]" + "//following::td[1]";
		System.out.println(finalxpath);

		WebElement result11 = driver.findElement(By.xpath(finalxpath));

		result11.click();

	}

}
