package com.jeeva.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectExam {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");

		WebDriver box = new ChromeDriver();

		box.navigate().to("http://leafground.com/pages/selectable.html");

		List<WebElement> all = box.findElements(By.xpath("//*[@id=\'selectable\']/li"));

		int opt = all.size();

		System.out.println(opt);

		Actions sc = new Actions(box);

		sc.clickAndHold(all.get(0));
		sc.clickAndHold(all.get(1));
		sc.clickAndHold(all.get(2));
		sc.clickAndHold(all.get(3));
		sc.clickAndHold(all.get(4));

		sc.keyDown(Keys.CONTROL).click(all.get(3)).click(all.get(4)).build().perform();

	}

}
