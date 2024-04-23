package TestngBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyGroupTest {

	
	@Test(groups = {"smaoke","FT"})
	
	public void register() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Reporter.log("Register",true);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(groups = "RT" )
	
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Reporter.log("Login",true);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(groups = "IT" )
	
	public void addToCart() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Reporter.log("Add to Cart",true);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(groups = "ST" )
	
	public void payment() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Reporter.log("Payment",true);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
}
