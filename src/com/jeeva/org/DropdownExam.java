package com.jeeva.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExam {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@multiple]"));
		Select sc = new Select(dropdown);
		sc.selectByIndex(1);
		sc.selectByIndex(2);
		sc.selectByVisibleText("UFT/QTP");
		
		List<WebElement> op = sc.getOptions();
		
		int size = op.size();
		
		
	    for(int i =0; i<size ; i++){
	    	  String op2 = op.get(i).getText();
	         System.out.println(op2);
	      }
		
	}

}
