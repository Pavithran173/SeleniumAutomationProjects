package com.jeeva.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingPractical {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drivver", "C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		String parentwindow = driver.getWindowHandle();
		
		WebElement firstoperation = driver.findElement(By.id("home"));
		firstoperation.click();
		Set<String> secondwindow = driver.getWindowHandles();
		for (String sw : secondwindow) {
			driver.switchTo().window(sw);
		}
		
		WebElement secondoperation = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
		secondoperation.click();
		driver.close();
		driver.switchTo().window(parentwindow);
		
		WebElement thirdoperation = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		thirdoperation.click();
		Set<String> thirdwindow = driver.getWindowHandles();
		int openedwindows = thirdwindow.size();
		System.out.println("The Number of opened window is "+openedwindows);
		driver.switchTo().window(parentwindow);
		
		WebElement fourthoperation = driver.findElement(By.xpath("//*[@id=\"color\"]"));	
		fourthoperation.click();
		Set<String> wh = driver.getWindowHandles();
		for (String handles : wh) {
			if (!handles.equals(parentwindow)) {
				driver.switchTo().window(handles);
				driver.close();
			}
			
		}
		
		
		
				
	}}