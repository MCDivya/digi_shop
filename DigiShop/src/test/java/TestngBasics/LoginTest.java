package TestngBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class LoginTest {
	@Test
	
	public void login_001() {
		WebDriver driver = new ChromeDriver();
		System.out.println("login_001");
		driver.manage().window().maximize();
		driver.quit();
		
	}
	
	@Test
	
	public void login_002() {
		WebDriver driver =new ChromeDriver();
		System.out.println("login-002");
		driver.manage().window().maximize();
		driver.quit();
		
	}
	

}
