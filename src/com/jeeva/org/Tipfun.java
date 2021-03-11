package com.jeeva.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tipfun {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		
		WebElement tip1 = driver.findElement(By.xpath("//input[@title='Enter your Name']"));
		
		String tip2 = tip1.getAttribute("title");
		
		System.out.println(tip2);

	}

}
