package com.jeeva.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExam2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/autoComplete.html");

		WebElement sel1 = driver.findElement(By.xpath("//*[@id=\"tags\"]"));

		sel1.sendKeys("s");
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> ull = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		for (WebElement x : ull) {
			String ssd = x.getText();

			System.out.println(ssd);
			if (ssd.equals("Web Services")) {
				WebElement sfd = driver.findElement(By.linkText("Web Services"));
				sfd.click();
				break;
			}
		}

	}

}
