package com.jeeva.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckExam {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");

		WebDriver box = new ChromeDriver();

		box.navigate().to("http://leafground.com/pages/checkbox.html");

		WebElement jav1 = box.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));

		jav1.click();

		WebElement vb = box.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[2]/input"));

		vb.click();

		WebElement sql = box.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input"));

		sql.click();

		WebElement c = box.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[4]/input"));

		c.click();

		WebElement cplus = box.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[5]/input"));

		cplus.click();

		WebElement ck = box.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));

		boolean enabled = ck.isEnabled();

		System.out.println(enabled);

		WebElement ck1 = box.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));

		WebElement ck2 = box.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));

		if (!ck1.isSelected()) {

			ck1.click();

		}

		if (ck2.isSelected()) {
			ck2.click();

		}

	}

}
