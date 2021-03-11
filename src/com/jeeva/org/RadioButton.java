package com.jeeva.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");

		WebElement status1 = driver.findElement(By.xpath("//input[@name='news']"));
		boolean uncked = status1.isSelected();
		System.out.println(uncked);
		
		
		WebElement status2 = driver.findElement(By.xpath("//*[@value='1'][@name='news']"));
		boolean ched = status2.isSelected();
		System.out.println(ched);

		WebElement age = driver.findElement(By.xpath("//input[@value='1'][@name='age']"));
		age.click();
	}

}
