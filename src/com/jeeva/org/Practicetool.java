package com.jeeva.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicetool {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		
		
		List<WebElement> column = driver.findElements(By.tagName("th"));
		
		int colcount = column.size();
		
		System.out.println(colcount);
		
		List<WebElement> rowcount = driver.findElements(By.tagName("tr"));
		
		int rowcount1 = rowcount.size();
		
		System.out.println(rowcount1);
		
		WebElement data = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
	
		String dt = data.getText();
		
		System.out.println(dt);
		
		WebElement remarks = driver.findElement(By.xpath("//td[normalize-space()='Learn Locators']//following::td[5]"));

		String retext = remarks.getText();
		
		System.out.println(retext);
		
		WebElement recheck = driver.findElement(By.xpath("//td[normalize-space()='Learn XPath']//following::td[2]"));
		
		recheck.click();
		
		
	}

}
