package com.jeeva.org;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragExam {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://leafground.com/pages/mouseOver.html");

	
		
		Actions actions = new Actions(driver);
		WebElement ss = driver.findElement(By.linkText("TestLeaf Courses"));
		actions.moveToElement(ss).perform();
		
		
		
		WebElement dsf = driver.findElement(By.xpath("//div[@class='container in']/ul/li/ul/li[1]"));
	    dsf.click();

	    Alert alert= driver.switchTo().alert();
	    
	    
	    
	   String sto = alert.getText();
	    
	    System.out.println(sto);
	    
	    alert.accept();
	}
	

}
