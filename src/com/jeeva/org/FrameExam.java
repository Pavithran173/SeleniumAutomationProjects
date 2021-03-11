package com.jeeva.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExam {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.diver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/frame.html");

		/*
		 * driver.switchTo().frame(0);
		 * 
		 * WebElement frm1 = driver.findElement(By.id("Click"));
		 * 
		 * frm1.click();
		 * 
		 * String text = frm1.getText();
		 * 
		 * System.out.println("The frm1 text is "+text);
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * driver.switchTo().frame(1);
		 * 
		 * driver.switchTo().frame("frame2");
		 * 
		 * 
		 * 
		 * // driver.switchTo().frame("frame2");
		 * 
		 * WebElement frm2 = driver.findElement(By.id("click1"));
		 * 
		 * frm2.click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * List<WebElement> tlfrm = driver.findElements(By.tagName("iframe"));
		 * 
		 * int size = tlfrm.size();
		 * 
		 * System.out.println(size);
		 */

		driver.switchTo().frame(0);
		WebElement bu = driver.findElement(By.id("Click"));
		bu.click();
		String ss = bu.getText();
		System.out.println(ss);

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);

		driver.switchTo().frame("frame2");
		WebElement fr2 = driver.findElement(By.id("Click1"));
		fr2.click();
		String strfr = fr2.getText();
		System.out.println(strfr);
		
		driver.switchTo().defaultContent();

		List<WebElement> listframe = driver.findElements(By.tagName("iframe"));
		int nof = listframe.size();
		System.out.println("The number of frames in the site " + nof);
		
		driver.quit();
	}

}
