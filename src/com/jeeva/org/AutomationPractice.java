package com.jeeva.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		WebElement signin = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		signin.click();
		driver.manage().window().maximize();

		Thread.sleep(10000);

		WebElement emailid = driver.findElement(By.xpath("//input[@name='email_create']"));
		emailid.sendKeys("qhy@email.com");
		WebElement crtacc = driver
				.findElement(By.xpath("//button[@class='btn btn-default button button-medium exclusive']"));
		crtacc.click();

		Thread.sleep(10000);
		WebElement gender = driver.findElement(By.name("id_gender"));
		gender.click();

		WebElement fn = driver.findElement(By.id("customer_firstname"));
		fn.sendKeys("Pavithran");

		WebElement ln = driver.findElement(By.id("customer_lastname"));
		ln.sendKeys("M U");

		WebElement em = driver.findElement(By.xpath("//input[@value='qhy1233@email.com']"));
		em.click();

		WebElement pw = driver.findElement(By.id("passwd"));
		pw.sendKeys("innovate");

		WebElement days = driver.findElement(By.xpath("//Select[@name='days']"));
		Select sc = new Select(days);
		sc.selectByValue("17");

		WebElement months = driver.findElement(By.xpath("//Select[@name='months']"));
		Select sc2 = new Select(months);
		sc2.selectByIndex(3);

		WebElement years = driver.findElement(By.xpath("//Select[@name='years']"));
		Select sc3 = new Select(years);
		sc3.selectByValue("1994");
		
		WebElement nl = driver.findElement(By.id("newsletter"));
		nl.click();
		WebElement opt = driver.findElement(By.name("optin"));
		opt.click();
		
		WebElement cmpn = driver.findElement(By.id("company"));
		cmpn.sendKeys("Techies Corner");
		
		
		WebElement ad1 = driver.findElement(By.id("address1"));
		ad1.sendKeys("22, RRj Street, pboxno-214, techies corner");
		
		WebElement ad2 = driver.findElement(By.id("address2"));
		ad2.sendKeys("RRj building, kk district-629001");
		
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Nagercoil");
		
		WebElement state = driver.findElement(By.name("id_state"));
		Select state1 = new Select(state);
		state1.selectByVisibleText("Arizona");
		
		WebElement poc = driver.findElement(By.name("postcode"));
		poc.sendKeys("62001");
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select countryobj = new Select(country);
		countryobj.selectByIndex(1);
		
		WebElement other = driver.findElement(By.xpath("//*[@id='other']"));
		other.sendKeys("NRI");
		
		WebElement mob1 = driver.findElement(By.xpath("//*[@id='phone']"));
		mob1.sendKeys("9876868908");
		
		WebElement mob2 = driver.findElement(By.xpath("//*[@id='phone_mobile']"));		
		mob2.sendKeys("9087897560");
		
		WebElement suba = driver.findElement(By.name("submitAccount"));
		suba.click();
		
		WebElement myprofileinfo = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span"));
        myprofileinfo.click();
        
        Thread.sleep(1000);
        
        WebElement mp1 = driver.findElement(By.name("old_passwd"));
        mp1.sendKeys("innovate");
        
        WebElement mp2 = driver.findElement(By.id("passwd"));
        mp2.sendKeys("innovate");
        
        WebElement mp3 = driver.findElement(By.id("confirmation"));
        mp3.sendKeys("innovate");
        
        WebElement sid = driver.findElement(By.name("submitIdentity"));
        sid.click();	
	}

}
