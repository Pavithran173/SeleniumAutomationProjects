package com.jeeva.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExam {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdrive.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");
		
		WebDriver page = new ChromeDriver();
		
		Thread.sleep(6000);
		
		page.get("https://www.instagram.com/");
		
		Thread.sleep(6000);
		
		WebElement form1 = page.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
		
		form1.sendKeys("7598718847");

		WebElement fomr2 = page.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
		
		fomr2.sendKeys("852456753159");
		
		
		
		WebElement type = page.findElement(By.xpath("//*[@id=\"login_link\"]/a[2]"));
		
		type.click();
		
		WebElement color = page.findElement(By.xpath("//*[@id=\"u_0_14\"]"));
		  
	   String cssValue = color.getCssValue("background-color");
		  
		System.out.println(cssValue);
		
		 WebElement size = page.findElement(By.xpath("//*[@id=\\\"u_0_14\\\"]"));
	      int width = size.getSize().getWidth();
		  
		  int height = size.getSize().getHeight();
		  
		  System.out.println("size : width = " +  width + "Height ="+ height );
		
		
		
		
	   
	 
	  
	 
	  
	}

}
