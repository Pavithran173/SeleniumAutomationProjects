package com.jeeva.org;

import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPracticeShopping {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Auto\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();
		WebElement signin = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		signin.click();

		Thread.sleep(3000);

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("qhy@email.com");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("innovate");
		WebElement submitbutton = driver.findElement(By.id("SubmitLogin"));
		submitbutton.click();
		Thread.sleep(3000);
		WebElement dresses = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		dresses.click();

		WebElement casual = driver.findElement(By.xpath("//ul[@class='tree dynamized']/li"));
		casual.click();
		WebElement size = driver.findElement(By.id("layered_id_attribute_group_1"));
		size.click();
		WebElement styles = driver.findElement(By.id("layered_id_feature_13"));
		styles.click();
		WebElement manufacturer = driver.findElement(By.id("layered_manufacturer_1"));
		manufacturer.click();

		Thread.sleep(3000);
		
		Actions action = new Actions(driver);

		WebElement box1 = driver.findElement(By.xpath("//*[@title='Printed Dress']"));

		action.moveToElement(box1).perform();

		/*WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		addtocart.click();
		System.out.println("Add to cart button is selected");

		

		Thread.sleep(10000);

		WebElement dresssize = driver.findElement(By.id("layer_cart_product_attributes"));
		String ds = dresssize.getText();

		WebElement proceedtocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']/span"));
		proceedtocheckout.click();


		WebElement desc = driver.findElement(By.xpath("//*[@id=\"product_3_13_0_422662\"]/td[2]/small[2]"));
		String desc1 = desc.getText();
		if (desc1.contains("Size : S")) {
			System.out.println("The size is matched ");
		} else {
			System.out.println("The size is not matched");
			driver.close();

		}
		WebElement stock = driver.findElement(By.xpath("//*[@id=\"product_3_13_0_422662\"]/td[3]/span"));
		String stk = stock.getText();
		if (stk.contains("In stock")) {
			System.out.println("The stock is available");
		}else {
			System.out.println("The stock is not available");
			driver.close();
		}
		
		WebElement unitprice = driver.findElement(By.xpath("//span[@id='product_price_3_13_422662']/span"));
		String up = unitprice.getText();
		if (up.contains("$26.00")) {
			System.out.println("The price is matched");
		}else {
			System.out.println("The price is not matched");
			driver.close();
		}
		
		
		WebElement pcko = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		pcko.click();
		
		WebElement billingaddress = driver.findElement(By.xpath("//ul[@id='address_invoice']/li[4]"));
		String ba = billingaddress.getText();
		if (ba.contentEquals("22, RRj Street, pboxno-214, techies corner RRj building, kk district-629001")) {
			System.out.println("The entered billing address is correct");
		}else
		{
			System.out.println("Address is not valid");
			driver.close();
		}
		
		WebElement proceed1 = driver.findElement(By.xpath("//button[@name='processAddress']/span"));
		proceed1.click();
		WebElement shippingcharge = driver.findElement(By.id("cgv"));
		shippingcharge.click();
		WebElement proceed2 = driver.findElement(By.xpath("//button[@name='processCarrier']/span"));
		proceed2.click();
		Thread.sleep(7000);
		driver.close();*/
	}

}
