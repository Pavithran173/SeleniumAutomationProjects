package com.jeeva.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExam {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		WebElement alertBox1 = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		
	alertBox1.click();
	
	Thread.sleep(3000);
		
	
	    Alert alert = driver.switchTo().alert();
	    alert.sendKeys("JeevaPavi");
	    alert.accept();
		
	}

}
