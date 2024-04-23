package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		
		//maximize
		driver.manage().window().maximize();
		
		//navigate
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(4000);
		
		//click on frames
		
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(4000);
		
		//click on iframes
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		Thread.sleep(4000);
		
		//click on nested with multiple iframes link
		
		driver.findElement(By.linkText("Nested with Multiple iframe")).click();
		
		//Switch to login page
		
		driver.switchTo().frame(0);
		
		//Switch to Email text field
		driver.switchTo().frame(0);
		
		//enter email
		driver.findElement(By.id("email")).sendKeys("divya");
		
		String email=driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
		
		
		
		Thread.sleep(4000);
		
	}

}
