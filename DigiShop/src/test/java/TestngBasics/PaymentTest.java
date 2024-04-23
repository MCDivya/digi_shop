package TestngBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PaymentTest {
	@Test(priority = 1)
	
	public void register() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Register");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(priority = 2)
	
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(priority = 3)
	
	public void addToCart() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Add to Cart");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(priority = 4)
	
	public void payment() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Payment");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	

}
