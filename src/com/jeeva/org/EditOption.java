package com.jeeva.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditOption {
	
	public static void main(String[] args) {
		
		System.setProperty("http://www.leafground.com/pages/Edit.html", "C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/Edit.html");
		
		WebElement em = driver.findElement(By.id("email"));
		em.sendKeys("pavithran713@gmail.com");
		
		WebElement addtext = driver.findElement(By.xpath("//input[@value='Append ']"));
		addtext.sendKeys("text added successfully");
		addtext.sendKeys(Keys.TAB);
		
		WebElement username = driver.findElement(By.name("username"));
	
		String attribute = username.getAttribute("value");
		System.out.println(attribute);
		
		WebElement username2 = driver.findElement(By.xpath("//*[@value='Clear me!!']"));
		username2.clear();
		
		WebElement db = driver.findElement(By.xpath("//*[text()='Confirm that edit field is disabled']//following::input"));

		if (db.isEnabled()) {
			System.out.println("The input field is enabled");
		}else
		{
			System.out.println("The input field is disabled");
		}
		
		
	}

}
