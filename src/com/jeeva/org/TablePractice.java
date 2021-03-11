package com.jeeva.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {
	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");

		List<WebElement> th = driver.findElements(By.tagName("th"));
		int noofcolumns = th.size();
		System.out.println(noofcolumns);

		List<WebElement> tr = driver.findElements(By.tagName("tr"));
		int noofrows = tr.size();
		System.out.println(noofrows);

		WebElement interact = driver
				.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));

		String ite = interact.getText();
		System.out.println(ite);

		List<WebElement> ss = driver.findElements(By.xpath("//td[2]"));
		List<Integer> newlist = new ArrayList<Integer>();

		for (WebElement individual : ss) {
			String pecv = individual.getText().replace("%","");
			newlist.add(Integer.parseInt(pecv));
		}
		System.out.println(newlist);
		
		Integer min = Collections.min(newlist);
		System.out.println(min);
		String minstring = Integer.toString(min) + "%";

		 String finalxpath2 = "//td[normalize-space()="+"\""+minstring+"\""+"]"+"//following::td[1]";
	      
		 System.out.println(finalxpath2);
	      
		 
	     WebElement result11 = driver.findElement(By.xpath(finalxpath2));	     
	     
	     result11.click();

	}

}
