package com.jeeva.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cura {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

		WebElement headingbutton = driver.findElement(
				By.xpath("//h1[contains(text(),'CURA Healthcare Service')]//following::a[@id='btn-make-appointment']"));

		headingbutton.click();

		WebElement username = driver.findElement(By.id("txt-username"));
		username.sendKeys("John Doe");
		
		WebElement password = driver.findElement(By.id("txt-password"));
		password.sendKeys("ThisIsNotAPassword");
		
		WebElement button = driver.findElement(By.xpath("//button[contains(@class,'btn')]"));
		button.click();

		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.name("facility"));
		Select sc = new Select(dropdown);
		sc.selectByIndex(1);

		WebElement hospital = driver.findElement(By.id("chk_hospotal_readmission"));
		hospital.click();

		WebElement radioprogram = driver.findElement(By.id("radio_program_medicaid"));
		radioprogram.click();

		WebElement selectdate = driver.findElement(By.id("txt_visit_date"));
		selectdate.click();

		// WebElement next = driver.findElement(By.xpath("//th[@class='next']"));
		// next.click();

		WebElement calendar = driver.findElement(By.xpath("//th[text()='January 2021']//following::td[7]"));
		calendar.click();

		WebElement comments = driver.findElement(By.id("txt_comment"));
		comments.sendKeys("Please let me know the appointment time");

		WebElement bookappointment = driver.findElement(By.id("btn-book-appointment"));
		bookappointment.click();
		WebElement menutoggle = driver.findElement(By.id("menu-toggle"));
		menutoggle.click();
		WebElement profile = driver.findElement(By.xpath("//a[@href='profile.php#profile']"));
		profile.click();

		List<WebElement> icons = driver.findElements(By.tagName("i"));
		int totalnumberofitags = icons.size();
		System.out.println("The total number of i tags in the profile page is " + totalnumberofitags);

		WebElement fb = driver.findElement(By.xpath("//ul[@class='list-inline']/li[1]"));
		fb.click();
		Thread.sleep(3000);
		WebElement twitter = driver.findElement(By.xpath("//ul[@class='list-inline']/li[2]"));
		twitter.click();
		Thread.sleep(3000);
		WebElement dribble = driver.findElement(By.xpath("//ul[@class='list-inline']/li[3]"));
		dribble.click();
		Thread.sleep(3000);
		
		if (fb.isDisplayed()) {
			String title = driver.getTitle();
			System.out.println("The facebook link is selected the title name is follows"+title);
		}
		else {
			System.out.println("not selected");
		}
		

	}

}
