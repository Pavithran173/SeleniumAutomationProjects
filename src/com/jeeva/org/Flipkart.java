package com.jeeva.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.flipkart.com/");

		WebElement un = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		un.sendKeys("Pavithran713@gmail.com");
		
		WebElement pw = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		pw.sendKeys("amazing@3M");
		
		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		
		Thread.sleep(5000);
		
		WebElement profilename = driver
				.findElement(By.xpath("//form[@class='_2M8cLY header-form-search']//following::div[3]"));

		String text = profilename.getText();
		
		System.out.println(text);

		WebElement sp = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		sp.sendKeys("mobiles");
		WebElement sr = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		sr.click();

		Thread.sleep(5000);

		WebElement sb = driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
		sb.sendKeys("poco");
		WebElement sel = driver.findElement(By.xpath("//input[@type='checkbox']//following::div[text()='POCO']"));
		sel.click();

		Thread.sleep(3000);
		WebElement mob = driver.findElement(By.xpath("//*[contains(text(),'POCO C3 (Lime Green, 64 GB)')]"));
		mob.click();

		Thread.sleep(10000);
		
		for(String winHandle : driver.getWindowHandles()){
		   driver.switchTo().window(winHandle);
		}
		WebElement cart = driver.findElement(By.xpath("//ul[@class='row']/li/button"));
		cart.click();

		driver.manage().window().maximize();
	}

}
