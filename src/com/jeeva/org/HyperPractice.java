package com.jeeva.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperPractice {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		
		WebElement text11 = driver.findElement(By.xpath("//a[contains(text(),'Go to Home Page')]"));
		text11.click();
		driver.navigate().back();
		
		WebElement support = driver.findElement(By.xpath("//*[text()='Find where am supposed to go without clicking me?']"));
		String vbn = support.getAttribute("href");
		System.out.println(vbn);
		
		WebElement broken = driver.findElement(By.linkText("Verify am I broken?"));
		broken.click();
		/*String errorpage = driver.getTitle();
		if (errorpage.contains("404")) {
			System.out.println("The webpage is not loaded");
		}*/
		
		
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("it is the error page");
		}
		driver.navigate().back();
		
		WebElement link1 = driver.findElement(By.linkText("Go to Home Page"));	
		link1.click();
		driver.navigate().back();
		
		List<WebElement> tn = driver.findElements(By.tagName("a"));
		int totaltags = tn.size();
		System.out.println(totaltags);
	}

}
