package com.jeeva.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Window.html");
	
	String windowHandle = driver.getWindowHandle();
	
	WebElement openhomepage = driver.findElement(By.id("home"));
	openhomepage.click();
	
	Set<String> twopages = driver.getWindowHandles();
	for (String controlsecondpage : twopages) {
		driver.switchTo().window(controlsecondpage);
	}
	
	driver.close();
	driver.switchTo().window(windowHandle);
	Thread.sleep(3000);
	
	WebElement mulwind = driver.findElement(By.xpath("//*[text()='Open Multiple Windows']"));
	mulwind.click();
	
	int mwh = driver.getWindowHandles().size();
	System.out.println(mwh);
	
	WebElement mwh2 = driver.findElement(By.xpath("//*[text()='Do not close me ']"));
	mwh2.click();
	
	int win = driver.getWindowHandles().size();
	System.out.println("After clicking the dont close me option "+ win);
	
	Set<String> closeoption = driver.getWindowHandles();
	for (String mwh3 : closeoption) {
		
		if (!windowHandle.equals(mwh3)) {
			driver.switchTo().window(mwh3);
			driver.close();
		}
	}
	
}
}
