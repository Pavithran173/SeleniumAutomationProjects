package com.jeeva.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleExam {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Window.html");

		String oldwindow = driver.getWindowHandle();

		WebElement button1 = driver.findElement(By.id("home"));

		button1.click();

		Set<String> handles = driver.getWindowHandles();

		for (String newwin : handles) {

			driver.switchTo().window(newwin);
		}

		WebElement edit = driver.findElement(By.xpath("//*[@alt='Edit / Text Fields']"));

		edit.click();

		driver.close();

		driver.switchTo().window(oldwindow);

		WebElement button2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));

		button2.click();

		int size = driver.getWindowHandles().size();

		System.out.println(size);

		WebElement clswind = driver.findElement(By.id("color"));

		clswind.click();

		Set<String> multiWin = driver.getWindowHandles();

		for (String all : multiWin) {

			if (!all.equals(oldwindow)) {

				driver.switchTo().window(all);

				driver.close();

			}

		}
	}

}
