package com.jeeva.org;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Window.html");
		String oldwindows = driver.getWindowHandle();
		WebElement home = driver.findElement(By.id("home"));
		home.click();
		Set<String> newwin = driver.getWindowHandles();
		
		for (String ee : newwin) {
			driver.switchTo().window(ee);
		}
		driver.close();
		
		driver.switchTo().window(oldwindows);
		
		WebElement nw = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		nw.click();
		
		
		Set<String> wwh = driver.getWindowHandles();
		int winsize = wwh.size();
		
		System.out.println("Total number opened windows is "+winsize);
		WebElement ss2 = driver.findElement(By.xpath("//*[text()='Do not close me ']"));
		ss2.click();
		Set<String> ss3 = driver.getWindowHandles();
		for (String s3 : ss3) {
			if (!s3.equals(oldwindows)) {
				driver.switchTo().window(s3);
				driver.close();
			}
		}
		
		driver.switchTo().window(oldwindows);
		
		WebElement donotcloseme = driver.findElement(By.xpath("//*[text()='Wait for 5 seconds']"));
		donotcloseme.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		donotcloseme.click();
		
		
		
	}

}
