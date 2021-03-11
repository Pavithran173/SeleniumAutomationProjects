package com.jeeva.org;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");

		WebElement uname = driver.findElement(By.xpath("//*[@id='username']"));
		uname.sendKeys("pavithran713");

		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		password.sendKeys("innovate");

		WebElement submit = driver.findElement(By.xpath("//*[@type='Submit']"));
		submit.click();

		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollby(0,100)");
		
		WebElement s = driver.findElement(By.xpath("//select[@name='location']"));
		Select sc = new Select(s);
		sc.selectByVisibleText("Adelaide");

		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select hotelsobj = new Select(hotels);
		hotelsobj.selectByIndex(1);

		WebElement room = driver.findElement(By.xpath("//*[@name='room_type']"));
		Select roomobj = new Select(room);
		roomobj.selectByValue("Super Deluxe");
		

		WebElement roomnos = driver.findElement(By.xpath("//*[@id='room_nos']"));
		Select roomnosobj = new Select(roomnos);
		roomnosobj.selectByVisibleText("1 - One");

		WebElement datepick = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		datepick.sendKeys("19/12/2020");

		WebElement datepickout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		datepickout.sendKeys("20/12/2020");

		WebElement adultroom = driver.findElement(By.xpath("//Select[@name='adult_room']"));
		Select adultroomobj = new Select(adultroom);
		adultroomobj.selectByValue("3");

		WebElement childroom = driver.findElement(By.xpath("//Select[@name='child_room']"));
		Select childroomobj = new Select(childroom);
		childroomobj.selectByValue("1");

		WebElement submit1 = driver.findElement(By.xpath("//input[@type='submit']"));
		submit1.click();

		WebElement select = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		select.click();

		WebElement continue1 = driver.findElement(By.xpath("//*[@name='continue']"));
		continue1.click();

		WebElement fn = driver.findElement(By.xpath("//*[@name='first_name']"));
		fn.sendKeys("Pavithran");

		WebElement ln = driver.findElement(By.xpath("//*[@name='last_name']"));
		ln.sendKeys("M U");

		WebElement msg = driver.findElement(By.xpath("//textarea[@name='address']"));
		msg.sendKeys("22, Rangan Street, Nagercoil");

		WebElement ccnum = driver.findElement(By.xpath("//input[@name='cc_num']"));
		ccnum.sendKeys("0987654321098765");

		WebElement d3 = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select d3data = new Select(d3);
		d3data.selectByVisibleText("Master Card");

		WebElement d4 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select d4data = new Select(d4);
		d4data.selectByVisibleText("March");

		WebElement d5 = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select d5data = new Select(d5);
		d5data.selectByVisibleText("2022");

		WebElement ccv1 = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		ccv1.sendKeys("4456");

		WebElement bkn = driver.findElement(By.xpath("//input[@name='book_now']"));
		bkn.click();
		
		Thread.sleep(10000);


		WebElement finalclick = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
		finalclick.click();

		WebElement cancellation = driver.findElement(By.xpath("//input[@name='check_all']"));
		cancellation.click();

		WebElement c3 = driver.findElement(By.xpath("//input[@name='cancelall']"));
		c3.click();
		
		Thread.sleep(3000);
		
	    
	    Alert ac = driver.switchTo().alert();
	    ac.dismiss();

	}

}
