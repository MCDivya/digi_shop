package TestngBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencyTest {
@Test
	
	public void register() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Register");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test//(dependsOnMethods = "register" )
	
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test//(dependsOnMethods = "Login" )
	
	public void addToCart() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Add to Cart");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test//(dependsOnMethods = "addToCart" )
	
	public void payment() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Payment");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}

}
