package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) throws InterruptedException{
		
		//launch browser
		
		WebDriver driver= new ChromeDriver();
		
		
		//maximize
		driver.manage().window().maximize();
		
		//navigate
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		Thread.sleep(4000);
		
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		
		driver.findElement(By.id("username")).sendKeys("Divya");
		Thread.sleep(4000);
		
		driver.findElement(By.id("password")).sendKeys("Password@123");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		
		
		
		
		

	}

}
