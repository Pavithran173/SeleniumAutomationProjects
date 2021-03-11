package com.jeeva.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExam {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");

		WebElement ac1 = driver.findElement(By.xpath("//*[@id=\"tags\"]"));

		ac1.sendKeys("api");

		Thread.sleep(5000);

		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));

		Thread.sleep(5000);

		for (WebElement webElement : elements) {

			Thread.sleep(2000);
			if (webElement.getText().equals("Rest API")) {

				webElement.click();

				break;
			}
		}
		

	}

}
